
package Menus;

import catalogo.Usuario;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;

import ProcesoDeDatos.CargaPlatillos;
import ProcesoDeDatos.PresentacionPlatillo;
import javafx.collections.FXCollections;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import catalogo.*;

/**
 *
 * @author Carlos
 */
public class VentanaClienteView{
    private HBox root;
    private BorderPane contenedorGlobal;
    private Usuario user;
    private Button buscarPlatilloCat,buscarPlatillo,cerrarSesion;
    private ChoiceBox categorias;
    private TextField buscarTexto;
    private VBox contenedorPlatillos;
    
    
    /*
    Aun queda por modficar esto, pienso que se puede hacer un herencia ejemplo ventanausuario (SuperClass) 
    y sub class Ventana Cliente y Ventana Asistente pero aun queda por definir bien los metodos
    
    
    */
    //que podria recibir para el constructor
   public VentanaClienteView() throws FileNotFoundException, IOException{
	   	
        root=new HBox();
        contenedorGlobal= new BorderPane();
        contenedorPlatillos=new VBox();
        crearBotones();
        root.getChildren().addAll(categorias,buscarPlatilloCat,buscarTexto,buscarPlatillo,cerrarSesion);
        root.setSpacing(10);
        root.setAlignment(Pos.CENTER);
        contenedorGlobal.setCenter(contenedorPlatillos);
        contenedorGlobal.setTop(root);
        
        
    }
    public VentanaClienteView(Cliente user) throws FileNotFoundException, IOException{
    	
    	this.user=user;
        Label usuario=new Label("Bienvenido "+user.getNombre()+" "+user.getApellido());

        contenedorGlobal= new BorderPane();
        contenedorPlatillos=new VBox();
        root=new HBox();
        crearBotones();
        root.getChildren().addAll(categorias,buscarPlatilloCat,buscarTexto,buscarPlatillo,cerrarSesion);
        
        root.setSpacing(10);
        root.setAlignment(Pos.CENTER);
        contenedorGlobal.setCenter(contenedorPlatillos);
        contenedorGlobal.setTop(root);
       
        
    }
    private void crearBotones(){
        categorias=new ChoiceBox(FXCollections.observableArrayList(
			    "Plato Tipico", "Comida Extranjera", "Desayunos"));
        buscarPlatillo=new Button("Buscar platillos");
        buscarTexto = new TextField();
        cerrarSesion=new Button("Cerrar Sesion");
        buscarPlatilloCat=new Button("Buscar por Categoria");
        buscarPlatilloCat.setOnAction(e -> {
        	if (categorias.getValue().equals("Plato Tipico")){
        		try {
        			LinkedList<Platillo> listaPlatillos= CargaPlatillos.cargaDatos();
        			contenedorPlatillos.getChildren().clear();
        			System.out.println(listaPlatillos.size());
        			System.out.println(listaPlatillos.get(0).getCategoria());
        			
  	   			   for (int i=0;i<listaPlatillos.size();i++){
  	   				  System.out.println(listaPlatillos.get(i).getCategoria());
  	   				   if (listaPlatillos.get(i).getCategoria().equals("Plato Tipico")){
  	   					   PresentacionPlatillo platilloView=new PresentacionPlatillo(listaPlatillos.get(i));
  	   					   contenedorPlatillos.getChildren().add(platilloView.getRoot());
  	   					   
  	   				   }
  	   			   }  
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	   			  
	   		   }
	   		   if (categorias.getValue().equals("Desayunos")){
	   			try {
	   				LinkedList<Platillo> listaPlatillos= CargaPlatillos.cargaDatos();
	   				contenedorPlatillos.getChildren().clear();
		   			   for (int i=0;i<listaPlatillos.size();i++){
		   				   if (listaPlatillos.get(i).getCategoria().equals("Desayunos")){
		   					   PresentacionPlatillo platilloView=new PresentacionPlatillo(listaPlatillos.get(i));
		   					   contenedorPlatillos.getChildren().add(platilloView.getRoot());
		   					   
		   				   }
		   			   }  
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	   			   
	   		   }
	   		   if (categorias.getValue().equals("Comida Extranjera")){
	   			   try {
	   				LinkedList<Platillo> listaPlatillos= CargaPlatillos.cargaDatos();
	   				contenedorPlatillos.getChildren().clear();
		   			   for (int i=0;i<listaPlatillos.size();i++){
		   				   if (listaPlatillos.get(i).getCategoria().equals("Comida Extranjera")){
		   					   PresentacionPlatillo platilloView=new PresentacionPlatillo(listaPlatillos.get(i));
		   					   contenedorPlatillos.getChildren().add(platilloView.getRoot());
		   					   
		   				   }
		   			   }  
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	   			   
	   		   }
	   		   if (categorias.getValue()==null){
	   			System.out.print("no hacer nada");
	   			   
	   		   }
	   			   
	   		  
        	
        } );
        
        buscarPlatillo.setOnAction(e -> {
        	try {
				LinkedList<Platillo> listaPlatillos= CargaPlatillos.cargaDatos();
				contenedorPlatillos.getChildren().clear();
	   			   for (int i=0;i<listaPlatillos.size();i++){
	   				   if (listaPlatillos.get(i).getNombre().contains(buscarTexto.getText())){
	   					   PresentacionPlatillo platilloView=new PresentacionPlatillo(listaPlatillos.get(i));
	   					   contenedorPlatillos.getChildren().add(platilloView.getRoot());
	   					   
	   				   }
	   			   }  
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        	
        });
        //Evento para 
        
            
        cerrarSesion.setOnAction(e->{
           InicioSesionView isv=new InicioSesionView();
           Scene isvs=new Scene(isv.getRoot());
           Stage stage= (Stage) ((Node) e.getSource()).getScene().getWindow();  
           stage.setScene(isvs);
           stage.show();
           e.consume();
        });
    }
    //aun queda por modificacion
  
   
	   
        
        
        
   
   
    
   
    public BorderPane getRoot(){
        return contenedorGlobal;
    }

}
