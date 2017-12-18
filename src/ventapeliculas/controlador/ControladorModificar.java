/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventapeliculas.controlador;

import java.sql.SQLException;
import ventapeliculas.modelo.ModeloModificar;

/**
 *
 * @author Cèsar
 */
public class ControladorModificar {
    
     private ModeloModificar modeloModificar;
    
    public void modificar(int codigo, int precio, String categoria, String formato4k, String nombre) throws SQLException{
        modeloModificar=new ModeloModificar();
        modeloModificar.modificar(codigo, precio, categoria, formato4k, nombre);
    }
    
}
