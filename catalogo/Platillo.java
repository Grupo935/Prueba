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
public class Platillo 
{
    String ID, nombre, descripcion, servido, tipo, ingredientes, categoriaId, restauranteId;
 

    public Platillo(String ID, String nombre, String restauranteId, String servido, String tipo, String ingredientes, String descripcion, String categoriaId) {
        this.nombre = nombre;
        this.categoriaId = categoriaId;
        this.restauranteId = restauranteId;
        this.descripcion = descripcion;
        this.servido = servido;
        this.tipo = tipo;
        this.ingredientes = ingredientes;
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoriaId() {
        return categoriaId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getServido() {
        return servido;
    }

    public String getTipo() {
        return tipo;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public String getRestauranteId() {
        return restauranteId;
    }

    public String getID() {
        return ID;
    }
    
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoriaId(String categoriaId) {
        this.categoriaId = categoriaId;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setServido(String servido) {
        this.servido = servido;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void setRestauranteId(String restauranteId) {
        this.restauranteId = restauranteId;
    }

    public void setID(String ID) {
        this.ID = ID;
    }   
}
