/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pedidos;

import catalogo.Cliente;

/**
 *
 * @author Ana Belen
 */
public interface Pago 
{
    public boolean realizarPago();
    public boolean verificarDatos(Cliente cliente);
    public int numeroOrden();
}
