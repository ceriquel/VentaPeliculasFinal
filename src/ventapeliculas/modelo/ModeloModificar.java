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
public class ModeloModificar {
    
    public void modificar(int codigo, int precio, String categoria, String formato4k, String nombre) throws SQLException{
        System.out.println("Modificar registro...");
        Statement dec;
        dec=Conexion.conexion.createStatement();
        String query1="UPDATE PELICULA SET NOMBRE='"+nombre+"', PRECIO="+precio+", ID_CATEGORIA=(SELECT ID_CATEGORIA FROM CATEGORIA WHERE NOMBRE_CATEGORIA='"+categoria+"'), FORMATO4K='"+formato4k+"' WHERE CODIGO="+codigo;
        dec.executeUpdate(query1);
    }
    
}
