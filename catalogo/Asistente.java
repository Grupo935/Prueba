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
@XmlRootElement (name = "Asistente")
public class Asistente extends Usuario
{
    public Asistente(String usuario, String contrasena) 
    {
        super(usuario, contrasena);
    } 
}