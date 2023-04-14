/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practivabd;

import Frontend.Principal;
import java.sql.Connection;
import javax.swing.JOptionPane;


/**
 *
 * @author astrid
 */
public class Hilos {

    public void HiloIncremento(Connection conn,int valor, long tiempo, long sleep, boolean bloqueo) {
        long t0 = System.nanoTime();
        Runnable runnable = () -> {
            while ((System.nanoTime() - t0) / 1000000000 <= tiempo) {
                try {
                    
                    if(bloqueo==true){
                        Conector.CambiarValorLock(valor, 1,conn);
                    }else{
                        Conector.CambiarValor(valor, 1,conn);
                    }
                    Principal.textResumen.append("  sumando\n");
                    System.out.println("sumando");
                    Principal.i=Principal.i+1;
                    Thread.sleep(sleep);
                } catch (InterruptedException e) {
                    e.printStackTrace();
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
                try {
                    Thread.sleep(sleep);
                    if(bloqueo==true){
                    Conector.CambiarValorLock(valor, 2, conn);
                    }else{
                        Conector.CambiarValor(valor, 2, conn);
                    }
                    Principal.textResumen.append("  Restando\n");
                    System.out.println("restando");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            JOptionPane.showMessageDialog(null, "Hilo Decremento terminado");
        };
        Thread hilo = new Thread(runnable);
        hilo.start();
        
    }
    
    
    
}
