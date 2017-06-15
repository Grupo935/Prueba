/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ana Belen
 */
@XmlRootElement (name = "Usuario")
public class Usuario 
{
    String usuario, contrasena, ID, nombre, apellido;

    public Usuario(String usuario, String contrasena, String ID, String nombre, String apellido) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    @XmlElement (name = "usuario")
    public String getUsuario() {
        return usuario;
    }
    @XmlElement (name = "contrasena")
    public String getContrasena() {
        return contrasena;
    }
    @XmlElement (name = "ID")
    public String getID() {
        return ID;
    }
    @XmlElement (name = "nombre")
    public String getNombre() {
        return nombre;
    }
    @XmlElement (name = "apellido")
    public String getApellido() {
        return apellido;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    public void setID(String ID) {
        this.ID = ID;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
