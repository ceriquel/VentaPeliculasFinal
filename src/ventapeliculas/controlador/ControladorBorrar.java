/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventapeliculas.controlador;

import java.sql.SQLException;
import ventapeliculas.modelo.ModeloBorrar;

/**
 *
 * @author Cèsar
 */
public class ControladorBorrar {
    
     private ModeloBorrar modeloBorrar;
    
    public void borrarPelicula(int codigo) throws SQLException{
        modeloBorrar=new ModeloBorrar();
        modeloBorrar.borrarPelicula(codigo);
    }
    
}
