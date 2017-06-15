/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogo;

import com.opencsv.*;
/**
 *
 * @author Ana Belen
 */
public class Administrador extends Usuario
{
    public Administrador(String ID, String usuario, String contrasena, String nombre, String apellido) 
    {
        super(ID,usuario, contrasena, nombre, apellido);
    }
}
