package ProcesoDeDatos;

import catalogo.Platillo;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class PresentacionPlatillo {
	HBox contenedorGlobal;
	Label nombrePlatillo,servido,tipo,ingredientes,descripcion;
	Platillo platillo;
	public PresentacionPlatillo(Platillo platillo){
		
		crear();
		
		
	}
	private void crear(){
		this.platillo=platillo;
		contenedorGlobal= new HBox();
		nombrePlatillo=new Label();
		servido=new Label();
		tipo=new Label();
		ingredientes=new Label();
		descripcion=new Label();
		nombrePlatillo.setText(platillo.getNombre());
		servido.setText(platillo.getServido());
		tipo.setText(platillo.getTipo());
		ingredientes.setText(platillo.getIngredientes());
		descripcion.setText(platillo.getDescripcion());
		contenedorGlobal.getChildren().addAll(nombrePlatillo,servido,tipo,ingredientes,descripcion);
	}
	
	public HBox getRoot(){
		return contenedorGlobal;
		
	}

}
