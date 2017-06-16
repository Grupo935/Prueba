
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
    private Button buscarPlatillo,cerrarSesion;
    private ChoiceBox categorias;
    private VBox contenedorPlatillos;
    private LinkedList<Platillo> listaPlatillos;
    
    /*
    Aun queda por modficar esto, pienso que se puede hacer un herencia ejemplo ventanausuario (SuperClass) 
    y sub class Ventana Cliente y Ventana Asistente pero aun queda por definir bien los metodos
    
    
    */
    //que podria recibir para el constructor
   public VentanaClienteView() throws FileNotFoundException, IOException{
	   	cargarPlatillos();
        root=new HBox();
        contenedorGlobal= new BorderPane();
        contenedorPlatillos=new VBox();
        crearBotones();
        root.getChildren().addAll(categorias,buscarPlatillo,cerrarSesion);
        root.setSpacing(10);
        root.setAlignment(Pos.CENTER);
        contenedorGlobal.setCenter(contenedorPlatillos);
        contenedorGlobal.setTop(root);
        listarCategoria();
        
    }
    public VentanaClienteView(Cliente user) throws FileNotFoundException, IOException{
       this.user=user;
        Label usuario=new Label("Bienvenido "+user.getNombre()+" "+user.getApellido());
    	cargarPlatillos();
        contenedorGlobal= new BorderPane();
        contenedorPlatillos=new VBox();
        root=new HBox();
        crearBotones();
        root.getChildren().addAll(usuario,categorias,buscarPlatillo,cerrarSesion);
        
        root.setSpacing(10);
        root.setAlignment(Pos.CENTER);
        contenedorGlobal.setCenter(contenedorPlatillos);
        contenedorGlobal.setTop(root);
        listarCategoria();
        
    }
    private void crearBotones(){
        categorias=new ChoiceBox(FXCollections.observableArrayList(
			    "Plato Tipico", "Comida Extranjera", "Desayunos"));
        buscarPlatillo=new Button("Buscar platillos");
        cerrarSesion=new Button("Cerrar Sesion");
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
  
   private void listarCategoria(){
	   //este metodo se encargar de presentar los platillos segun las categorias hay un problema con el choice box
	   categorias.setOnMouseClicked(new EventHandler<MouseEvent>() {
		   	public void handle(MouseEvent mouseEvent) {
		   		if (mouseEvent.getButton().equals(MouseButton.PRIMARY)){
		   			if (categorias.getValue().equals("Plato tipico")){
		   			   contenedorPlatillos.getChildren().clear();
		   			   for (int i=0;i<listaPlatillos.size();i++){
		   				   if (listaPlatillos.get(i).getCategoria().equals("Plato tipico")){
		   					   PresentacionPlatillo platilloView=new PresentacionPlatillo(listaPlatillos.get(i));
		   					   contenedorPlatillos.getChildren().add(platilloView.getRoot());
		   					   
		   				   }
		   			   }  
		   		   }
		   		   if (categorias.getValue().equals("Desayunos")){
		   			   contenedorPlatillos.getChildren().clear();
		   			   for (int i=0;i<listaPlatillos.size();i++){
		   				   if (listaPlatillos.get(i).getCategoria().equals("Desayunos")){
		   					   PresentacionPlatillo platilloView=new PresentacionPlatillo(listaPlatillos.get(i));
		   					   contenedorPlatillos.getChildren().add(platilloView.getRoot());
		   					   
		   				   }
		   			   }  
		   		   }
		   		   if (categorias.getValue().equals("Comida Extranjera")){
		   			   contenedorPlatillos.getChildren().clear();
		   			   for (int i=0;i<listaPlatillos.size();i++){
		   				   if (listaPlatillos.get(i).getCategoria().equals("Comida Extranjera")){
		   					   PresentacionPlatillo platilloView=new PresentacionPlatillo(listaPlatillos.get(i));
		   					   contenedorPlatillos.getChildren().add(platilloView.getRoot());
		   					   
		   				   }
		   			   }  
		   		   }
		   		   else {
		   			   
		   		   }
		   			
		   			
		   			
		   			
		   		}}});
	   
        
        
        
    }
    private void mostrarPlatillo(Platillo platillo){
        VBox contenedorDetallesPlatillo=new VBox();
        Label nombre=new Label(platillo.getNombre());
        Label servido=new Label(platillo.getServido());
        Label tipo=new Label(platillo.getTipo());
        //Label categoria=new Label(platillo.get);
        Label descripcion=new Label(platillo.getDescripcion());
        Label ingredientes=new Label(platillo.getIngredientes());
        contenedorDetallesPlatillo.getChildren().addAll(nombre,servido,tipo,ingredientes,descripcion);
        Stage stage= new Stage();
        Scene sceneDetalle=new Scene(contenedorDetallesPlatillo);
        stage.setTitle(platillo.toString());
        stage.setScene(sceneDetalle);
        stage.show();
    }
    //por modificar, quiero hace run metodo que compare un array con un sub array y realizar un listado
    private void mostrarPlatillos(LinkedList<Platillo> listado,String iniciales){
             VBox listadoContainer =new VBox();
        for(Platillo l:listado){
           // if(l.getNombre().)
            HBox fila =new HBox();
            Label nombrePlatillo=new Label(l.getNombre());
            Button escoger=new Button();
            escoger.setOnAction(e->{
                mostrarPlatillo(l);
                e.consume();
            });
                    
            fila.getChildren().addAll(nombrePlatillo,escoger);
            listadoContainer.getChildren().add(fila);
        }
        Stage stage= new Stage();
        Scene sceneDetalle=new Scene(listadoContainer);
       // stage.setTitle(platillo.toString());
        stage.setScene(sceneDetalle);
        stage.show();
    }
//por mdificar
    private void mostrarPlatillos(LinkedList<Platillo> listado){
        VBox listadoContainer =new VBox();
        for(Platillo l:listado){
            HBox fila =new HBox();
            Label nombrePlatillo=new Label(l.getNombre());
            Button escoger=new Button();
            escoger.setOnAction(e->{
                mostrarPlatillo(l);
                e.consume();
            });
                    
            fila.getChildren().addAll(nombrePlatillo,escoger);
            listadoContainer.getChildren().add(fila);
        }
        Stage stage= new Stage();
        Scene sceneDetalle=new Scene(listadoContainer);
       // stage.setTitle(platillo.toString());
        stage.setScene(sceneDetalle);
        stage.show();
        
    }
    
    private void cargarPlatillos() throws FileNotFoundException, IOException{
    	listaPlatillos= CargaPlatillos.cargaDatos();
    	
    }
    public BorderPane getRoot(){
        return contenedorGlobal;
    }

}
