/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;

import javafx.collections.FXCollections;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;

/**
 *
 * @author Carlos
 */
public class VentanaRegistroView {
    private GridPane root;
    private Label labelUsuario,labelPSW;
    private TextField textUsuario,textPSW;
    private Button registrar,regresar;
    private ChoiceBox<String> categoriaUsuario;
  public   VentanaRegistroView(){
        root=new GridPane();
        crearNodes();
        colocarNodes();
        colocarEvents();
        
        
    }
    private void crearNodes(){
        labelUsuario=new Label("Nombre de Usuario");
        labelPSW=new Label("Contraseña");
        categoriaUsuario=new ChoiceBox(FXCollections.observableArrayList(
			    "Asistente", "Cliente", "Administrador"));
        textUsuario=new TextField();
        textPSW=new TextField();
        registrar=new Button("Registrar");
        regresar=new Button("Regresar");
    }
    private void crearUsuario(String tipo){
       switch(tipo){
           case "Asistente":{
               
           };break;
           case "Cliente":{
               
           };break;
           case "Administrador":{
               
           };break;
           
       }
       //a�adir al csv
    }
    private void colocarNodes(){
        root.add(labelUsuario, 0, 0);
        root.add(textUsuario, 1, 0);
        root.add(labelPSW, 0, 1);
        root.add(textPSW, 1, 1);
        root.add(categoriaUsuario, 0, 2);
        root.add(registrar, 0, 3);
        root.add(regresar, 1, 3);
            }
    private void colocarEvents(){
       registrar.setOnAction(e->{
           crearUsuario(categoriaUsuario.getValue());
            
                    e.consume();
        });
        regresar.setOnAction(e->{
            Stage stage= (Stage) ((Node) e.getSource()).getScene().getWindow();
            InicioSesionView isv=new InicioSesionView();
            Scene isvs=new Scene(isv.getRoot());
            stage.setScene(isvs);
        });
    }
//puede ser un grid pane?
    public GridPane getRoot(){
        return root;
    }
    
}
