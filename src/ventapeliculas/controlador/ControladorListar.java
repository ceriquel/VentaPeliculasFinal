/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventapeliculas.controlador;

import java.sql.SQLException;
import java.util.ArrayList;
import ventapeliculas.modelo.Categoria;
import ventapeliculas.modelo.ModeloListar;
import ventapeliculas.modelo.Pelicula;

/**
 *
 * @author Cèsar
 */
public class ControladorListar {
    
    private ModeloListar modeloListar;
    
    public ArrayList<Categoria> getListadoCategoria() throws SQLException{
        modeloListar=new ModeloListar();
        return modeloListar.getListadoCategoria();
    }
    
    public ArrayList<Pelicula> getListadoPeliculaEliminar() throws SQLException{
        modeloListar=new ModeloListar();
        return modeloListar.getListadoPeliculaEliminar();
    }
    
    public ArrayList<Pelicula> getListadoPelicula() throws SQLException{
        modeloListar=new ModeloListar();
        return modeloListar.getListadoPelicula();
    }
}
