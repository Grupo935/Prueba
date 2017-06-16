/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogo;

import java.util.LinkedList;

/**
 *
 * @author Carlos
 */
public class Categoria {
    private LinkedList<Platillo> platillos;
    private String nombre;

    public Categoria(String nombre) 
    {
        this.nombre = nombre;
        this.platillos = null;
    }
    public String getNombreCategoria(){
        return nombre;
       
    }
    public LinkedList getPlatillos(){
        return platillos;
    }
}
