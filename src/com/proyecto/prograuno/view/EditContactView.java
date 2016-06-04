/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.prograuno.view;

import com.proyecto.prograuno.controler.AdminContacto;
import com.proyecto.prograuno.model.Contacto;
import com.proyecto.prograuno.utils.Utils;

/**
 *
 * @author luisdany
 */
public class EditContactView extends javax.swing.JDialog {

    private boolean isImageCharge = false;
    java.awt.Frame parent;
    int rowSelected;
    
    /**
     * Creates new form EditContactView
     */
    public EditContactView(java.awt.Frame parent, boolean modal,int rowSelected) {
        super(parent, modal);
        this.parent = parent;
        this.rowSelected = rowSelected;
        initComponents();
        
        
        pasarInfo();
        
    }
    
    
    private void pasarInfo(){
        Contacto contacto = AgendaView.contactos.get(rowSelected);
        txtNombre.setText(contacto.getNombre());
        txtApellido.setText(contacto.getApellido());
        txtDireccion.setText(contacto.getDireccion());
        txtEdad.setText(contacto.getEdad());
        txtEmail.setText(contacto.getEmail());
        txtTelefono.setText(contacto.getTelefono());
        lblShowFoto.setIcon(contacto.getFoto());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        cmbGenero2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        lblShowFoto = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        txtApellido = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel10.setText("Email:");

        cmbGenero2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        cmbGenero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGenero2ActionPerformed(evt);
            }
        });
        cmbGenero2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cmbGenero2PropertyChange(evt);
            }
        });

        jLabel4.setText("Sexo:");

        jLabel5.setText("Dirección:");

        jLabel6.setText("Teléfono:");

        jLabel11.setText("Fotografía:");

        jLabel7.setText("Fecha de nacimiento:");

        jLabel1.setText("Editar contacto:");

        String[] dias = new String[31];
        for(int i = 1 ; i <=31;i++){
            dias[i-1]=""+i;
        }
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(dias));

        btnSave.setText("Editar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        lblShowFoto.setBackground(new java.awt.Color(153, 153, 255));
        lblShowFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/proyecto/prograuno/images/man2.png"))); // NOI18N
        lblShowFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblShowFotoMouseClicked(evt);
            }
        });

        jLabel8.setText("Edad:");

        jLabel2.setText("Nombre:");

        String[] mes = new String[12];
        for(int i = 1 ; i <= 12 ; i++){
            mes[i-1] = ""+i;
        }
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(mes));

        jLabel9.setText("Nacionalidad:");

        String[] nacionalidades = new String[] {"Guatemalteco", "Mexicano", "Argentino", "Noruego", "Húngaro", "Ruso"};
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(nacionalidades));

        String[] anios = new String[47];
        for(int i = 1970; i <= 2016 ; i++){
            anios[i-1970] = ""+i;
        }
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(anios));

        jLabel3.setText("Apellido:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbGenero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                    .addComponent(txtApellido)
                                    .addComponent(txtDireccion)
                                    .addComponent(txtTelefono)
                                    .addComponent(txtEdad)
                                    .addComponent(txtEmail)
                                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblShowFoto))))
                        .addGap(189, 189, 189))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addGap(137, 137, 137))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbGenero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(lblShowFoto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addGap(82, 82, 82))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbGenero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGenero2ActionPerformed
        // TODO add your handling code here:
        String seleccion = cmbGenero.getSelectedItem().toString();
        if(seleccion != null && seleccion.equals("M") && !isImageCharge){
            lblShowFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/proyecto/prograuno/images/man2.png")));
        }else
        if(seleccion != null && seleccion.equals("F") && !isImageCharge){
            lblShowFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/proyecto/prograuno/images/woman2.png")));
        }
    }//GEN-LAST:event_cmbGenero2ActionPerformed

    private void cmbGenero2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cmbGenero2PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbGenero2PropertyChange

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:

        if (txtNombre.getText() != null && !txtNombre.getText().equals("")) {

//            Contacto contacto = new Contacto();
//
//            contacto.setNombre(txtNombre.getText());
//            contacto.setApellido(txtApellido.getText());
//            contacto.setGenero(null);
//            contacto.setDireccion(txtDireccion.getText());
//            contacto.setTelefono(txtTelefono.getText());
//            contacto.setFechaNacimiento(null);
//            contacto.setEdad(null);
//            contacto.setNacionalidad(null);
//            contacto.setEmail(null);
//            contacto.setIdFotografia(null);
//
//            //            FileManager fm = new ManagerText();
//
//            AgendaView.contactos.add(contacto);
            
            
            AgendaView.contactos.get(rowSelected).setApellido(txtApellido.getText());

            Utils.showContactos(AgendaView.contactos);
            this.setVisible(false);
            parent.remove(this);
            AdminContacto ac = new AdminContacto(AgendaView.contactos);
            ac.saveContacto();

        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void lblShowFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShowFotoMouseClicked
        // TODO add your handling code here:
//        int result = jFileChooser1.showOpenDialog(lblShowFoto);
//        if (result == jFileChooser1.APPROVE_OPTION) {
//            File selectedFile = jFileChooser1.getSelectedFile();
//            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
//        }
    }//GEN-LAST:event_lblShowFotoMouseClicked

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbGenero;
    private javax.swing.JComboBox<String> cmbGenero1;
    private javax.swing.JComboBox<String> cmbGenero2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblShowFoto;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
