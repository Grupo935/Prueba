package Menus;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class InicioSesionView {
	Pane contenedorGlobal;
	VBox contenedor;
	HBox contenedorBotones; 
	Label userText,passText;
	TextField usuario,password;
	Button aceptar,registrar;

	public InicioSesionView(){
		crearContenido();
		
	}
	public void crearContenido(){
		userText= new Label("Usuario");
		passText= new Label("Contraseña");
		usuario=new TextField();
		password=new TextField();
                //aqui se verifica si el usuario pertenece y posteriormente se acccede al menu del tipo de usaurio
                
		aceptar= new Button("Aceptar");
		aceptar.setOnMouseClicked(new EventHandler<MouseEvent>() {
		    public void handle(MouseEvent mouseEvent) {
		   /* 	System.out.println("pase por aqui");
		    */	
                   
                   //verifico para ingresar al interfaz cliente
                   /*VentanaClienteView ic=new VentanaClienteView();
                   Scene ics=new Scene(ic.getRoot());
                   
                  Stage stage= (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
                  stage.setScene(ics);
                */
                   mouseEvent.consume();
		    }});

//aqui seria un cogido de ingreso de datos junto al un tipo de usuario a ingresar o algo con que comparar
		registrar= new Button("Registar");
		registrar.setOnMouseClicked(new EventHandler<MouseEvent>() {
		    public void handle(MouseEvent mouseEvent) {
                        VentanaRegistroView vr=new VentanaRegistroView();
                        Scene vrs=new Scene(vr.getRoot());
                        Stage stage= (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
                        stage.setScene(vrs);
		    	System.out.println("Pase por aqui");
		    	
		    }});
		contenedorBotones= new HBox();
		contenedorBotones.getChildren().add(registrar);
		contenedorBotones.getChildren().add(aceptar);
		contenedor=new VBox();
		contenedor.setPrefSize(320,360);
		contenedor.getChildren().add(userText);
		contenedor.getChildren().add(usuario);
		contenedor.getChildren().add(passText);
		contenedor.getChildren().add(password);
		contenedor.getChildren().add(contenedorBotones);
		
		
		
		
	}
	public VBox getRoot(){
		return contenedor;
	}
	

}