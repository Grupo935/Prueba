package InicioSesion;
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



public class InicioSesionView {
	Pane contenedorGlobal;
	VBox contenedor;
	HBox contenedorBotones; 
	Image imagenCarga;
	ImageView imagenEspol;
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
		aceptar= new Button("Aceptar");
		aceptar.setOnMouseClicked(new EventHandler<MouseEvent>() {
		    public void handle(MouseEvent mouseEvent) {
		    	System.out.println("pase por aqui");
		    	
		    }});
		registrar= new Button("Registar");
		registrar.setOnMouseClicked(new EventHandler<MouseEvent>() {
		    public void handle(MouseEvent mouseEvent) {
		    	System.out.println("pase por aqui");
		    	
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
