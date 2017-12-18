/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventapeliculas.modelo;

import java.sql.SQLException;
import java.sql.Statement;
import ventapeliculas.conexion.Conexion;

/**
 *
 * @author Cèsar
 */
public class ModeloBorrar {
    
    public void borrarPelicula(int codigo) throws SQLException{
        System.out.println("Borrar registro...");
        Statement dec;
        dec=Conexion.conexion.createStatement();
        String query1= "DELETE FROM PELICULA WHERE CODIGO="+codigo;
        dec.executeUpdate(query1);
     }
    
}
