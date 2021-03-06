/*
 * Proyecto de programacion para la clase de programacion 1
 *
 */
package com.proyecto.prograuno.utils;

import com.proyecto.prograuno.model.Contacto;
import com.proyecto.prograuno.view.AgendaView;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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

    public static String[] getFechaArray(Date fechaNac){
        
        System.out.println("Fecha nac "+fechaNac);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = sdf.format(fechaNac);
        System.out.println("fecha split "+fecha);
        String fecha_[] = fecha.split("/");
        
        return fecha_;
    }
    
    public static String calcularEdad(Date fechaNac) {

        Date fechaActual = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String hoy = sdf.format(fechaActual);

        String fechaNac_ = sdf.format(fechaNac);

        String[] fec1 = fechaNac_.split("/");
        String[] fec2 = hoy.split("/");
        int azo = Integer.parseInt(fec2[2]) - Integer.parseInt(fec1[2]);
        int mes = Integer.parseInt(fec2[1]) - Integer.parseInt(fec1[1]);
        if (mes < 0) {
            azo = azo - 1;
        } else if (mes == 0) {
            int dia = Integer.parseInt(fec2[0]) - Integer.parseInt(fec1[0]);
            if (dia > 0) {
                azo = azo - 1;
            }
        }
        System.out.println("edad " + azo);
        return "" + azo;
    }

    public static String getPathSO() {

        String ruta = null;

        if (AgendaView.osType.equals("Linux")) {
            System.out.println("El SO es un linux");
            ruta = Constant.pathFilesLinux;
            System.out.println(ruta);
        } else {
            System.out.println("El SO es un windows");
            ruta = Constant.pathFilesWin;
            System.out.println(ruta);
        }

        return ruta;

    }

    public static BufferedImage cambiaTamanioImagen(BufferedImage image) {
        int width = 185;
        int height = 190;
        BufferedImage buffImg = new BufferedImage(width, height, BufferedImage.TRANSLUCENT);
        Graphics2D g2d = (Graphics2D) buffImg.createGraphics();
        g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
        g2d.drawImage(image, 0, 0, width, height, null);
        g2d.dispose();
        return buffImg;
    }

    public static void main(String[] args) {

//        Utils u = new Utils();
//        u.edad("19/07/1987");
//        Date fechaNac = u.calcularFechaNacimiento("19", "07", "1987");
//        String edad = u.calcularEdad(fechaNac);
    }

}
