/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventapeliculas.modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ventapeliculas.conexion.Conexion;

/**
 *
 * @author Cèsar
 */
public class ModeloBuscar {
    
     public Pelicula buscarPelicula(int codigo) throws SQLException{
        System.out.println("Buscar registro...");
        String sql="SELECT PP.NOMBRE, PP.PRECIO, PP.FORMATO4K, CC.NOMBRE_CATEGORIA FROM PELICULA PP JOIN CATEGORIA CC ON PP.ID_CATEGORIA=CC.ID_CATEGORIA WHERE CODIGO="+codigo;
        PreparedStatement preparedStatement;
        Pelicula pelicula=null;
        try {
            preparedStatement = Conexion.getInstance().prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            pelicula = new Pelicula();
           
            pelicula.setNombre(resultSet.getString("NOMBRE"));
            pelicula.setPrecio(resultSet.getInt("PRECIO"));
            pelicula.setFormato4k(resultSet.getString("FORMATO4K"));
            pelicula.setIdCatalogo(resultSet.getString("NOMBRE_CATEGORIA"));
            
        }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloBuscar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pelicula;
    }
    
}
