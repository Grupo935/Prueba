/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurantes;

import catalogo.Restaurante;

/**
 *
 * @author Ana Belen
 */
public interface RestauranteFactory 
{
    public Restaurante crearRestaurante(String ID, String nombre, String asistenteId, String direccion, String telefono, String duenio);  
}
