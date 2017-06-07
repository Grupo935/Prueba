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
    String nombre, descripcion, servido, tipo, ingredientes;
    Categoria categoria;

    public Platillo(String nombre, Categoria categoria, String descripcion, String servido, String tipo, String ingredientes) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.servido = servido;
        this.tipo = tipo;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public Categoria getCategoria() {
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(Categoria categoria) {
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
}
