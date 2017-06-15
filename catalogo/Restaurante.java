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
    Administrador admin;
    LinkedList<Asistente> asistentes;
    LinkedList<Platillo> platillos;
    

    public Restaurante(Administrador admin) 
    {
        this.admin = admin;
        this.asistentes = null;
        this.platillos = null;
       
    }
    @XmlElement (name = "admin")
    public Administrador getAdmin() {
        return admin;
    }
    @XmlElement (name = "asistentes")
    public LinkedList<Asistente> getAsistentes() {
        return asistentes;
    }
    @XmlElement (name = "platillos")
    public LinkedList<Platillo> getPlatillos() {
        return platillos;
    }
   

    public void setAdmin(Administrador admin) {
        this.admin = admin;
    }

    public void setAsistentes(LinkedList<Asistente> asistentes) {
        this.asistentes = asistentes;
    }

    public void setPlatillos(LinkedList<Platillo> platillos) {
        this.platillos = platillos;
    }

   
}
