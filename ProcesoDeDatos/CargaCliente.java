/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProcesoDeDatos;


import catalogo.Cliente;
import com.opencsv.CSVReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author Ana Belen
 */
public class CargaCliente {
    public static LinkedList<Cliente> cargaDatos() throws FileNotFoundException, IOException{
        LinkedList<Cliente> clientes= new LinkedList<Cliente>();
        CSVReader reader = new CSVReader(new FileReader("src/CSV/Clientes.csv"),';');
        String [] nextLine;
     while ((nextLine = reader.readNext()) != null) {
        // nextLine[] is an array of values from the line
        System.out.println(nextLine[0]);
        Cliente cliente=new Cliente(nextLine[0],nextLine[1],nextLine[2],nextLine[3],nextLine[4]);
        clientes.add(cliente);
     }
           
     System.out.println(clientes.get(0).getUsuario());        
     return clientes;
    }
    
}
