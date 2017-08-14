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
public abstract class AlmuerzoDecorator implements Almuerzo
{
    protected Almuerzo almuerzo;
    
    public AlmuerzoDecorator(Almuerzo almuerzo)
    {
        this.almuerzo = almuerzo;
    }
    
    public int getPrecio()
    {
        return this.almuerzo.getPrecio();
    }
}
