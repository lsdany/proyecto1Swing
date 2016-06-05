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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author luisdany pernillo
 * @carne 3190-13-1263
 * 
 */
public class ManagerBinario extends FileManager {

    @Override
    public List<Contacto> readFile(String path) {

        if (AgendaView.contactos != null) {
            int contador = 0;
            for (Contacto c : AgendaView.contactos) {
                System.out.println("Datos a buscar> " + c.toString());
                String fileName = c.getApellido() + c.getNombre();
//                System.out.println("FileName " + Constant.pathFiles + fileName + Constant.extensionFile);
                System.out.println("Posicion " + contador);
                try {

                    ObjectInputStream fileI = new ObjectInputStream(new FileInputStream(Utils.getPathSO()+ fileName + Constant.extensionFile));

                    ImageIcon image = (ImageIcon) fileI.readObject();

                    System.out.println("Data img " + image.getIconHeight());
                    AgendaView.contactos.get(contador).setFoto(image);

                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }

                contador++;
            }
        }
        return null;
    }

    /**
     * Guarda todos las imagenes de los contactos
     * @param path
     * @param contacto 
     */
    @Override
    public void writeFile(String path, List<Contacto> contacto) {

        for (Contacto c : contacto) {
            ObjectOutputStream file;
            try {
                file = new ObjectOutputStream(new FileOutputStream(Utils.getPathSO() + c.getApellido() + c.getNombre() + Constant.extensionFile));
                //Se escribe el objeto en archivo
                file.writeObject(c.getFoto());
                //se cierra archivo
                file.close();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    /**
     * Guarda la imagen de un contacto
     * @param contacto 
     */
    @Override
    void writeFileImage(Contacto contacto) {

        ObjectOutputStream file;
        try {
            file = new ObjectOutputStream(new FileOutputStream(Utils.getPathSO() + contacto.getApellido() + contacto.getNombre() + Constant.extensionFile));
            //Se escribe el objeto en archivo
            file.writeObject(contacto.getFoto());
            //se cierra archivo
            file.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    List<Contacto> readFile(File file) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
