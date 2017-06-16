/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProcesoDeDatos;


import catalogo.Platillo;
import com.opencsv.CSVReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import com.opencsv.CSVWriter;
/**
 *
 * @author Ana Belen
 */
public class CargaPlatillos {
	public static LinkedList<Platillo> cargaDatos() throws FileNotFoundException, IOException{
        LinkedList<Platillo> platillos= new LinkedList<Platillo>();
        CSVReader reader = new CSVReader(new FileReader("src/CSV/Platillos.csv"),';');
        String [] nextLine;
     while ((nextLine = reader.readNext()) != null) {
        // nextLine[] is an array of values from the line
        System.out.println(nextLine[0]);
        Platillo platillo=new Platillo(nextLine[0],nextLine[1],nextLine[2],nextLine[3],nextLine[4],nextLine[5],nextLine[6],nextLine[7]);
        platillos.add(platillo);
     }
           
     System.out.println(platillos.get(0).getCategoria());        
     return platillos;
    }
	public static void guardarPlatillo(Platillo platillo) throws IOException{
		String[] entries = { platillo.getID(), platillo.getNombre(), platillo.getRestauranteId(), platillo.getServido(),platillo.getTipo(),platillo.getIngredientes(),platillo.getDescripcion(),platillo.getCategoria() }; 
       
        try (CSVWriter writer = new CSVWriter(new FileWriter("src/CSV/Platillos.csv",true),';')) {
            writer.writeNext(entries);
        }        
		
		
	}
    
}
