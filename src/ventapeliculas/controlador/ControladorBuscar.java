/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventapeliculas.controlador;

import java.sql.SQLException;
import ventapeliculas.modelo.ModeloBuscar;
import ventapeliculas.modelo.Pelicula;

/**
 *
 * @author Cèsar
 */
public class ControladorBuscar {
    
    private ModeloBuscar modeloBuscar;
    
     public Pelicula buscarPelicula(int codigo) throws SQLException{
         modeloBuscar=new ModeloBuscar();
         return modeloBuscar.buscarPelicula(codigo);
         
     }
    
}
