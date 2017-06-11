/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;

import catalogo.Usuario;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 *
 * @author Carlos
 */
public class VentanaClienteView{
    private VBox root;
    private Button categoria,buscarPlatillo,cerrarSesion;
    //que podria recibir para el constructor
    public VentanaClienteView(){
        root=new VBox();
        crearBotones();
        root.getChildren().addAll(categoria,buscarPlatillo,cerrarSesion);
        root.setSpacing(10);
        root.setAlignment(Pos.CENTER);
        
    }
    public VentanaClienteView(Usuario user){
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
            
        });
        buscarPlatillo.setOnAction(e->{
            
        });
        cerrarSesion.setOnAction(e->{
            
        });
    }
    public VBox getRoot(){
        return root;
    }
    
}
