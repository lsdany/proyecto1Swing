/*
 * Proyecto de programacion para la clase de programacion 1
 *
 */
package com.proyecto.prograuno.utils;

import com.proyecto.prograuno.model.Contacto;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author luisdany pernillo
 * @carne 3190-13-12063 */
public class Utils {
    
    /**
     * Entrega la fecha actual del sistema
     * @return 
     */
    public static Date getDate(){
        return new Date();
    }
    
    /**
     * Recibe una fecha texto en formato ddMMyyyy
     * entrega el objeto fecha del string
     * @param date
     * @return 
     */
    public static Date getDateFormat(String date){
        
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
     * @param date
     * @return 
     */
    public static String getDateString(Date date){
        
        String fecha="";
        if(date!=null){
            SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
            fecha = sdf.format(date);
        }
        
        return fecha;
    }
    
    
    public static void showContactos(List<Contacto> listContacto){
        
        if(listContacto!=null){
            for(Contacto c : listContacto){
                System.out.println(c.toString());
            }
            
        }
        
    }
}
