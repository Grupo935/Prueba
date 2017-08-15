package Builder;


import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

import Decorator.Almuerzo;
import catalogo.Cliente;
import Menus.*;

public class InfoPedido {
	private VBox root;
	private Cliente user;
	private Label l;
	public InfoPedido(Almuerzo a,Cliente user) {
		this.user=user;
		root=new VBox();
		l=new Label(a.toString());
		root.getChildren().add(l);
		crearBotones();
	}
	public VBox getRoot() {
		return root;
	}
	private void crearBotones() {
		Button cerrar=new Button("regresar a menu");
		cerrar.setOnAction(e->{
			VentanaClienteView icv;
			try {
			icv = new VentanaClienteView(this.user);
			Scene svp=new Scene(icv.getRoot());
            Stage stage= (Stage) ((Node) e.getSource()).getScene().getWindow();
            stage.setScene(svp);
            e.consume();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
			
		});
		root.getChildren().add(cerrar);
	}
}
