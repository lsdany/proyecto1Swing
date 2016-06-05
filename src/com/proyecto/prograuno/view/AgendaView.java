/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.prograuno.view;

import com.proyecto.prograuno.controler.AdminContacto;
import com.proyecto.prograuno.controler.FileManager;
import com.proyecto.prograuno.controler.ManagerBinario;
import com.proyecto.prograuno.controler.ManagerText;
import com.proyecto.prograuno.model.Contacto;
import com.proyecto.prograuno.utils.Constant;
import com.proyecto.prograuno.utils.Utils;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luisdany pernillo
 * @carne 3190-13-1263
 *
 */
public class AgendaView extends javax.swing.JFrame {

    public static List<Contacto> contactos;
    NewContactView ncv = new NewContactView(this, false);
    ListContactoView lcv;
    public static String osType;

    /**
     * Creates new form AgendaView
     */
    public AgendaView() {

//        for(UIManager.LookAndFeelInfo laf:UIManager.getInstalledLookAndFeels()){
//            if("Nimbus".equals(laf.getName()))
//                try {
//                UIManager.setLookAndFeel(laf.getClassName());
//                    System.out.println("nimbus!!!");
//                break;
//            } catch (Exception ex) {
//                ex.printStackTrace();
//            }
//        }
        initComponents();

        osType = System.getProperty("os.name");

        ManagerText fileContacto = new ManagerText();
        contactos = fileContacto.readFile(Utils.getPathSO() + Constant.fileNameTxt);
        if (contactos == null) {
            contactos = new ArrayList<>();
        } else {
            FileManager fm = new ManagerBinario();
            fm.readFile(null);
        }
        Utils.showContactos(contactos);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mnNuevo = new javax.swing.JMenuItem();
        mnModificar = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 200));

        jMenu3.setText("Archivo");

        jMenu4.setText("Cargar nuevos contactos");

        jMenuItem6.setText("Sustitutiva");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuItem7.setText("Extensiva");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenu3.add(jMenu4);

        jMenuItem4.setText("Guardar contactos actuales");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("Salir");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Contactos");

        mnNuevo.setText("Nuevo Contacto");
        mnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNuevoActionPerformed(evt);
            }
        });
        jMenu1.add(mnNuevo);

        mnModificar.setText("Modificar Contacto");
        mnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnModificarActionPerformed(evt);
            }
        });
        jMenu1.add(mnModificar);

        jMenuItem3.setText("Eliminar Contacto");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu5.setText("Búsquedas");

        jMenuItem8.setText("Alfabéticas");
        jMenu5.add(jMenuItem8);

        jMenuItem9.setText("Por título");
        jMenu5.add(jMenuItem9);

        jMenuItem10.setText("Por género");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem10);

        jMenuItem11.setText("Por nacionalidad");
        jMenu5.add(jMenuItem11);

        jMenuItem12.setText("Por edad");
        jMenu5.add(jMenuItem12);

        jMenuBar1.add(jMenu5);

        jMenu2.setText("Ayuda");

        jMenuItem13.setText("Manual de usuario");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem13);

        jMenuItem14.setText("Acerca de...");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem14);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 802, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNuevoActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);

        ncv.setVisible(true);
        ncv.setLocation(100, 200);


    }//GEN-LAST:event_mnNuevoActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        try {
            File path = new File("src/com/proyecto/prograuno/images/manual.pdf");
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void mnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnModificarActionPerformed
        // TODO add your handling code here:
        lcv = new ListContactoView(this, false, true);
        lcv.setVisible(true);


    }//GEN-LAST:event_mnModificarActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        lcv = new ListContactoView(this, false, false);
        lcv.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // carga sustitutiva

        int result = jFileChooser1.showOpenDialog(jMenuItem6);
        if (result == jFileChooser1.APPROVE_OPTION) {

            File selectedFile = jFileChooser1.getSelectedFile();

            AdminContacto ac = new AdminContacto(contactos);
            ac.reloadContacto(selectedFile);

        }

        Utils.showContactos(contactos);

    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // sustitucion extensiva

        int result = jFileChooser1.showOpenDialog(jMenuItem6);
        if (result == jFileChooser1.APPROVE_OPTION) {

            File selectedFile = jFileChooser1.getSelectedFile();

            AdminContacto ac = new AdminContacto(contactos);
            ac.extendContacto(selectedFile);

        }

        Utils.showContactos(contactos);

    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // Guardar todo
        AdminContacto ac = new AdminContacto(contactos);
        ac.saveContacto();
        ac.addImages(contactos);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        InfoView iv = new InfoView(this, true);
        iv.setVisible(true);

    }//GEN-LAST:event_jMenuItem14ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem mnModificar;
    private javax.swing.JMenuItem mnNuevo;
    // End of variables declaration//GEN-END:variables
}
