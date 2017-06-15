/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProcesoDeDatos;

import catalogo.Asistente;
import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author Ana Belen
 */
public class Pruebas {
    public static void main(String[] args) throws IOException {
        LinkedList<Asistente> asistentes=CargaAsistentes.cargaDatos();
        System.out.println(asistentes.getFirst().getRestauranteId());
	
		

		
	}
    
}
