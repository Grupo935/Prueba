package Menus;

import Principal.VentanaPrincipalView;
import ProcesoDeDatos.CargaPlatillos;
import catalogo.Asistente;
import catalogo.Platillo;
import catalogo.Usuario;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.geometry.Pos;
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
    
    private Button regresarLogin,agregarPlatillo,listarPlatillos;
    
    VentanaAsistenteView(Asistente user){
        this.user=user;
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
        agregarPlatillo=new Button("Agregar Platillo");
        agregarPlatillo.setOnAction(e->{
           
            Stage stage= (Stage) ((Node) e.getSource()).getScene().getWindow();
            Scene svp=new Scene(agregarPlatillo());
            stage.setScene(svp);
            stage.show();
            e.consume();
        });
        regresarLogin.setOnAction(e->{
            Stage stage= (Stage) ((Node) e.getSource()).getScene().getWindow();
            Scene svp=new Scene((new VentanaPrincipalView()).getRoot());
            stage.setScene(svp);
            stage.show();
            e.consume();
        });
        listarPlatillos=new Button("Mostrar Platillos");
        listarPlatillos.setOnAction(e->{
            try {
                LinkedList<Platillo> platillos=CargaPlatillos.cargaDatos();
                   Stage stage= (Stage) ((Node) e.getSource()).getScene().getWindow();
                    Scene svp=new Scene(listarPlatillos(platillos));
                    stage.setScene(svp);
                    stage.show();
            } catch (IOException ex) {
                Logger.getLogger(VentanaAsistenteView.class.getName()).log(Level.SEVERE, null, ex);
            }
            
     
          e.consume();
        });
        
        
        root.getChildren().addAll(agregarPlatillo,listarPlatillos,regresarLogin);
        root.setSpacing(10);
        root.setAlignment(Pos.CENTER);
    }

   
    @Override
    public void mostrarPlatillo(Platillo platillo) {
      /*  Para mostrar un platillo primero se debe escoger uno de la lista anterior. Los datos a mostrar
son: Nombre, Servido, Tipo, Restaurante, Categoría, Ingredientes, Imágenes, Descripción. Luego
debe mostrar el submenú correspondiente
*/
              VBox contenedorDetalle=new VBox();
              Label nombreInfo=new  Label(platillo.getNombre());
              Label  categoriaInfo=new  Label(platillo.getCategoria());
              Label  servidoInfo=new  Label(platillo.getServido());
              Label  tipoInfo=new  Label(platillo.getTipo());
              //nombre de restaurante?
              
              Label restauranteInfo=new Label(platillo.getRestauranteId());
              Label ingredientesInfo=new Label(platillo.getIngredientes());
              Label descripcionInfo=new Label(platillo.getDescripcion());
              contenedorDetalle.getChildren().addAll(restauranteInfo,nombreInfo,categoriaInfo,servidoInfo,tipoInfo,ingredientesInfo,descripcionInfo);
              Stage stage=new Stage();
              Scene scene=new Scene(contenedorDetalle);
              stage.setScene(scene);
              stage.show();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GridPane listarPlatillos(LinkedList<Platillo> platillo) {
        Label nombreInfo,categoriaInfo,servidoInfo,tipoInfo;
        GridPane contenedorPlatillos=new GridPane();
        int i=0;
        
        for(Platillo p:platillo){
            if(p.getRestauranteId().equals(user.getRestauranteId())){
                
                VBox contenedorDetalle=new VBox();
                nombreInfo=new  Label(p.getNombre());
                categoriaInfo=new  Label(p.getCategoria());
                servidoInfo=new  Label(p.getServido());
                tipoInfo=new  Label(p.getTipo());
                Button escoger=new Button ("Mas Detalle");
                contenedorDetalle.getChildren().addAll(nombreInfo,categoriaInfo,servidoInfo,tipoInfo);
                contenedorPlatillos.add(contenedorDetalle, 0, i);
                contenedorPlatillos.add(escoger, 3, i);
               
                
                escoger.setOnAction(e->{
                    this.mostrarPlatillo(p);
                    
                    e.consume();
                });
                i++;
                
//codigo para listar platillo
                /*Se muestran todos los platillos que ofrece el restaurante asociado al asistente de restaurante.
                  Los datos que se deben mostrar son: Nombre, Categoría, Servido y Tipo. Luego se debe mostrar
                  el submenú correspondiente.*/
            }
        }Button regresar=new Button("Regresar al menu anterior");
          regresar.setOnAction(e->{
          Stage stage= (Stage) ((Node) e.getSource()).getScene().getWindow();
          Scene svp=new Scene((new VentanaAsistenteView(user)).getRoot());
          stage.setScene(svp);
          stage.show();
          e.consume();  
        });
        contenedorPlatillos.add(regresar, 0, i);
        return contenedorPlatillos;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GridPane agregarPlatillo() {
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
       //codigo para guardar en csv, de seer posible un mensaje
            
            e.consume();
        
        });
        
        
        regresar.setOnAction(e->{
          Stage stage= (Stage) ((Node) e.getSource()).getScene().getWindow();
          Scene svp=new Scene((new VentanaAsistenteView(user)).getRoot());
          stage.setScene(svp);
          stage.show();
          e.consume();  
        });
        return contenedor;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificarPlatillo(Platillo platillo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
