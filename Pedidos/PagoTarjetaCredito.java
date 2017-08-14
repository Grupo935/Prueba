/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pedidos;

import AdministracionSaldos.*;
import catalogo.Cliente;

/**
 *
 * @author Ana Belen
 */
public class PagoTarjetaCredito implements Pago
{
    static int numOrden;
    
    public boolean realizarPago()
    {
        //if pago se hizo con exito
        return true;
    }
    public boolean verificarDatos(Cliente cliente)
    {
        //if los datos del cliente son correctos
        return true;
    }
    public int numeroOrden()
    {
        numOrden ++;
        return numOrden;
    }
    
    public void registrarCredito()
    {
        Nota nota = new NotaCredito();
        nota.ingresarNota(numOrden); //con el numero de orden acceden al precio
        //se crea una nota de credito
    }
}
