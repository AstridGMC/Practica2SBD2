package Frontend;

import com.mycompany.practivabd.Conector;
import com.mycompany.practivabd.Hilos;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author astrid
 */
public class Principal extends javax.swing.JFrame {

    public static int i = -1;
    static int incremento = 1;
    static int decremento = 2;
    static long tiempoH1 = 2000;
    static long tiempoH2 = 2000;
    static int tiempoEjecucion = 10;
    static int valorInicial = 2;
    /**
     * Creates new form Principal
     */
    Connection conn;

    public Principal() {
        initComponents();
        conn = Conector.conectar();
        txtValorT.setText(Conector.Tabla(conn));
        actualizarInfo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtValorT = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        textResumen = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblIncremento = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblDecremento = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblIntervalo2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblTiempoEjecucion1 = new javax.swing.JLabel();
        lblIntervalo1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        btnLock = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnConf = new javax.swing.JMenu();
        btnIntervalos = new javax.swing.JMenuItem();
        btnValores = new javax.swing.JMenuItem();
        btnGeneral = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Práctica Transacciones, Concurrencia y Bloqueos ");
        setBackground(new java.awt.Color(255, 204, 255));

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));

        jLabel1.setFont(new java.awt.Font("Kalimati", 0, 24)); // NOI18N
        jLabel1.setText("VALOR TABLA MOVIMIENTO:");

        txtValorT.setFont(new java.awt.Font("Liberation Sans", 0, 48)); // NOI18N
        txtValorT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnIniciar.setBackground(new java.awt.Color(0, 102, 102));
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("Iniciar Prueba");
        btnIniciar.setAutoscrolls(true);
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(102, 255, 204));
        btnActualizar.setIcon(new javax.swing.ImageIcon("/home/astrid/Descargas/recargar.png")); // NOI18N
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(0, 51, 51));

        textResumen.setEditable(false);
        textResumen.setColumns(20);
        textResumen.setRows(5);
        textResumen.setDropMode(javax.swing.DropMode.INSERT);
        jScrollPane1.setViewportView(textResumen);

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel2.setText("Confiuguracion Actual:");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel3.setText("Valor Incremento:");

        lblIncremento.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel4.setText("Valor Decremento:");

        lblDecremento.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel5.setText("Tiempo de Ejecucuion:");

        lblIntervalo2.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel6.setText("Intervalo Hilo1:");

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel7.setText("Intervalo Hilo2:");

        lblTiempoEjecucion1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        lblIntervalo1.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N

        jSeparator3.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator3.setForeground(new java.awt.Color(0, 51, 51));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setVerifyInputWhenFocusTarget(false);

        btnLock.setText("Bloquear");
        btnLock.setToolTipText("");
        btnLock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLockActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel8.setText("Tablas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblTiempoEjecucion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblIntervalo1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblIntervalo2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblIncremento, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(70, 70, 70)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblDecremento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(34, 34, 34))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(93, 93, 93))
            .addComponent(txtValorT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnActualizar)
                .addGap(133, 133, 133)
                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 153, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLock, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(46, 46, 46))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblIncremento, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(lblDecremento, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblIntervalo2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblIntervalo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTiempoEjecucion1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7))))
                    .addComponent(jSeparator3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(txtValorT, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnLock)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8))
                            .addComponent(btnIniciar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnActualizar))
                .addGap(20, 20, 20))
        );

        txtValorT.getAccessibleContext().setAccessibleName("public static");

        jMenuBar1.setBackground(new java.awt.Color(0, 102, 102));
        jMenuBar1.setFocusTraversalPolicyProvider(true);

        btnConf.setBackground(new java.awt.Color(0, 102, 102));
        btnConf.setForeground(new java.awt.Color(255, 255, 255));
        btnConf.setText("Configuracion ");
        btnConf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfMouseClicked(evt);
            }
        });

        btnIntervalos.setText("Intervalos");
        btnIntervalos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntervalosActionPerformed(evt);
            }
        });
        btnConf.add(btnIntervalos);

        btnValores.setText("Valores");
        btnValores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValoresActionPerformed(evt);
            }
        });
        btnConf.add(btnValores);

        btnGeneral.setText("General");
        btnGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeneralActionPerformed(evt);
            }
        });
        btnConf.add(btnGeneral);

        jMenuBar1.add(btnConf);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        if (btnLock.isSelected()) {
            Principal.textResumen.append("\n----" + "CON BLOQUEO" + "----\n"
                    + " incrementando " + incremento
                    + " Decrementando " + decremento
                    + "\nVALOR INICIO: " + Conector.Tabla(conn) + "\n");
        } else {
            Principal.textResumen.append("\n----" + "SIN BLOQUEO" + "----\n"
                    + " incrementando " + incremento
                    + " Decrementando " + decremento
                    + "\nVALOR INICIO: " + Conector.Tabla(conn) + "\n");
        }
        Hilos hilos = new Hilos();
        if (btnLock.isSelected()) {
            hilos.HiloIncremento(conn, incremento, tiempoEjecucion, tiempoH1, true);
            hilos.HiloDecremento(conn, decremento, tiempoEjecucion, tiempoH2, true);

        } else {
            hilos.HiloIncremento(conn, incremento, tiempoEjecucion, tiempoH1, false);
            hilos.HiloDecremento(conn, decremento, tiempoEjecucion, tiempoH2, false);
        }

    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnConfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfMouseClicked
    }//GEN-LAST:event_btnConfMouseClicked
    private void btnGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeneralActionPerformed
        General general;
        try {
            general = new General(new javax.swing.JFrame(), true);
            general.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        txtValorT.setText(Conector.Tabla(conn));
        actualizarInfo();
    }//GEN-LAST:event_btnGeneralActionPerformed

    private void btnIntervalosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIntervalosActionPerformed
        TiempoIntervalos intervalos = new TiempoIntervalos(new javax.swing.JFrame(), true);
        intervalos.setVisible(true);
        actualizarInfo();
    }//GEN-LAST:event_btnIntervalosActionPerformed

    private void btnValoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValoresActionPerformed
        Valores valoresD = new Valores(new javax.swing.JFrame(), true);
        valoresD.setVisible(true);
        actualizarInfo();
    }//GEN-LAST:event_btnValoresActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        Conector.CambiarValor(1, 1, Conector.conectar());
        txtValorT.setText(Conector.Tabla(conn));

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnLockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLockActionPerformed
        if (btnLock.isSelected()) {
            btnLock.setText("Desbloquear");
        } else {
            btnLock.setText("Bloquear");
        }
    }//GEN-LAST:event_btnLockActionPerformed

    void actualizarInfo() {
        lblIncremento.setText(String.valueOf(incremento));
        lblDecremento.setText(String.valueOf(decremento));
        double i = (double) tiempoH1 / 1000;
        double o = (double) tiempoH2 / 1000;
        lblIntervalo1.setText(String.valueOf(i) + " seg");
        lblIntervalo2.setText(String.valueOf(o) + " seg");
        lblTiempoEjecucion1.setText(String.valueOf(tiempoEjecucion) + " seg");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JMenu btnConf;
    private javax.swing.JMenuItem btnGeneral;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JMenuItem btnIntervalos;
    private javax.swing.JToggleButton btnLock;
    private javax.swing.JMenuItem btnValores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblDecremento;
    private javax.swing.JLabel lblIncremento;
    private javax.swing.JLabel lblIntervalo1;
    private javax.swing.JLabel lblIntervalo2;
    private javax.swing.JLabel lblTiempoEjecucion1;
    public static javax.swing.JTextArea textResumen;
    public static javax.swing.JLabel txtValorT;
    // End of variables declaration//GEN-END:variables

}
