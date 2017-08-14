/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurantes;

import catalogo.Restaurante;

/**
 *
 * @author Ana Belen
 */
public class NuevaMalicia extends Restaurante
{
    public NuevaMalicia(String ID, String nombre, String asistenteId, String direccion, String telefono, String duenio) {
        super(ID, nombre, asistenteId, direccion, telefono, duenio);
    }

    @Override
    public void setDuenio(String duenio) {
        super.setDuenio(duenio);
    }

    @Override
    public void setTelefono(String telefono) {
        super.setTelefono(telefono);
    }

    @Override
    public void setID(String ID) {
        super.setID(ID);
    }

    @Override
    public void setDireccion(String direccion) {
        super.setDireccion(direccion);
    }

    @Override
    public void setAsistenteId(String asistenteId) {
        super.setAsistenteId(asistenteId);
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public String getDuenio() {
        return super.getDuenio();
    }

    @Override
    public String getTelefono() {
        return super.getTelefono();
    }

    @Override
    public String getID() {
        return super.getID();
    }

    @Override
    public String getDireccion() {
        return super.getDireccion();
    }

    @Override
    public String getAsistenteId() {
        return super.getAsistenteId();
    }
    
    
}
