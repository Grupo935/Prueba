package Menus;

import Principal.VentanaPrincipalView;
import catalogo.Asistente;
import catalogo.Platillo;
import catalogo.Usuario;
import java.util.LinkedList;
import javafx.collections.FXCollections;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
public class VentanaAsistenteView implements MostrarPlatillo,OpcionesPlatillos{
    final private VBox root;
    private Asistente user;
    private Button agregarUsuario,regresarLogin;
    VentanaAsistenteView(Usuario user){
        root=new VBox();
        crearBotones();
        
    }
    public VBox getRoot(){
        return root;
    }
    private void crearBotones(){
       /* agregarUsuario=new Button("Agregar Usuario");
        agregarUsuario.setOnAction(e->{
            Stage stage=new Stage();
            stage.setTitle("Añadir Usuario");
            Scene svrv=new Scene((new VentanaRegistroView()).getRoot());
            stage.setScene(svrv);
            stage.show();
            
            e.consume();
        });**/
        regresarLogin=new Button("Regresar a Login");
        regresarLogin.setOnAction(e->{
            Stage stage= (Stage) ((Node) e.getSource()).getScene().getWindow();
            Scene svp=new Scene((new VentanaPrincipalView()).getRoot());
            stage.setScene(svp);
            stage.show();
            e.consume();
        });
        
        root.getChildren().addAll(regresarLogin);
    }

   
    public void mostrarPlatillo(Platillo platillo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listarPlatillo(LinkedList<Platillo> platillo) {
        for(Platillo p:platillo){
            if(p.getRestauranteId().equals(user.getRestauranteId())){
                
            }
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregarPlatillo() {
/*Se deben ingresar los siguientes campos para agregar un platillo nuevo: Nombre, Categoría,
Descripción, Servido {Caliente, Frío}, Tipo {Aperitivo, Plato fuerte, Postre}, Ingredientes e
Imágenes. El restaurante debe tomarlo automáticamente de la información del asistente de
restaurante*/
        GridPane contenedor=new GridPane();
        Label nombrePlatilloLabel,categoriaLabel,descripcionLabel,servidoLabel,tipoPlatilloLabel,ingredientesLabel;
        ChoiceBox<String> servidoCBox,tipoCBox;
        TextField nombreTF,categoriaTF,ingredientesTF,descripcionTF;
        Button regresar,guardar;
        regresar=new Button("Regresar a menu");
        guardar=new Button("Guardar Platillo");
        nombreTF=new TextField();
        categoriaTF=new TextField();
        ingredientesTF=new TextField();
        descripcionTF=new TextField();
        nombrePlatilloLabel=new Label("Nombre del Platillo: ");
        categoriaLabel=new Label("categoria del Platillo: ");
        descripcionLabel=new Label("Descripcion del Platillo: ");
        servidoLabel=new Label("Servido: ");
        tipoPlatilloLabel=new Label("Tipo: ");
        ingredientesLabel=new Label("Ingredientes: ");
        servidoCBox=new ChoiceBox(FXCollections.observableArrayList( "Caliente","Frio"));
        tipoCBox=new ChoiceBox(FXCollections.observableArrayList( "Aperitivo", "Plato fuerte", "Postre"));
        

        contenedor.add(nombrePlatilloLabel, 0, 0);
        contenedor.add(nombreTF, 1, 0);
        contenedor.add(categoriaLabel, 0, 1);
        contenedor.add(categoriaTF, 1, 1);
        contenedor.add(descripcionLabel, 0, 2);
        contenedor.add(descripcionTF, 1, 2);
        contenedor.add(servidoLabel, 0, 3);
        contenedor.add(servidoCBox, 1, 3);
        contenedor.add(tipoPlatilloLabel, 0, 4);
        contenedor.add(tipoCBox, 1, 4);
        contenedor.add(ingredientesLabel, 0, 5);
        contenedor.add(ingredientesTF, 1 , 5);
        contenedor.add(guardar, 0, 6);
        contenedor.add(regresar, 1 , 6);
        guardar.setOnAction(e->{
            
        });
        regresar.setOnAction(e->{
            
        });
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificarPlatillo(Platillo platillo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
