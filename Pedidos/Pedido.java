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
public abstract class Pedido 
{
    Almuerzo almuerzo;
    int numOrden;
    String horario;

    public int getNumOrden() {
        return numOrden;
    }

    public String getHorario() {
        return horario;
    }
    
    public Almuerzo getAlmuerzo() {
        return almuerzo;
    }

    public void setNumOrden(int numOrden) {
        this.numOrden = numOrden;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    public void setAlmuerzo(Almuerzo almuerzo) {
        this.almuerzo = almuerzo;
    }
}
