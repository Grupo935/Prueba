
package Menus;

import catalogo.Usuario;
import java.util.LinkedList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javafx.scene.layout.HBox;
import catalogo.*;

/**
 *
 * @author Carlos
 */
public class VentanaClienteView{
    private VBox root;
    private Usuario user;
    private Button categoria,buscarPlatillo,cerrarSesion;
    private LinkedList<Categoria> listaCategoria;
    
    /*
    Aun queda por modficar esto, pienso que se puede hacer un herencia ejemplo ventanausuario (SuperClass) 
    y sub class Ventana Cliente y Ventana Asistente pero aun queda por definir bien los metodos
    
    
    */
    //que podria recibir para el constructor
   public VentanaClienteView(){
        root=new VBox();
        crearBotones();
        root.getChildren().addAll(categoria,buscarPlatillo,cerrarSesion);
        root.setSpacing(10);
        root.setAlignment(Pos.CENTER);
        
    }
    public VentanaClienteView(Usuario user){
       this.user=user;
        Label usuario=new Label("Bienvenido "+user.getUsuario());
        
        root=new VBox();
        crearBotones();
        root.getChildren().addAll(usuario,categoria,buscarPlatillo,cerrarSesion);
        root.setSpacing(10);
        root.setAlignment(Pos.CENTER);
        
    }
    private void crearBotones(){
        categoria=new Button("Listar Categoria de platos");
        buscarPlatillo=new Button("Buscar platillos");
        cerrarSesion=new Button("Cerrar Sesion");
        //Evento para 
        categoria.setOnAction(e->{
            Stage stage =(Stage) ((Node) e.getSource()).getScene().getWindow(); 
            Scene scene=new Scene(listarCategoria(listaCategoria));
            stage.setScene(scene);
            stage.show();
            e.consume();
        });
        buscarPlatillo.setOnAction(e->{
            
        });
        cerrarSesion.setOnAction(e->{
           InicioSesionView isv=new InicioSesionView();
           Scene isvs=new Scene(isv.getRoot());
           Stage stage= (Stage) ((Node) e.getSource()).getScene().getWindow();  
           stage.setScene(isvs);
           stage.show();
           e.consume();
        });
    }
    //aun queda por modificacion
  
    private VBox listarCategoria(LinkedList<Categoria> categoria){
        VBox contenedorListasCategorias=new VBox();
        
        for(Categoria c:categoria){
        int size=0;
            if(c.getPlatillos()!=null){
                size=c.getPlatillos().size();
            }
                   
       
        HBox contenedorLabel=new HBox();
        Label labelCategoria=new Label(c.getNombreCategoria());
        Label labelCantidad=new Label("Existen "+size+"platillos diferentes");
        Button escoger=new Button("escoger");
        contenedorLabel.getChildren().addAll(labelCategoria,labelCantidad,escoger);
        contenedorListasCategorias.getChildren().add(contenedorLabel);
        
        escoger.setOnAction(e->{
         
                //Aqui se necesitaria info de obtencion o un metodo csv para obtener datos de platillo  a base de categoria
//   mostrarPlatillos(LinkedList<Platillo> listado);
            e.consume();
        });
        }
        Button retornar=new Button ("Retornar");
        retornar.setOnAction(e->{
           Scene retornarScene=new Scene(this.getRoot());
           Stage stage= (Stage) ((Node) e.getSource()).getScene().getWindow();  
           stage.setScene(retornarScene);
           stage.show();
           e.consume();
        });
        contenedorListasCategorias.getChildren().add(retornar);
        return contenedorListasCategorias;
    }
    private void mostrarPlatillo(Platillo platillo){
        VBox contenedorDetallesPlatillo=new VBox();
        Label nombre=new Label(platillo.getNombre());
        Label servido=new Label(platillo.getServido());
        Label tipo=new Label(platillo.getTipo());
        //Label categoria=new Label(platillo.get);
        Label descripcion=new Label(platillo.getDescripcion());
        Label ingredientes=new Label(platillo.getIngredientes());
        contenedorDetallesPlatillo.getChildren().addAll(nombre,servido,tipo,ingredientes,descripcion);
        Stage stage= new Stage();
        Scene sceneDetalle=new Scene(contenedorDetallesPlatillo);
        stage.setTitle(platillo.toString());
        stage.setScene(sceneDetalle);
        stage.show();
    }
    //por modificar, quiero hace run metodo que compare un array con un sub array y realizar un listado
    private void mostrarPlatillos(LinkedList<Platillo> listado,String iniciales){
             VBox listadoContainer =new VBox();
        for(Platillo l:listado){
           // if(l.getNombre().)
            HBox fila =new HBox();
            Label nombrePlatillo=new Label(l.getNombre());
            Button escoger=new Button();
            escoger.setOnAction(e->{
                mostrarPlatillo(l);
                e.consume();
            });
                    
            fila.getChildren().addAll(nombrePlatillo,escoger);
            listadoContainer.getChildren().add(fila);
        }
        Stage stage= new Stage();
        Scene sceneDetalle=new Scene(listadoContainer);
       // stage.setTitle(platillo.toString());
        stage.setScene(sceneDetalle);
        stage.show();
    }
//por mdificar
    private void mostrarPlatillos(LinkedList<Platillo> listado){
        VBox listadoContainer =new VBox();
        for(Platillo l:listado){
            HBox fila =new HBox();
            Label nombrePlatillo=new Label(l.getNombre());
            Button escoger=new Button();
            escoger.setOnAction(e->{
                mostrarPlatillo(l);
                e.consume();
            });
                    
            fila.getChildren().addAll(nombrePlatillo,escoger);
            listadoContainer.getChildren().add(fila);
        }
        Stage stage= new Stage();
        Scene sceneDetalle=new Scene(listadoContainer);
       // stage.setTitle(platillo.toString());
        stage.setScene(sceneDetalle);
        stage.show();
        
    }
    
    public VBox getRoot(){
        return root;
    }

}
