package Menus;
import javafx.collections.FXCollections;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
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

import java.io.IOException;
import java.util.LinkedList;

import ProcesoDeDatos.CargaAsistentes;
import ProcesoDeDatos.CargaCliente;
import ProcesoDeDatos.CargaAdministrador;
import catalogo.Asistente;
import catalogo.Cliente;
import catalogo.Administrador;

public class InicioSesionView {
	Pane contenedorGlobal;
	VBox contenedor;
	HBox contenedorBotones; 
	Label userText,passText;
	TextField usuario,password;
	Button aceptar,registrar;
	ChoiceBox tipoUsers;    
	public InicioSesionView(){
		crearContenido();
		
	}
	public void crearContenido(){
		userText= new Label("Usuario");
		passText= new Label("Contraseña");
		usuario=new TextField();
		password=new TextField();
                //aqui se verifica si el usuario pertenece y posteriormente se acccede al menu del tipo de usaurio
        tipoUsers= new ChoiceBox(FXCollections.observableArrayList(
			    "Asistente", "Cliente", "Administrador"));
		aceptar= new Button("Aceptar");
		aceptar.setOnMouseClicked(new EventHandler<MouseEvent>() {
		    public void handle(MouseEvent mouseEvent) {
                        Stage secondaryStage=(Stage) ((Node) mouseEvent.getSource()).getScene().getWindow(); 
		    	if (mouseEvent.getButton().equals(MouseButton.PRIMARY)){
		    		if(tipoUsers.getValue().equals("Asistente")){
			    		try {
							LinkedList<Asistente> asistentes= CargaAsistentes.cargaDatos();
							for(int i=0;i<asistentes.size();i++){
								System.out.println(asistentes.get(i).getUsuario()+" "+asistentes.get(i).getContrasena());
								if (usuario.getText().equals(asistentes.get(i).getUsuario()) && password.getText().equals(asistentes.get(i).getContrasena())){
									System.out.println("inicio de sesion exitoso");
									// aqui va la transicion de ventana de loggin a la ventana para el asistente
                                                                          Scene sc=new Scene((new VentanaAsistenteView(asistentes.get(i))).getRoot());
                                                                        secondaryStage.setScene(sc);
                                                                        secondaryStage.setScene(sc);
                                                                        mouseEvent.consume();
								}
							}
							
							
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			    		
			    	}
			    	if(tipoUsers.getValue().equals("Cliente")){
			    		try {
							LinkedList<Cliente> clientes= CargaCliente.cargaDatos();
							for(int i=0;i<clientes.size();i++){
								if (usuario.getText().equals(clientes.get(i).getUsuario()) && password.getText().equals(clientes.get(i).getContrasena())){
									System.out.println("inicio de sesion exitoso");
                                                                        // aqui va la transicion de ventana de loggin a la ventana para el Cliente
                                                                        Scene sc=new Scene((new VentanaClienteView(clientes.get(i))).getRoot());
                                                                        secondaryStage.setScene(sc);
                                                                        secondaryStage.setScene(sc);
                                                                        mouseEvent.consume();
                                                                        
								}
							}
							
							
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			    		
			    	}
			    	if(tipoUsers.getValue().equals("Administrador")){
			    		try {
							LinkedList<Administrador> administradores= CargaAdministrador.cargaDatos();
							for(int i=0;i<administradores.size();i++){
								if (usuario.getText().equals(administradores.get(i).getUsuario()) && password.getText().equals(administradores.get(i).getContrasena())){
									System.out.println("inicio de sesion exitoso");
									// aqui va la transicion de ventana de loggin a la ventana para el asistente
								}
							}
							
							
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			    		
			    	}
		    		
		    	}
		    	
		    	
		    	
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
		contenedor.getChildren().add(tipoUsers);
		contenedor.getChildren().add(contenedorBotones);
		
		
		
		
	}
	public VBox getRoot(){
		return contenedor;
	}
	

}