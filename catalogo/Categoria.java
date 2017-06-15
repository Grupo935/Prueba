/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogo;

import java.util.LinkedList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ana Belen
 */
public class Categoria 
{
    LinkedList<Platillo> platillos;
    String nombre, ID;

    public Categoria(String nombre, String ID) 
    {
        this.nombre = nombre;
        this.ID = ID;
        this.platillos = null;
    }

    @XmlElement (name = "platillos")
    public LinkedList<Platillo> getPlatillos() {
        return platillos;
    }
    @XmlElement (name = "nombre")
    public String getNombre() {
        return nombre;
    }
    @XmlElement (name = "ID")
    public String getID() {
        return ID;
    }

    public void setPlatillos(LinkedList<Platillo> platillos) {
        this.platillos = platillos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
