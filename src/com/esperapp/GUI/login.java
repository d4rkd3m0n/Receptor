/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esperapp.GUI;

import com.esperapp.metodos.Receptor;
import com.esperapp.ws.Entidad;
import com.esperapp.ws.Sede;
import static java.awt.PageAttributes.MediaType.D;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Joako
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CedulaJText = new javax.swing.JTextField();
        IngresarButton = new javax.swing.JButton();
        contrasenaJText = new javax.swing.JPasswordField();
        jComboBoxSedes = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNit = new javax.swing.JTextField();
        jButtonMostrarSedes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("LOGIN");

        jLabel2.setText("Cedula");

        jLabel3.setText("Contrasena");

        IngresarButton.setText("Ingresar");
        IngresarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarButtonActionPerformed(evt);
            }
        });

        contrasenaJText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasenaJTextActionPerformed(evt);
            }
        });

        jComboBoxSedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSedesActionPerformed(evt);
            }
        });

        jLabel4.setText("Sede");

        jLabel5.setText("Nit de la entidad");

        jButtonMostrarSedes.setText("Mostrar sedes");
        jButtonMostrarSedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarSedesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(CedulaJText, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(jComboBoxSedes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(contrasenaJText))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldNit, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonMostrarSedes)))))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(IngresarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CedulaJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(contrasenaJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMostrarSedes))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxSedes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(4, 4, 4)
                .addComponent(IngresarButton)
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarButtonActionPerformed
        String contrasena = new String();
        
        String cedula = new String();
        cedula = this.CedulaJText.getText();
        char [] aux = this.contrasenaJText.getPassword();
        contrasena = new String(aux);
        Receptor r = new Receptor();
        String auxCombo;
        auxCombo = this.jComboBoxSedes.getSelectedItem().toString();
        String[] idSede;
        idSede = auxCombo.split("-");
        
        String sed = new String();
        sed = idSede[1]; 
        sed=sed.replaceAll("\\s+","");
        if(r.login(cedula, contrasena, sed)){
            PantallaReceptor pr = new PantallaReceptor();
            //pr.idSede = idSede;
            pr.jTextFieldCedula.setText(cedula);
            pr.jTextFieldIDSede.setText(sed);
            System.out.println("sed jt"+pr.jTextFieldIDSede.getText());
            pr.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null ,"Login invalido" );
        }
        
    }//GEN-LAST:event_IngresarButtonActionPerformed

    private void contrasenaJTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasenaJTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contrasenaJTextActionPerformed

    private void jButtonMostrarSedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarSedesActionPerformed
        // TODO add your handling code here:
        Receptor r = new Receptor();
        String Nit = jTextFieldNit.getText();
        List<Sede> aux = r.LlenarComboBox(Nit);
        String nombreE = r.buscarNombreEntidadXNit(Nit);
        if(!aux.equals(null)){
            jComboBoxSedes.removeAllItems();
            LlenarCombo(aux, nombreE);
        }else{
            JOptionPane.showMessageDialog(null, "No hay sedes asociadas al nit");
        }
        this.jComboBoxSedes.updateUI();
    }//GEN-LAST:event_jButtonMostrarSedesActionPerformed

    private void jComboBoxSedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSedesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSedesActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CedulaJText;
    private javax.swing.JButton IngresarButton;
    private javax.swing.JPasswordField contrasenaJText;
    private javax.swing.JButton jButtonMostrarSedes;
    private javax.swing.JComboBox<String> jComboBoxSedes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextFieldNit;
    // End of variables declaration//GEN-END:variables

    private void LlenarCombo(List<Sede> e, String nombre) {
        List<Sede> sede = e;
        Sede s = new Sede();
        Receptor r = new Receptor();
        
        Iterator<Sede> It = sede.iterator();
        if(!s.equals(null)){
            while(It.hasNext()){
                s = It.next();
                //System.out.println("item "+s.getIDSede()+" "+s.getNombre());
                String item = nombre+" - "+s.getIDSede()+" - "+s.getNombre();
                //System.out.println(s);
                jComboBoxSedes.addItem(item);
            }
        }else{
            System.out.println("no carga");
        }
    }
}
