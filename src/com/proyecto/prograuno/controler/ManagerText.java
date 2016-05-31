/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.prograuno.controler;

import com.proyecto.prograuno.model.Contacto;
import com.proyecto.prograuno.utils.Utils;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luisdany pernillo
 *
 */
public class ManagerText extends FileManager {

    private Contacto contacto;
    private List<String> listContactosRAW;
    private List<Contacto> listContactos;

    @Override
    public List<Contacto> readFile(String path) {

        try {
            Scanner in = new Scanner(new FileReader(path)).useDelimiter("&");

            listContactosRAW = new ArrayList<>();

            while (in.hasNextLine()) {

                listContactosRAW.add(in.next());

            }

            System.out.println("array size" + listContactosRAW.size());
            System.out.println("//" + listContactosRAW);

            getContactos();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

        return null;
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
                Files.write(file, listContactosRAW, Charset.forName("UTF-8"));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {

        ManagerText mt = new ManagerText();
        mt.readFile("/home/luisdany/contacts.txt");
        mt.writeFile("/home/luisdany/contactsBK1.txt", null);
    }

    private void getContactos() {

        if (listContactosRAW != null && listContactosRAW.size() > 0) {

            listContactos = new ArrayList<>();

            for (String lst : listContactosRAW) {

                String[] lstC = lst.split(";");

                Contacto cto = new Contacto();
                cto.setNombre(lstC[0]);
                cto.setApellido(lstC[1]);
                cto.setGenero(lstC[2]);
                cto.setDireccion(lstC[3]);
                cto.setTelefono(lstC[4]);//Integer.getInteger(lstC[4]));
                cto.setFechaNacimiento(Utils.getDateFormat(lstC[5]));
                cto.setEdad(lstC[6]);
                cto.setNacionalidad(lstC[7]);
                cto.setEmail(lstC[8]);
                cto.setIdFotografia(lstC[9]);

                System.out.println("Contacto: " + cto.toString());

                listContactos.add(cto);

            }

        }

    }

}
