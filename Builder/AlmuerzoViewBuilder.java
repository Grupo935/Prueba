package Builder;
import catalogo.*;
import Decorator.*;

import java.io.IOException;
import java.util.LinkedList;

import ProcesoDeDatos.CargaPlatillos;
import catalogo.Platillo;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public abstract class AlmuerzoViewBuilder {
	protected Cliente user;
	protected GridPane gp;
	protected IPedido ip;
	protected Almuerzo a;
	public AlmuerzoViewBuilder(Cliente user){
		this.user=user;
		a=new Almuerzo();
		gp=new GridPane();
	}
	public GridPane getRoot(){
		return gp;		
	}
	

	   

		
	protected LinkedList<Platillo> platillos(String s) {

			LinkedList<Platillo> platillosList=new LinkedList();
			try {
	            LinkedList<Platillo> platillos=CargaPlatillos.cargaDatos();
	            
	            
	            for(Platillo p:platillos){
	            if(p.getTipo().equals(s)){
	                
	            	platillosList.add(p);
	            	}   
	            }
	          
	        } catch (IOException ex) {
	                ex.printStackTrace();}
			return platillosList;
			
			
		}

}
