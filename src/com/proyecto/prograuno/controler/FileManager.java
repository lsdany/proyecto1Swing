/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.prograuno.controler;

import com.proyecto.prograuno.model.Contacto;
import java.util.List;

/**
 *
 * @author luisdany
 */
public abstract class FileManager {
    
    abstract public List<Contacto> readFile(String path);
    
    abstract public void writeFile(String path, List<Contacto> contacto);
    
    
}
