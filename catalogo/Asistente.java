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
public class Asistente extends Usuario
{
    String restauranteId;
    
    public Asistente(String ID, String usuario, String contrasena, String nombre, String apellido, String restauranteId) 
    {
        super(ID,usuario, contrasena, nombre, apellido);
        this.restauranteId = restauranteId;
    } 
}
