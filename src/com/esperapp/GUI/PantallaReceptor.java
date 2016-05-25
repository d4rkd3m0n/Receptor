/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esperapp.GUI;

import com.esperapp.metodos.Receptor;
import com.esperapp.ws.Turno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joako
 */
public class PantallaReceptor extends javax.swing.JFrame {

    /**
     * Creates new form Receptor
     */
    
    public PantallaReceptor() {
        
        initComponents();
       
        this.jTextFieldCedula.setVisible(false);
        this.jTextFieldTurno.setVisible(false);
        this.jTextFieldIDSede.setVisible(false);
        this.jTextFieldEstado.setText("Libre");
        Primera();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CerrarSesionButton = new javax.swing.JButton();
        EstadoButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TurnoActual = new javax.swing.JTextArea();
        jButtonActualizar = new javax.swing.JButton();
        jTextFieldCedula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldEstado = new javax.swing.JTextField();
        jTextFieldTurno = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableTurnosN = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("MENU PRINCIPAL");

        CerrarSesionButton.setText("Cerrar Sesion");
        CerrarSesionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionButtonActionPerformed(evt);
            }
        });

        EstadoButton.setText("Marcar como atendido");
        EstadoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadoButtonActionPerformed(evt);
            }
        });

        TurnoActual.setEditable(false);
        TurnoActual.setColumns(20);
        TurnoActual.setRows(5);
        jScrollPane1.setViewportView(TurnoActual);

        jButtonActualizar.setText("Pedir Turno");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jTextFieldCedula.setEditable(false);

        jLabel2.setText("Estado: ");

        jTextFieldEstado.setEditable(false);
        jTextFieldEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstadoActionPerformed(evt);
            }
        });

        jTextFieldTurno.setEditable(false);

        jTableTurnosN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableTurnosN);

        jTextFieldIDSede.setEditable(false);
        jTextFieldIDSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDSedeActionPerformed(evt);
            }
        });

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(351, 351, 351))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(CerrarSesionButton)
                        .addGap(86, 86, 86)
                        .addComponent(jButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(EstadoButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addComponent(jTextFieldIDSede, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(80, 80, 80))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldIDSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EstadoButton)
                    .addComponent(CerrarSesionButton)
                    .addComponent(jButtonActualizar))
                .addContainerGap(130, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EstadoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadoButtonActionPerformed
        Receptor r = new Receptor();
        String respuesta = null;
        if(!jTextFieldTurno.equals(null)){
            respuesta=r.RegistrarComoAtendido(jTextFieldTurno.getText(), this.jTextFieldIDSede.getText());
            if(respuesta.equals("0")){
                this.jTextFieldEstado.setText("Libre");
                
            }
            this.jTextFieldEstado.updateUI();
        }
        List<Turno> turnosNN=r.TurnosNoAtendidos(this.jTextFieldIDSede.getText());
        LlenarTabla(turnosNN);
        this.jTableTurnosN.updateUI();
        this.jTextFieldTurno.setText(" ");
        this.jTextFieldTurno.updateUI();
    }//GEN-LAST:event_EstadoButtonActionPerformed

    private void CerrarSesionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionButtonActionPerformed
        login l = new login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CerrarSesionButtonActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        // TODO add your handling code here:
        Receptor r = new Receptor();
        String cedulaEmp = this.jTextFieldCedula.getText();
        String idSede = this.jTextFieldIDSede.getText();
        List<String> t ;
        System.out.println("idsede "+idSede);
        t = r.LlenarTextField(cedulaEmp, idSede);
        String total = new String();
        
        if(t.size()!=0){
            total = "Atendiendo el turno: "+t.get(0)+" del usuario: "+t.get(1)+" con correo: "+t.get(2);
            jTextFieldTurno.setText(t.get(0));
            this.TurnoActual.setText(total);
            this.jTextFieldEstado.setText("Ocupado");
            this.TurnoActual.updateUI();
            
        }else{
            JOptionPane.showMessageDialog(null, "No hay turnos sin atender");        
        }
        
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jTextFieldEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEstadoActionPerformed

    private void jTextFieldIDSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDSedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDSedeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Primera();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaReceptor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaReceptor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaReceptor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaReceptor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaReceptor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CerrarSesionButton;
    private javax.swing.JButton EstadoButton;
    private javax.swing.JTextArea TurnoActual;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableTurnosN;
    public javax.swing.JTextField jTextFieldCedula;
    private javax.swing.JTextField jTextFieldEstado;
    public final javax.swing.JTextField jTextFieldIDSede = new javax.swing.JTextField();
    private javax.swing.JTextField jTextFieldTurno;
    // End of variables declaration//GEN-END:variables

    private void LlenarTabla(List<Turno> turnosN) {
        Iterator <Turno> TurnosIt = turnosN.iterator();
        Turno t = new Turno();
        String [ ] datos = new String[3];
        DefaultTableModel Model = new DefaultTableModel();
        Model.addColumn("Id Turno");
        Model.addColumn("Fecha");
        Model.addColumn("Id Servicio");
        Model.addColumn("Usuario");
        System.out.println("tam "+turnosN.size());
        while(TurnosIt.hasNext()){
            t=TurnosIt.next();
            datos[0]=t.getIdTurno();
            datos[1]=t.getFecha().toString();
            datos[2]=t.getServicioID().getTipo();
            //String us = t.getUsuario().getNombre();
            //datos[3]=us;
            Model.addRow(datos);
        }
        this.jTableTurnosN.setModel(Model);
    }

    public void Primera() {
        Receptor r = new Receptor();
        String idS = this.jTextFieldIDSede.getText();
        System.out.println("ids"+idS);
        List<Turno> turnosN=r.TurnosNoAtendidos(idS);
        LlenarTabla(turnosN);
        this.jTableTurnosN.updateUI();
    }
}
