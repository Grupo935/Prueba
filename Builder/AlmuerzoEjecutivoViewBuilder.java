package Builder;

import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

import Decorator.BasicPedido;
import Decorator.ExtraDecorator;
import Decorator.SegundoDecorator;
import Decorator.SopaDecorator;
import Menus.VentanaAsistenteView;
import ProcesoDeDatos.CargaPlatillos;
import catalogo.Cliente;
import catalogo.Platillo;
import catalogo.Usuario;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AlmuerzoEjecutivoViewBuilder extends AlmuerzoViewBuilder{
	
	public AlmuerzoEjecutivoViewBuilder(Cliente user) {
		super(user);
		secuenciaSopa();
	}
	
	
	
	private void secuenciaSopa() {
		this.gp=listarPlatillosSopa(this.platillos("Aperitivo"));
	}
	
	
	
	   private GridPane listarPlatillosSegundo(LinkedList<Platillo> platillo) {
	        Label nombreInfo,categoriaInfo,servidoInfo,tipoInfo,precio;
	        GridPane contenedorPlatillos=new GridPane();
	        int i=0;
	        
	        for(Platillo p:platillo){
	                VBox contenedorDetalle=new VBox();
	                nombreInfo=new  Label(p.getNombre());
	                categoriaInfo=new  Label(p.getCategoria());
	                servidoInfo=new  Label(p.getServido());
	                tipoInfo=new  Label(p.getTipo());
	                precio= new Label(Float.toString(p.getPrecio()));
	                Button escoger=new Button ("Seleccionar");
	                contenedorDetalle.getChildren().addAll(nombreInfo,categoriaInfo,servidoInfo,tipoInfo,precio);
	                contenedorPlatillos.add(contenedorDetalle, 0, i);
	                contenedorPlatillos.add(escoger, 1, i);  
	                escoger.setOnAction(e->{
	                    ip=new SegundoDecorator(ip,p);
	                   this.a= ip.assemble();
	          /**/      Scene svp=new Scene(extra() );
	                    Stage stage= (Stage) ((Node) e.getSource()).getScene().getWindow();
	                    stage.setScene(svp);
	                    e.consume();
	                
	                });
	                i++;            
	        }
	        return contenedorPlatillos;
	        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	    }
	   private GridPane listarPlatillosExtra(LinkedList<Platillo> platillo) {
	        Label nombreInfo,categoriaInfo,servidoInfo,tipoInfo,precio;
	        GridPane contenedorPlatillos=new GridPane();
	        int i=0;
	        
	        for(Platillo p:platillo){
	                VBox contenedorDetalle=new VBox();
	                nombreInfo=new  Label(p.getNombre());
	                categoriaInfo=new  Label(p.getCategoria());
	                servidoInfo=new  Label(p.getServido());
	                tipoInfo=new  Label(p.getTipo());
	                precio= new Label(Float.toString(p.getPrecio()));
	                Button escoger=new Button ("Seleccionar");
	                contenedorDetalle.getChildren().addAll(nombreInfo,categoriaInfo,servidoInfo,tipoInfo,precio);
	                contenedorPlatillos.add(contenedorDetalle, 0, i);
	                contenedorPlatillos.add(escoger, 1, i);  
	                escoger.setOnAction(e->{
	                    ip=new ExtraDecorator(ip,p.getNombre());
	                   this.a= ip.assemble();
	          /**/      Scene svp=new Scene((new InfoPedido(this.a,user)).getRoot());
	                    Stage stage= (Stage) ((Node) e.getSource()).getScene().getWindow();
	                    stage.setScene(svp);
	                    e.consume();
	                
	                });
	                i++;            
	        }
	        return contenedorPlatillos;
	        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	    }
	   	private VBox extra() {
	   		Label desear=new Label("Desea Postre/Bebida?");
	   		Button si=new Button("SI"),no=new Button("NO");
	   		si.setOnAction(e->{
	   			Scene svp=new Scene(listarPlatillosExtra(this.platillos("Extra")));
	   			Stage stage= (Stage) ((Node) e.getSource()).getScene().getWindow();
                stage.setScene(svp);
                e.consume();
	   			
	   		});
	   		
	   		no.setOnAction(e->{
	   		 ip=new ExtraDecorator(ip,"No solicito Extra");
             this.a= ip.assemble();
	   			Scene svp=new Scene(new InfoPedido(this.a,this.user).getRoot());
	   			Stage stage= (Stage) ((Node) e.getSource()).getScene().getWindow();
                stage.setScene(svp);
                e.consume();
	   		});
	   		HBox hb=new HBox();
	   		hb.getChildren().addAll(si,no);
	   		VBox container=new VBox();
	   		container.getChildren().addAll(desear,hb);
	   		return container;
	   	}
	
	   private GridPane listarPlatillosSopa(LinkedList<Platillo> platillo) {
	        Label nombreInfo,categoriaInfo,servidoInfo,tipoInfo,precio;
	        GridPane contenedorPlatillos=new GridPane();
	        int i=0;
	        
	        for(Platillo p:platillo){
	                VBox contenedorDetalle=new VBox();
	                nombreInfo=new  Label(p.getNombre());
	                categoriaInfo=new  Label(p.getCategoria());
	                servidoInfo=new  Label(p.getServido());
	                tipoInfo=new  Label(p.getTipo());
	                precio= new Label(Float.toString(p.getPrecio()));
	                Button escoger=new Button ("Seleccionar");
	                contenedorDetalle.getChildren().addAll(nombreInfo,categoriaInfo,servidoInfo,tipoInfo,precio);
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
