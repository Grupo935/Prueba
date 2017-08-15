package Builder;

import java.io.IOException;
import java.util.LinkedList;
import Decorator.*;
import ProcesoDeDatos.CargaPlatillos;
import catalogo.Cliente;
import catalogo.Platillo;
import catalogo.Usuario;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AlmuerzoEstudiantilBuilder extends AlmuerzoViewBuilder{
	
	public AlmuerzoEstudiantilBuilder(Cliente user){
		super(user);
		inicioSecuencia();
	}

	
	private void inicioSecuencia() {
		
		this.gp=listarPlatillosSopa(this.platillos("Aperitivo"));
	}
	
	
	
	   private GridPane listarPlatillosSegundo(LinkedList<Platillo> platillo) {
	        Label nombreInfo,categoriaInfo,servidoInfo,tipoInfo;
	        GridPane contenedorPlatillos=new GridPane();
	        int i=0;
	        
	        for(Platillo p:platillo){
	                VBox contenedorDetalle=new VBox();
	                nombreInfo=new  Label(p.getNombre());
	                categoriaInfo=new  Label(p.getCategoria());
	                servidoInfo=new  Label(p.getServido());
	                tipoInfo=new  Label(p.getTipo());
	                Button escoger=new Button ("Seleccionar");
	                contenedorDetalle.getChildren().addAll(nombreInfo,categoriaInfo,servidoInfo,tipoInfo);
	                contenedorPlatillos.add(contenedorDetalle, 0, i);
	                contenedorPlatillos.add(escoger, 1, i);  
	                escoger.setOnAction(e->{
	                    ip=new SegundoDecorator(ip,p);
	                   this.a= ip.assemble();
	                   ip=(new ExtraDecorator(ip,"No Posee Extra"));
	                   this.a= ip.assemble();
	          /**/          Scene svp=new Scene((new InfoPedido(this.a,user)).getRoot() );
	                    Stage stage= (Stage) ((Node) e.getSource()).getScene().getWindow();
	                    stage.setScene(svp);
	                    e.consume();
	                
	                });
	                i++;            
	        }
	        return contenedorPlatillos;
	        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	    }

	
	   private GridPane listarPlatillosSopa(LinkedList<Platillo> platillo) {
	        Label nombreInfo,categoriaInfo,servidoInfo,tipoInfo;
	        GridPane contenedorPlatillos=new GridPane();
	        int i=0;
	        
	        for(Platillo p:platillo){
	                VBox contenedorDetalle=new VBox();
	                nombreInfo=new  Label(p.getNombre());
	                categoriaInfo=new  Label(p.getCategoria());
	                servidoInfo=new  Label(p.getServido());
	                tipoInfo=new  Label(p.getTipo());
	                Button escoger=new Button ("Seleccionar");
	                contenedorDetalle.getChildren().addAll(nombreInfo,categoriaInfo,servidoInfo,tipoInfo);
	                contenedorPlatillos.add(contenedorDetalle, 0, i);
	                contenedorPlatillos.add(escoger, 1, i);  
	                escoger.setOnAction(e->{
	                    ip=new SopaDecorator(new BasicPedido(),p);
	                   this.a=ip.assemble();
	                    Scene svp=new Scene(listarPlatillosSegundo(this.platillos("plato fuerte")));
	                    Stage stage= (Stage) ((Node) e.getSource()).getScene().getWindow();
	                    stage.setScene(svp);
	                    e.consume();
	                });
	                i++;            
	        }
	        return contenedorPlatillos;
	        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	    }


}
