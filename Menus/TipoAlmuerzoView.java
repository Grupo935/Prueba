package Menus;

import java.io.IOException;

import Builder.AlmuerzoEjecutivoViewBuilder;
import Builder.AlmuerzoEstudiantilBuilder;
import catalogo.Cliente;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TipoAlmuerzoView {
	
	private VBox contenedor;
	private Button ejecutivo, estudiantil,retornar;
	private Label escoja;
	private Cliente user;
	
	TipoAlmuerzoView(Cliente user){
		this.user=user;
		contenedor= new VBox();
		ejecutivo= new Button("Almuerzo Ejecutivo");
		estudiantil= new Button("Almuerzo Estudiantil");
		escoja =new Label("Escoja tipo de almuerzo:");
		retornar=new Button("Retornar a Menu Cliente");
		contenedor= new VBox();
		contenedor.getChildren().addAll(escoja,ejecutivo,estudiantil,retornar);
		estudiantil.setOnAction(e->{
			Stage secondaryStage=(Stage) ((Node) e.getSource()).getScene().getWindow(); 
            Scene sc=new Scene((new AlmuerzoEstudiantilBuilder(user).getRoot()));
            secondaryStage.setScene(sc);
            e.consume();
		});
		
		
		ejecutivo.setOnMouseClicked(new EventHandler<MouseEvent>() {
		    public void handle(MouseEvent mouseEvent) {
                Stage secondaryStage=(Stage) ((Node) mouseEvent.getSource()).getScene().getWindow(); 
                Scene sc=new Scene(( new AlmuerzoEjecutivoViewBuilder(user).getRoot()));
                secondaryStage.setScene(sc);
                mouseEvent.consume();
    }});
		retornar.setOnAction(e->{
			Stage secondaryStage=(Stage) ((Node) e.getSource()).getScene().getWindow(); 
            Scene sc;
			try {
				sc = new Scene((new VentanaClienteView(user).getRoot()));
				secondaryStage.setScene(sc);
	            e.consume();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
            
		});
		
		
		
	}
	
  public VBox getRoot() {
	  return contenedor;
	  
  }

}
