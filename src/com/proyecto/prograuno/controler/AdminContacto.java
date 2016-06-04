/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.prograuno.controler;

import com.proyecto.prograuno.model.Contacto;
import com.proyecto.prograuno.utils.Constant;
import com.proyecto.prograuno.utils.Utils;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luisdany
 */
public class AdminContacto {

//    private Contacto contacto;
    private FileManager fileManagerText;
    private FileManager fileManagerBin;
    private List<Contacto> listContacto;

    enum OPERACION {
        save, delete
    };

    public void addImage(Contacto contacto) {

        fileManagerBin = new ManagerBinario();
        fileManagerBin.writeFileImage(contacto);

    }

    public AdminContacto(List<Contacto> contacto) {
        listContacto = new ArrayList<>();
        this.listContacto = contacto;
        fileManagerText = new ManagerText();
        fileManagerBin = new ManagerBinario();
    }

    public void addContacto(Contacto contacto) {
        if (contacto != null) {
            listContacto.add(contacto);
        }
    }

    public String saveContacto() {

        if (listContacto != null ) {
            fileManagerText.writeFile(Constant.pathFiles+Constant.fileNameTxt, listContacto);
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

}
