/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.prograuno.controler;

import com.proyecto.prograuno.model.Contacto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luisdany
 */
public class AdminContacto {
    
//    private Contacto contacto;
    private FileManager fileManagerText;
    private FileManager fileManagerBin;
    private List<Contacto> listContacto;            

    enum OPERACION {save,delete};
    
    
    public AdminContacto(Contacto contacto){
        listContacto = new ArrayList<>();
        listContacto.add(contacto);
        fileManagerText = new ManagerText();
        fileManagerBin = new ManagerBinario();
    }
    
    public void addContacto(Contacto contacto){
        if(contacto!=null){
            listContacto.add(contacto);
        }
    }
    
    public String saveContacto(){
        
        if(listContacto != null && listContacto.size()>0){
            fileManagerText.writeFile("/home/luisdany/contacts.txt",listContacto);
        }
        
        return null;
    }
    
    public String delContacto(){
        return null;
    }
    
    public List<Contacto> viewContactos(){
        return null;
    }
    
    public Contacto searchContacto(String nombre){
        return null;
    }
    
    
}
