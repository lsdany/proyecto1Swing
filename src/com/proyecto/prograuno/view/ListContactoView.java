/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.prograuno.view;

import com.proyecto.prograuno.controler.AdminContacto;
import com.proyecto.prograuno.model.Contacto;
import javax.swing.JOptionPane;

/**
 *
 * @author luisdany
 */
public class ListContactoView extends javax.swing.JDialog {

    private java.awt.Frame parent;

    /**
     * Creates new form ListContactoView
     */
    public ListContactoView(java.awt.Frame parent, boolean modal, boolean isEdit) {
        super(parent, modal);
        this.parent = parent;
        initComponents();
        btnModificar.setVisible(isEdit);
        lblEdit.setVisible(isEdit);
        btnDelete.setVisible(!isEdit);
        lblDelete.setVisible(!isEdit);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        lblEdit = new javax.swing.JLabel();
        lblDelete = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        String[][] contac = null;

        if(AgendaView.contactos != null){
            contac = new String[AgendaView.contactos.size()][3];
            int contador = 0;
            for(Contacto c : AgendaView.contactos){
                contac[contador][0] = c.getNombre();
                contac[contador][1] = c.getApellido();
                contac[contador][2] = c.getTelefono();
                contador++;
            }
        }

        //for(int i = 0 ; i < 3 ; i++){
            //    for(int j = 0 ; j < AgendaView.contactos.size() ; j++){
                //        System.out.println("/// "+contac[i][j]);
                //    }
            //}
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            contac,
            new String [] {
                "Nombre", "Apellido", "Telefono"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        lblEdit.setText("Seleccione el registro a modificar");

        lblDelete.setText("Seleccione registro a eliminar");

        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jButton1.setText("Cancelar");
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
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEdit)
                            .addComponent(lblDelete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(59, 59, 59))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(lblEdit)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDelete)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        int rowSel = jTable1.getSelectedRow();
        System.out.println("/////" + rowSel);

        if (rowSel >= 0) {
            new EditContactView(parent, false, rowSel).setVisible(true);
            this.setVisible(false);
            parent.remove(this);
        } else {
            JOptionPane.showMessageDialog(parent, "Seleccione un registro!");
        }


    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int rowSel = jTable1.getSelectedRow();

        if (rowSel >= 0) {

            AgendaView.contactos.remove(rowSel);
            AdminContacto ac = new AdminContacto(AgendaView.contactos);
            ac.saveContacto();

            String[][] contac = null;

            if (AgendaView.contactos != null) {
                contac = new String[AgendaView.contactos.size()][3];
                int contador = 0;
                for (Contacto c : AgendaView.contactos) {
                    contac[contador][0] = c.getNombre();
                    contac[contador][1] = c.getApellido();
                    contac[contador][2] = c.getTelefono();
                    contador++;
                }
            }

            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                    contac,
                    new String[]{
                        "Nombre", "Apellido", "Telefono"
                    }
            ));


        } else {
            JOptionPane.showMessageDialog(parent, "Seleccione un registro!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                    this.setVisible(false);
            parent.remove(this);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblDelete;
    private javax.swing.JLabel lblEdit;
    // End of variables declaration//GEN-END:variables
}