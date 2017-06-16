/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProcesoDeDatos;

import catalogo.Administrador;
import catalogo.Asistente;
import com.opencsv.CSVReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
/*Copy the jar into your project lib folder. 
Then right click on your project select properties. Now a window opens go 
to libraries->Add Jar/Folder select your jar and press OK.*/
/**
 *
 * @author Ana Belen
 */
public class CargaAdministrador {
    public static LinkedList<Administrador> cargaDatos() throws FileNotFoundException, IOException{
        LinkedList<Administrador> administradores= new LinkedList<Administrador>();
        CSVReader reader = new CSVReader(new FileReader("src/CSV/Administradores.csv"),';');
        String [] nextLine;
     while ((nextLine = reader.readNext()) != null) {
        // nextLine[] is an array of values from the line
        System.out.println(nextLine[0]);
        Administrador admin=new Administrador(nextLine[0],nextLine[1],nextLine[2],nextLine[3],nextLine[4]);
        administradores.add(admin);
     }
           
            
     return administradores;
    }
    
}
