/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas.de.menu.anubis.clientes;

import conexion.bd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author braya
 */
public class Registrar_clientes extends javax.swing.JFrame {
    public int ins_dat_clientes = 0;
    /**
     * Creates new form Registrar_clientes
     */
    public Registrar_clientes() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOMBRE ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jTextField2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 140, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("IDENTIFICACION ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, -1, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 230, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("EMAIL ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jTextField4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 200, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TELEFONO ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, -1));

        jTextField5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 230, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("FECHA DE NACIMIENTO ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, -1, -1));

        jTextField7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 230, 30));

        jTextField9.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 180, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DIRRECION ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pantallas/de/menu/anubis/imagenes_para_informacion_de_empleados/salvar.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 70, 70));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantalla/login/anubis/boton-x.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 70, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantalla/de/carga/img/7jQpLf.jpg"))); // NOI18N
        jLabel1.setMinimumSize(new java.awt.Dimension(690, 370));
        jLabel1.setPreferredSize(new java.awt.Dimension(690, 370));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        Registro_categoria();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

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
            java.util.logging.Logger.getLogger(Registrar_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Registrar_clientes().setVisible(true);
        });
    }
    
    public void Registro_categoria(){
        String nombre = jTextField2.getText();
        String correo = jTextField4.getText();
        String telefono = jTextField5.getText();
        String dirrecion = jTextField9.getText();
        String fecha_nacimiento = jTextField7.getText(); 
        if(nombre.equals("") || jTextField3.getText().equals("") || correo.equals("") || telefono.equals("") || dirrecion.equals("") || fecha_nacimiento.equals("")){
            JOptionPane.showMessageDialog(rootPane, "ERROR AL REGISTRAR UN CLIENTE EN EL SITEMA ANUBIS DE LA EMPRESA TECNOSOLUCIONES VERIFICAR QUE LOS CAMPOS INGRESADOS NO ESTEN VACIOS");
        }else{
            int identificacion  = Integer.parseInt(jTextField3.getText());
            conexion.bd cbd = new bd();
            cbd.setServidor("jdbc:mysql://localhost/sistema_pos_anubis");
            cbd.setUsuario("root");
            cbd.setContrasena("");
            Connection con = cbd.getConexion();
            PreparedStatement pst;
            try {
                pst = con.prepareStatement("INSERT INTO clientes(nombre, identificacion, email, telefono, dirrecion, fechadenacimiento, totaldecompras, ultimacompra, ingresoalsistema,credito) VALUES (?,?,?,?,?,?,?,?,?,?)");
                pst.setString(1, nombre);
                pst.setInt(2, identificacion);
                pst.setString(3, correo);
                pst.setString(4, telefono);
                pst.setString(5, dirrecion);
                pst.setString(6, fecha_nacimiento);
                pst.setInt(7, 0);
                pst.setString(8, LocalDate.now().format(DateTimeFormatter.ISO_DATE));
                pst.setString(9, LocalDate.now().format(DateTimeFormatter.ISO_DATE));
                pst.setString(10, "0");
                pst.executeUpdate();
                ins_dat_clientes = 1;
                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(Registrar_clientes.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField3;
    public javax.swing.JTextField jTextField4;
    public javax.swing.JTextField jTextField5;
    public javax.swing.JTextField jTextField7;
    public javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
