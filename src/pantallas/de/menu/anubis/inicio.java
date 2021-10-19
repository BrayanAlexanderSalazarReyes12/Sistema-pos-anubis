/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas.de.menu.anubis;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.plaf.basic.BasicMenuBarUI;
import pantallas.de.menu.anubis.Inventario.Inventario;
import pantallas.de.menu.anubis.categorias.Categoria;
import pantallas.de.menu.anubis.clientes.Clientes;

/**
 *
 * @author braya
 */
public class inicio extends javax.swing.JFrame {
    Empleados_menu em;
    Categoria ctg;
    Inventario ivt;
    Clientes cli;
    int ventana_empleados = 0;
    int ventana_categoria = 0;
    int ventana_inventario = 0;
    int ventana_clientes = 0;
    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension d = tk.getScreenSize();
    private String nombre_usuario;
    Registrar_empleados re = new Registrar_empleados();
    /**
     * Creates new form inicio
     */
    public inicio() {
        try {
            this.em = new Empleados_menu();
            this.ctg = new Categoria();
            this.ivt = new Inventario();
            this.cli = new Clientes();
        } catch (SQLException ex) {
            Logger.getLogger(inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jMenuBar1.setUI(new BasicMenuBarUI(){});
        jMenuBar1.setBackground(Color.ORANGE);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        logo = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        Cuenta = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(jDesktopPane1);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 0));
        jMenuBar1.setBorder(null);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantalla/de/carga/img/Anubis_50_50.png"))); // NOI18N
        logo.setText("SISTEMA POS ANUBIS");
        logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoMouseClicked(evt);
            }
        });
        jMenuBar1.add(logo);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantalla/iconos/inicio/anubis/empleados.png"))); // NOI18N
        jMenu2.setText("EMPLEADOS");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantalla/iconos/inicio/anubis/menu.png"))); // NOI18N
        jMenu3.setText("CATEGORIA");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantalla/iconos/inicio/anubis/caja.png"))); // NOI18N
        jMenu4.setText("INVENTARIO");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantalla/iconos/inicio/anubis/comunidad.png"))); // NOI18N
        jMenu5.setText("CLIENTE");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantalla/iconos/inicio/anubis/ventas.png"))); // NOI18N
        jMenu6.setText("VENTAS");

        jMenuItem1.setBackground(new java.awt.Color(255, 204, 0));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantalla/iconos/inicio/anubis/negocios-y-finanzas.png"))); // NOI18N
        jMenuItem1.setText("ADMINISTRAR VENTAS");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantalla/iconos/inicio/anubis/bolsa-de-la-compra.png"))); // NOI18N
        jMenuItem2.setText("CREAR VENTAS");
        jMenu6.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantalla/iconos/inicio/anubis/ganancia.png"))); // NOI18N
        jMenuItem3.setText("REPORTE DE VENTAS");
        jMenu6.add(jMenuItem3);

        jMenuBar1.add(jMenu6);

        Cuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantalla/iconos/inicio/anubis/perfil.png"))); // NOI18N
        Cuenta.setText("CUENTA");

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantalla/iconos/inicio/anubis/salida.png"))); // NOI18N
        jMenu8.setText("SALIR");
        Cuenta.add(jMenu8);

        jMenuBar1.add(Cuenta);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        if(ventana_empleados == 0)
        {
            if(ventana_categoria==1){
                ctg.dispose();
                ventana_categoria = 0;
            }else if(ventana_inventario == 1){
                ivt.dispose();
                ventana_inventario = 0;
            }else if(ventana_clientes == 1){
                cli.dispose();
                ventana_clientes = 0;
            }
            jDesktopPane1.add(em);
            em.show();
            int ancho = (int)d.getWidth();
            int alto = (int)d.getHeight();
            em.setSize(ancho, alto);
            ventana_empleados = 1;
            //System.out.println(getNombre_usuario());
            em.setUsuario(getNombre_usuario());
            em.nombre_empleado();
        }
    }//GEN-LAST:event_jMenu2MouseClicked

    private void logoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoMouseClicked
        if(ventana_empleados == 1){
            em.dispose();
            ventana_empleados = 0;
            //System.out.println(ventana_empleados);
        }else if(ventana_categoria == 1){
            ctg.dispose();
            ventana_categoria = 0;
        }else if(ventana_inventario == 1){
            ivt.dispose();
            ventana_inventario = 0;
        }else if(ventana_clientes == 1){
            cli.dispose();
            ventana_clientes = 0;
        }
    }//GEN-LAST:event_logoMouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        if(ventana_categoria ==0)
        {
            if(ventana_empleados==1){
                em.dispose();
                ventana_empleados = 0;
            }else if(ventana_inventario == 1){
                ivt.dispose();
                ventana_inventario = 0;
            }else if(ventana_clientes == 1){
                cli.dispose();
                ventana_clientes = 0;
            }
            jDesktopPane1.add(ctg);
            ctg.show();
            int ancho = (int) d.getWidth();
            int alto = (int) d.getHeight();
            ctg.setSize(ancho,alto);
            ctg.nombre_de_categoria();   
            ventana_categoria = 1;
        }
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        if(ventana_inventario == 0){
            if(ventana_categoria == 1){
                ctg.dispose();
                ventana_categoria = 0;
            }else if(ventana_empleados == 1){
                em.dispose();
                ventana_empleados = 0;
            }else if(ventana_clientes == 1){
                cli.dispose();
                ventana_clientes = 0;
            }
            jDesktopPane1.add(ivt);
            ivt.show();
            int ancho = (int) d.getWidth();
            int alto = (int) d.getHeight();
            ivt.setSize(ancho,alto);
            ivt.nombre_de_inventario();
            ventana_inventario = 1;
        }
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        if(ventana_clientes == 0){
            if(ventana_categoria == 1){
                ctg.dispose();
                ventana_categoria = 0;
            }else if(ventana_empleados == 1){
                em.dispose();
                ventana_empleados = 0;
            }else if(ventana_inventario == 1){
                ivt.dispose();
                ventana_inventario = 0;
            }
            jDesktopPane1.add(cli);
            cli.show();
            int ancho = (int) d.getWidth();
            int alto = (int) d.getHeight();
            cli.setSize(ancho, alto);
            cli.nombre_clientes();
            ventana_clientes = 1;
        }
    }//GEN-LAST:event_jMenu5MouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new inicio().setVisible(true);
        });
    }
    
    public void cargar_info(String nombre){
        Cuenta.setText(nombre);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Cuenta;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu logo;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the nombre_usuario
     */
    public String getNombre_usuario() {
        return nombre_usuario;
    }

    /**
     * @param nombre_usuario the nombre_usuario to set
     */
    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }
}
