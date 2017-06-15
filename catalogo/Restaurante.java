/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogo;


/**
 *
 * @author Ana Belen
 */

public class Restaurante 
{
    String nombre, direccion, ID, telefono, duenio, asistenteId;
    

    public Restaurante(String ID, String nombre, String asistenteId, String direccion, String telefono, String duenio) 
    {
        this.asistenteId = asistenteId;
        this.direccion = direccion;
        this.ID = ID;
        this.telefono = telefono;
        this.duenio = duenio;
        this.nombre = nombre;
       
    }


    public String getAsistenteId() {
        return asistenteId;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getID() {
        return ID;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDuenio() {
        return duenio;
    }

    public String getNombre() {
        return nombre;
    }
    
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAsistenteId(String asistenteId) {
        this.asistenteId = asistenteId;
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
