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
    String ID, nombre, descripcion, servido, tipo, ingredientes, categoria, restauranteId;
    float precio;
 

    public Platillo(String ID, String nombre, String restauranteId, String servido, String tipo, String ingredientes, String descripcion, String categoria, float precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.restauranteId = restauranteId;
        this.descripcion = descripcion;
        this.servido = servido;
        this.tipo = tipo;
        this.ingredientes = ingredientes;
        this.ID = ID;
        this.precio=precio;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getCategoria() {
        return categoria;
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

    public void setCategoriaId(String categoria) {
        this.categoria = categoria;
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
