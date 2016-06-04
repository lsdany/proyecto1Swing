/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.prograuno.model;

import com.proyecto.prograuno.utils.Utils;
import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author luisdany
 */
public class Contacto {
    
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String edad;
    private Date fechaNacimiento;
    private String genero;
    private String nacionalidad;
    private String email;
    private String idFotografia;
    private ImageIcon foto;

    public ImageIcon getFoto() {
        return foto;
    }

    public void setFoto(ImageIcon foto) {
        this.foto = foto;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdFotografia() {
        return idFotografia;
    }

    public void setIdFotografia(String idFotografia) {
        this.idFotografia = idFotografia;
    }

    @Override
    public String toString() {
        return "Contacto{" + "nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", telefono=" + telefono + ", edad=" + edad + ", fechaNacimiento=" + fechaNacimiento + ", genero=" + genero + ", nacionalidad=" + nacionalidad + ", email=" + email + ", idFotografia=" + idFotografia + ", foto=" + foto + '}';
    }

    

    /**
     * Devuelve la cadena de valores separados por ;
     * @return 
     */
    public String getString() {
        return nombre + ";" + apellido + ";" + direccion + ";" + telefono + ";" + edad + ";" + Utils.getDateString(fechaNacimiento) + ";" + genero + ";" + nacionalidad + ";" + email + ";"+idFotografia+"&";
    }
    
}
