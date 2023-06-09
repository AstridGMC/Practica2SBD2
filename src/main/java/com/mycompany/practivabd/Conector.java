/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practivabd;

import Frontend.Principal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author astrid
 */
public class Conector {

    public static String url = "jdbc:mysql://localhost:3306/Practica2SDB";
    public static String usuario = "root";
    public static String contraseña = "Astrid.123";

    public static Connection conectar() {
        Connection connectio = null;
        try {
            Connection connection = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conectado!!");
            //System.out.println(tabla(connection)[0]);
            //System.out.println(connection);
            return connection;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return connectio;
        }

    }

    // tipo: 1=incremetno 2=decremento
    public static void CambiarValor(int valor, int tipo) {

        try {
            Connection conn = conectar();
            String query = "update Movimiento set campoIncremento = ?";
            PreparedStatement preparedStmt;
            preparedStmt = conn.prepareStatement(query);
            int valorTabla = Integer.parseInt(Tabla(conn));
            if (tipo == 1) {//incremento
                preparedStmt.setInt(1, valorTabla + valor);
                preparedStmt.executeUpdate();
                Principal.textResumen.append("  Sumando\n");
                Principal.txtValorT.setText(String.valueOf(valorTabla + valor));
            } else if (tipo == 2) {//decremento
                preparedStmt.setInt(1, valorTabla - valor);
                preparedStmt.executeUpdate();
                Principal.textResumen.append("  Restando\n");
                Principal.txtValorT.setText(String.valueOf(valorTabla - valor));
            } else {
                preparedStmt.setInt(1, valor);
                preparedStmt.executeUpdate();
            }

        } catch (SQLException ex) {
            Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void CambiarValor(int valor, int tipo, Connection conn) {

        try {
            PreparedStatement preparedStmt;
            if (tipo == 1) {//incremento
                String query = "update Movimiento set campoIncremento = campoIncremento + ?";
                preparedStmt = conn.prepareStatement(query);
                preparedStmt.setInt(1, valor);
                preparedStmt.executeUpdate();
                Principal.textResumen.append("  Sumando\n");
                Principal.txtValorT.setText(Tabla(conn));
                //System.out.println("Sumando");
            } else if (tipo == 2) {//decremento
                String query = "update Movimiento set campoIncremento = campoIncremento - ?";
                preparedStmt = conn.prepareStatement(query);
                
                preparedStmt.setInt(1, valor);
                preparedStmt.executeUpdate();
                //System.out.println("Restando");
                Principal.textResumen.append("  Restando\n");
                Principal.txtValorT.setText(Tabla(conn));
            } else {
                String query = "update Movimiento set campoIncremento = ?";
                preparedStmt = conn.prepareStatement(query);
                
                preparedStmt.setInt(1, valor);
                preparedStmt.executeUpdate();
            }

        } catch (SQLException ex) {
            Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void Bloquear(Connection conn) {
        try {
            conn.createStatement().execute("LOCK TABLES Movimiento WRITE;");
            System.out.println("bloqueado");
        } catch (SQLException ex) {
            Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void CambiarValorLock(int valor, int tipo, Connection conn) {

        try {
            conn.createStatement().execute("LOCK TABLES Movimiento WRITE;");
            System.out.println("----------bloqueo-----");
            String query = "update Movimiento set campoIncremento = ?";
            PreparedStatement preparedStmt;
            preparedStmt = conn.prepareStatement(query);
            int valorTabla = Integer.parseInt(Tabla(conn));
            if (tipo == 1) {//incremento
                preparedStmt.setInt(1, Integer.parseInt(Tabla(conn)) + valor);
                preparedStmt.executeUpdate();
                //System.out.println("Sumando");
                Principal.textResumen.append("  Sumando\n");
                Principal.txtValorT.setText(Tabla(conn));
            } else if (tipo == 2) {//decremento
                preparedStmt.setInt(1, Integer.parseInt(Tabla(conn)) - valor);
                preparedStmt.executeUpdate();
                //System.out.println("restando");
                Principal.textResumen.append("  Restando\n");
                Principal.txtValorT.setText(Tabla(conn));
            } else {
                preparedStmt.setInt(1, valor);
                preparedStmt.executeUpdate();
            }
            System.out.println("----------desbloqueo-----");
            conn.createStatement().execute("UNLOCK TABLES");

        } catch (SQLException ex) {
            Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static String Tabla(Connection connection) {

        PreparedStatement pst = null;
        ResultSet rs = null;
        ArrayList<String> infoTabla = new ArrayList();
        try {
            pst = connection.prepareStatement("select * from Movimiento ");
            rs = pst.executeQuery();
            while (rs.next()) {
                infoTabla.add(rs.getString("campoIncremento"));
            }
            return infoTabla.get(0);
        } catch (SQLException ex) {
            Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
        }

        return "0";
    }

    static String[] convertirArreglo(ArrayList<String> arreglo) {
        String[] nuevoArreglo = new String[arreglo.size()];
        for (int i = 0; i < arreglo.size(); i++) {
            nuevoArreglo[i] = arreglo.get(i);
            //System.out.println(arreglo.get(i));
        }
        return nuevoArreglo;
    }

}
