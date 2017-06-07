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
public class Administrador extends Usuario
{
    Restaurante restaurante;

    public Administrador(String usuario, String contrasena, Restaurante restaurante) 
    {
        super(usuario, contrasena);
        this.restaurante = restaurante;
    }  
}
