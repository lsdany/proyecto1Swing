/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.prograuno.controler;

import com.proyecto.prograuno.model.Contacto;
import com.proyecto.prograuno.utils.Utils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;


/**
 *
 * @author luisdany pernillo
 * @carne 3190-13-1263
 * 
 */
public class ManagerText extends FileManager {

    private Contacto contacto;
    private List<String> listContactosRAW;
    private List<Contacto> listContactos;

    @Override
    public List<Contacto> readFile(String path) {

        try {
            Scanner in = new Scanner(new FileReader(path));//.useDelimiter("&");

            listContactosRAW = new ArrayList<>();
            StringBuilder sb = new StringBuilder();

            while (in.hasNext()) {

                    sb.append(in.next());

            }

            String[] conts = sb.toString().split("&");
            for(String c : conts){
                listContactosRAW.add(c);
            }
            
            
            System.out.println("--------- " + sb);
            System.out.println("array size" + listContactosRAW.size());

            if(!sb.toString().trim().equals("")){
                getContactos();
                
            }

            

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

        return listContactos;
    }

    @Override
    public void writeFile(String path, List<Contacto> contacto) {

        Path file = Paths.get(path);

        List<String> listContact = new ArrayList<>();

        for (Contacto c : contacto) {
            System.out.println(c.toString());
            listContact.add(c.getString());
        }

        if (listContact.size() > 0) {
            try {
                Files.write(file, listContact, Charset.forName("UTF-8"));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

    private void getContactos() {

        if (listContactosRAW != null && listContactosRAW.size() > 0) {

            listContactos = new ArrayList<>();

            for (String lst : listContactosRAW) {

                String[] lstC = lst.split(";");

                Contacto cto = new Contacto();
                cto.setNombre(lstC[0]);
                cto.setApellido(lstC[1]);
         
                cto.setDireccion(lstC[2]);
                cto.setTelefono(lstC[3]);//Integer.getInteger(lstC[4]));
                cto.setEdad(lstC[4]);
                cto.setFechaNacimiento(Utils.getDateFormat(lstC[5]));
                
                cto.setGenero(lstC[6]);
                cto.setNacionalidad(lstC[7]);
                cto.setEmail(lstC[8]);
                cto.setIdFotografia(lstC[9]);
                listContactos.add(cto);

            }

        }

    }

    @Override
    void writeFileImage(Contacto contacto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    List<Contacto> readFile(File file) {
        try {
            Scanner in = new Scanner(file);//.useDelimiter("&");

            listContactosRAW = new ArrayList<>();
            StringBuilder sb = new StringBuilder();

            while (in.hasNext()) {
                    sb.append(in.next());
            }

            String[] conts = sb.toString().split("&");
            for(String c : conts){
                listContactosRAW.add(c);
            }
            
            
            System.out.println("--------- " + sb);
            System.out.println("array size" + listContactosRAW.size());

            if(!sb.toString().trim().equals("")){
                getContactos();
                
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return listContactos;
    }

}
