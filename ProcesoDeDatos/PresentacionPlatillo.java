package ProcesoDeDatos;

import catalogo.Platillo;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class PresentacionPlatillo extends HBox{
	HBox contenedorGlobal;
	Label nombrePlatillo,servido,tipo,ingredientes,descripcion;
	Platillo platillo;
	public PresentacionPlatillo(Platillo platillo){
		super();
		this.platillo=platillo;
		
		crear();
		
		
	}
	private void crear(){
		
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
		contenedorGlobal.setSpacing(20);
		contenedorGlobal.getChildren().addAll(nombrePlatillo,servido,tipo,ingredientes,descripcion);
		
		this.getChildren().add(contenedorGlobal);
		this.setPrefSize(500, 20);
	}
	public Platillo getPlatillo() {
		return platillo;
	}
	public HBox getRoot(){
		return this.getRoot();
		
	}

}
