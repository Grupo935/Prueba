/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogo;

import java.util.LinkedList;

/**
 *
 * @author Ana Belen
 */
public class Restaurante 
{
    Administrador admin;
    LinkedList<Asistente> asistentes;
    LinkedList<Platillo> platillos;
    LinkedList<Categoria> categorias;

    public Restaurante(Administrador admin) 
    {
        this.admin = admin;
        this.asistentes = null;
        this.platillos = null;
        this.categorias = null;
    }

    public Administrador getAdmin() {
        return admin;
    }

    public LinkedList<Asistente> getAsistentes() {
        return asistentes;
    }

    public LinkedList<Platillo> getPlatillos() {
        return platillos;
    }

    public LinkedList<Categoria> getCategorias() {
        return categorias;
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

    public void setCategorias(LinkedList<Categoria> categorias) {
        this.categorias = categorias;
    } 
}
