/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogo;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ana Belen
 */
@XmlRootElement (name = "Cliente")
public class Cliente extends Usuario
{  
    public Cliente(String usuario, String contrasena, String ID, String nombre, String apellido) 
    {
        super(usuario, contrasena, ID, nombre, apellido);
    }  
}
