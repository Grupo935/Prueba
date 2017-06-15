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
@XmlRootElement (name = "Platillo")
public class Platillo 
{
    String nombre, descripcion, servido, tipo, ingredientes, categoria;
 

    public Platillo(String nombre, String categoria, String descripcion, String servido, String tipo, String ingredientes) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.servido = servido;
        this.tipo = tipo;
        this.ingredientes = ingredientes;
    }
    @XmlElement (name = "nombre")
    public String getNombre() {
        return nombre;
    }
    @XmlElement (name = "categoria")
    public String getCategoria() {
        return categoria;
    }
    @XmlElement (name = "descripcion")
    public String getDescripcion() {
        return descripcion;
    }
    @XmlElement (name = "servido")
    public String getServido() {
        return servido;
    }
    @XmlElement (name = "tipo")
    public String getTipo() {
        return tipo;
    }
    @XmlElement (name = "ingredientes")
    public String getIngredientes() {
        return ingredientes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(String categoria) {
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
