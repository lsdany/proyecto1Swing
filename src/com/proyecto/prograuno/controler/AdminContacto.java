/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.prograuno.controler;

import com.proyecto.prograuno.model.Contacto;
import com.proyecto.prograuno.utils.Constant;
import com.proyecto.prograuno.utils.Utils;
import com.proyecto.prograuno.view.AgendaView;
import java.io.File;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author luisdany pernillo
 * @carne 3190-13-1263
 * 
 */
public class AdminContacto {

//    private Contacto contacto;
    private FileManager fileManagerText;
    private FileManager fileManagerBin;
    private List<Contacto> listContacto;

    enum OPERACION {
        save, delete
    };

    /**
     * Agrega imagen al contacto
     * @param contacto 
     */
    public void addImage(Contacto contacto) {

        fileManagerBin = new ManagerBinario();
        fileManagerBin.writeFileImage(contacto);

    }
    
    /**
     * Guarda todas las imagenes 
     * @param contacto 
     */
    public void addImages(List<Contacto> contacto){
        
    }

    public AdminContacto(List<Contacto> contacto) {
        listContacto = new ArrayList<>();
        this.listContacto = contacto;
        fileManagerText = new ManagerText();
        fileManagerBin = new ManagerBinario();
    }

    /**
     * Agrega contacto a la lista
     * @param contacto 
     */
    public void addContacto(Contacto contacto) {
        if (contacto != null) {
            listContacto.add(contacto);
        }
    }

    /**
     * Guarda el listado de contactos
     * @return 
     */
    public String saveContacto() {

        if (listContacto != null ) {
            fileManagerText.writeFile(Utils.getPathSO()+Constant.fileNameTxt, listContacto);
        }

        return null;
    }

    public String delContacto() {
        return null;
    }

    public List<Contacto> viewContactos() {
        return null;
    }

    public Contacto searchContacto(String nombre) {
        return null;
    }
    
    /**
     * Crea una nueva lista de contactos cargados de un archivo
     * @param file 
     */
    public void reloadContacto(File file){
        
        AgendaView.contactos = fileManagerText.readFile(file);
        
    }
    
    /**
     * Agrega contactos a los que ya se encuentran
     * @param file 
     */
    public void extendContacto(File file){
        AgendaView.contactos.addAll(fileManagerText.readFile(file));
    }

}
