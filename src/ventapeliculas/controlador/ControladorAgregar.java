/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventapeliculas.controlador;

import java.sql.SQLException;
import ventapeliculas.modelo.ModeloAgregar;

/**
 *
 * @author Cèsar
 */
public class ControladorAgregar {
    
    private ModeloAgregar modeloAgregar;
    
    public boolean agregarCategoria(String nombreCategoria) throws SQLException{
        modeloAgregar=new ModeloAgregar();
        return modeloAgregar.agregarCategoria(nombreCategoria);
    }
    
    public boolean agregarPelicula(int precio, String categoria, String formato4k, String nombre) throws SQLException{
        modeloAgregar=new ModeloAgregar();
        return modeloAgregar.agregarPelicula(precio, categoria, formato4k, nombre);
    }
    
}
