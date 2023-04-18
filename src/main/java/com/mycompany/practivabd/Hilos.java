/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practivabd;

import Frontend.Principal;
import static com.mycompany.practivabd.Conector.Tabla;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author astrid
 */
public class Hilos {

    public void HiloIncremento(Connection conn, int valor, long tiempo, long sleep, boolean bloqueo) {
        long t0 = System.nanoTime();
        Runnable runnable = () -> {
            while ((System.nanoTime() - t0) / 1000000000 <= tiempo) {
                Connection con = Conector.conectar();
                try {
                    if (bloqueo == true) {
                        Conector.CambiarValorLock(valor, 1, con);
                    } else {
                        Conector.CambiarValor(valor, 1, con);
                   
                    }
                    con.close();
                    Thread.sleep(sleep);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (SQLException ex) {
                    Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            JOptionPane.showMessageDialog(null, "Hilo Incremento terminado");

        };
        Thread hilo = new Thread(runnable);
        hilo.start();
    }

    public void HiloDecremento(Connection conn, int valor, long tiempo, long sleep, boolean bloqueo) {
        long t0 = System.nanoTime();
        Runnable runnable = () -> {
            while ((System.nanoTime() - t0) / 1000000000 <= tiempo) {
                Connection con = Conector.conectar();
                try {
                    if (bloqueo == true) {
                        Conector.CambiarValorLock(valor, 2, con);
                    } else {
                        Conector.CambiarValor(valor, 2, con);
                    }
                    con.close();
                    Thread.sleep(sleep);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (SQLException ex) {
                    Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
             Principal.textResumen.append(Tabla(conn));
            JOptionPane.showMessageDialog(null, "Hilo Decremento terminado");
        };
        Thread hilo = new Thread(runnable);
        hilo.start();

    }

}
