/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProcesoDeDatos;

import catalogo.Restaurante;
import com.opencsv.CSVReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author Ana Belen
 */
public class CargaRestaurantes {
     public static LinkedList<Restaurante> cargaDatos() throws FileNotFoundException, IOException{
        LinkedList<Restaurante> restaurantes = new LinkedList<Restaurante>();
        CSVReader reader = new CSVReader(new FileReader("src/CSV/Restaurantes.csv"),';');
        String [] nextLine;
     while ((nextLine = reader.readNext()) != null) {
        // nextLine[] is an array of values from the line
        System.out.println(nextLine[0]);
        Restaurante res = new Restaurante(nextLine[0],nextLine[1],nextLine[2],nextLine[3],nextLine[4],nextLine[5]);
        restaurantes.add(res);
     }
           
            
     return restaurantes;
    }
    
}
