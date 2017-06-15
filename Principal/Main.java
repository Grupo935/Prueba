package Principal;

import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
		

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		VentanaPrincipalView principal= new VentanaPrincipalView ();
		Scene scene=new Scene(principal.getRoot());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Catalogo Espol");
		primaryStage.show();
		
		
	}

}