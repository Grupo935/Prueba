/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;

import catalogo.Platillo;
import java.util.LinkedList;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Carlos
 */
public interface MostrarPlatillo {
    public void mostrarPlatillo(Platillo platillo);
    public GridPane listarPlatillos(LinkedList<Platillo> platillo);
}
