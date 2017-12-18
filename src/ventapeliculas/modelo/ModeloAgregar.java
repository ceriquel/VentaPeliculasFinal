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
public class ModeloAgregar {
    
    public boolean agregarCategoria(String nombreCategoria) throws SQLException{
        boolean flag=false;
        System.out.println("Insertar registro...");
        Statement dec;
        dec=Conexion.conexion.createStatement();
        String query1="insert into CATEGORIA (NOMBRE_CATEGORIA) VALUES ('"+nombreCategoria+"')";
        dec.executeUpdate(query1);
        return flag=true;    
    }
    
    public boolean agregarPelicula(int precio, String categoria, String formato4k, String nombre) throws SQLException{
        boolean flag=false;
        System.out.println("Insertar registro...");
        Statement dec;
        dec=Conexion.conexion.createStatement();
        String query1="insert into PELICULA (PRECIO, ID_CATEGORIA, FORMATO4K, NOMBRE) VALUES ("+precio+", (SELECT ID_CATEGORIA FROM CATEGORIA WHERE NOMBRE_CATEGORIA='"+categoria+"'), '"+formato4k+"', '"+nombre+"')";
        dec.executeUpdate(query1);
        return flag=true;    
    }
    
}
