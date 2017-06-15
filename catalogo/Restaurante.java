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
@XmlRootElement (name = "Restaurante")
public class Restaurante 
{
    Asistente asistente;
    LinkedList<Platillo> platillos;
    String direccion, ID, telefono, duenio;
    

    public Restaurante(Asistente asistente, String direccion, String ID, String telefono, String duenio) 
    {
        this.asistente = asistente;
        this.platillos = null;
        this.direccion = direccion;
        this.ID = ID;
        this.telefono = telefono;
        this.duenio = duenio;
       
    }

    @XmlElement (name = "asistente")
    public Asistente getAsistente() {
        return asistente;
    }
    @XmlElement (name = "platillos")
    public LinkedList<Platillo> getPlatillos() {
        return platillos;
    }
    @XmlElement (name = "direccion")
    public String getDireccion() {
        return direccion;
    }
    @XmlElement (name = "ID")
    public String getID() {
        return ID;
    }
    @XmlElement (name = "telefono")
    public String getTelefono() {
        return telefono;
    }
    @XmlElement (name = "duenio")
    public String getDuenio() {
        return duenio;
    }
   

    public void setAsistentes(Asistente asistente) {
        this.asistente = asistente;
    }

    public void setPlatillos(LinkedList<Platillo> platillos) {
        this.platillos = platillos;
    }

    public void setAsistente(Asistente asistente) {
        this.asistente = asistente;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    
   
}
