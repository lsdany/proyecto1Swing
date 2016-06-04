/*
 * Proyecto de programacion para la clase de programacion 1
 *
 */
package com.proyecto.prograuno.utils;

import com.proyecto.prograuno.model.Contacto;
import com.proyecto.prograuno.view.AgendaView;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luisdany pernillo
 * @carne 3190-13-12063
 */
public class Utils {

    /**
     * Entrega la fecha actual del sistema
     *
     * @return
     */
    public static Date getDate() {
        return new Date();
    }

    /**
     * Recibe una fecha texto en formato ddMMyyyy entrega el objeto fecha del
     * string
     *
     * @param date
     * @return
     */
    public static Date getDateFormat(String date) {

        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date dateF = null;
        try {
            dateF = sdf.parse(date);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }

        return dateF;
    }

    /**
     * obtiene la cadena de string de la fecha que se le entregue
     *
     * @param date
     * @return
     */
    public static String getDateString(Date date) {

        String fecha = "";
        if (date != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
            fecha = sdf.format(date);
        }

        return fecha;
    }

    public static void showContactos(List<Contacto> listContacto) {

        if (listContacto != null) {
            for (Contacto c : listContacto) {
                System.out.println(c.toString());
            }

        }

    }

    public static Date calcularFechaNacimiento(String dia, String mes, String azo) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;
        try {
            fecha = sdf.parse(dia + "/" + mes + "/" + azo);
            System.out.println("Fecha Nacimiento: " + fecha);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return fecha;
    }

//    public static String calcularEdad(Date fechaNac){
//        
//        Date hoy = new Date();
//        long edad = hoy.getTime() - fechaNac.getTime();
//        
//        Date edad_ = new Date(edad);
//        
//        System.out.println("Edad "+edad_);
//        
//        return null;
//    }
    public static String calcularEdad(Date fechaNac) {

        Date fechaActual = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String hoy = sdf.format(fechaActual);

        String fechaNac_ = sdf.format(fechaNac);

        String[] dat1 = fechaNac_.split("/");
        String[] dat2 = hoy.split("/");
        int azo = Integer.parseInt(dat2[2]) - Integer.parseInt(dat1[2]);
        int mes = Integer.parseInt(dat2[1]) - Integer.parseInt(dat1[1]);
        if (mes < 0) {
            azo = azo - 1;
        } else if (mes == 0) {
            int dia = Integer.parseInt(dat2[0]) - Integer.parseInt(dat1[0]);
            if (dia > 0) {
                azo = azo - 1;
            }
        }
        System.out.println("edad " + azo);
        return ""+azo;
    }

    public static String getCorrelativo(){
        
//        int tamanio = AgendaView.contactos.size();
//        
//        Contacto c = AgendaView.contactos.get(tamanio-1);
//        c.get
//        
        return null;
    }
    
    
    public static void main(String[] args) {

//        Utils u = new Utils();
//        u.edad("19/07/1987");
//        Date fechaNac = u.calcularFechaNacimiento("19", "07", "1987");
//        String edad = u.calcularEdad(fechaNac);
    }

}
