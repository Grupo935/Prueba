/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pedidos;

/**
 *
 * @author Ana Belen
 */
public class Bebida extends AlmuerzoDecorator
{
    int precioExtra;
    
    public Bebida(Almuerzo almuerzo)
    {
        super(almuerzo);
    }
    
    public int getPrecio(){
        return super.getPrecio() + precioExtra;
    }
}
