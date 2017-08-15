package Menus;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;

import ProcesoDeDatos.CargaPlatillos;
import ProcesoDeDatos.PresentacionPlatillo;
import catalogo.Cliente;
import catalogo.Platillo;
import catalogo.Usuario;
import javafx.collections.FXCollections;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PedidoView {
	 private VBox root;
	    
	    private Usuario user;
	    private Button siguiente;
	   
	    private LinkedList contenedorAlmuerzo;
	    private Label aperitivoText,platoFuerte;
	    
	    
	    /*
	    Aun queda por modficar esto, pienso que se puede hacer un herencia ejemplo ventanausuario (SuperClass) 
	    y sub class Ventana Cliente y Ventana Asistente pero aun queda por definir bien los metodos
	    
	    
	    */
	    //que podria recibir para el constructor
	   public PedidoView() {
		   
		   root= new VBox();
		   pedido();
		   
		   
	   }
		   
	   
		   	
	        
	        
	    
	    public PedidoView(Cliente user) {
	    	
	    	this.user=user;
	        Label usuario=new Label("Bienvenido "+user.getNombre()+" "+user.getApellido());
	        root= new VBox();
	        pedido();
	        
			   
	        
	    }
	   
	   private void pedido() {
		   aperitivoText= new Label("Escoja aperitivo");
		   platoFuerte= new Label("Escoja Plato Fuerte");
		   root.getChildren().add(aperitivoText);
		   try {
   			LinkedList<Platillo> listaPlatillos= CargaPlatillos.cargaDatos();
  
   			System.out.println(listaPlatillos.size());
   			System.out.println(listaPlatillos.get(0).getCategoria());
   			
	   			   for (int i=0;i<listaPlatillos.size();i++){
	   				  System.out.println(listaPlatillos.get(i).getCategoria());
	   				   if (listaPlatillos.get(i).getTipo().equals("Aperitivo")){
	   					   PresentacionPlatillo platilloView=new PresentacionPlatillo(listaPlatillos.get(i));
	   					   
	   					   platilloView.setOnMouseClicked(new EventHandler<MouseEvent>() {
	   					    public void handle(MouseEvent mouseEvent) {
	   					    	contenedorAlmuerzo.add(platilloView.getPlatillo());
	   			                root.getChildren().clear();
	   			                root.getChildren().add(platoFuerte);
	   			             try {
	   				   			LinkedList<Platillo> listaPlatillos= CargaPlatillos.cargaDatos();
	   				  
	   				   			System.out.println(listaPlatillos.size());
	   				   			System.out.println(listaPlatillos.get(0).getCategoria());
	   				   			
	   					   			   for (int i=0;i<listaPlatillos.size();i++){
	   					   				  System.out.println(listaPlatillos.get(i).getCategoria());
	   					   				   if (listaPlatillos.get(i).getTipo().equals("plato fuerte")){
	   					   					   PresentacionPlatillo platilloView=new PresentacionPlatillo(listaPlatillos.get(i));
	   					   					 
	   					   					   platilloView.setOnMouseClicked(new EventHandler<MouseEvent>() {
	   					   					    public void handle(MouseEvent mouseEvent) {
	   					   					    	contenedorAlmuerzo.add(platilloView.getPlatillo());
	   					   					  Stage secondaryStage=(Stage) ((Node) mouseEvent.getSource()).getScene().getWindow(); 
	   				                        //Scene sc=new Scene((new TipoAlmuerzoView().getRoot()));   aqui va una escene que lleve para confirmar hora de entre y pago
	   				                        //secondaryStage.setScene(sc);
	   				                       // secondaryStage.setScene(sc);
	   					   			                
	   					   					    }});
	   					   					   root.getChildren().add(platilloView);
	   					   					   
	   					   				   }
	   					   			   }  
	   							} catch (Exception e1) {
	   								// TODO Auto-generated catch block
	   								e1.printStackTrace();
	   							}

	   			                
	   			                
	   					    }});
	   					   root.getChildren().add(platilloView);
	   					   
	   				   }
	   			   }  
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

       
		   
	   }
	    public VBox getRoot(){
	        return root;
	    }

}
