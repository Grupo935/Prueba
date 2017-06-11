package Principal;
import InicioSesion.InicioSesionView;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;



public class VentanaPrincipalView {
	Pane contenedorPrincipal;
	InicioSesionView sesion;
	
	
	public VentanaPrincipalView(){
		contenedorPrincipal=new Pane();
		contenedorPrincipal.setPrefSize(1280, 720);
		sesion= new InicioSesionView();
		contenedorPrincipal.getChildren().add(sesion.getRoot());
		
		
	}
	public Pane getRoot(){
		return contenedorPrincipal;
	}
	

}
