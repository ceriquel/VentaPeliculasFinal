/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventapeliculas.modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import ventapeliculas.conexion.Conexion;

/**
 *
 * @author Cèsar
 */
public class ModeloListar {
    
     public ArrayList<Categoria> getListadoCategoria() throws SQLException{
        ArrayList<Categoria> listCategoria = null;
        String sql="SELECT NOMBRE_CATEGORIA FROM CATEGORIA";
        PreparedStatement preparedStatement;
        try {
            listCategoria=new ArrayList<>();
            preparedStatement = Conexion.getInstance().prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            Categoria categoria = new Categoria();
            categoria.setNombreCategoria(resultSet.getString("NOMBRE_CATEGORIA"));
            
            listCategoria.add(categoria);
        }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloListar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listCategoria;
    }
    
     public ArrayList<Pelicula> getListadoPeliculaEliminar() throws SQLException{
        ArrayList<Pelicula> listPelicula = null;
        String sql="SELECT CODIGO, NOMBRE FROM PELICULA";
        PreparedStatement preparedStatement;
        try {
            listPelicula=new ArrayList<>();
            preparedStatement = Conexion.getInstance().prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            Pelicula pelicula = new Pelicula();
            pelicula.setCodigo(resultSet.getInt("CODIGO"));
            pelicula.setNombre(resultSet.getString("NOMBRE"));
            
            listPelicula.add(pelicula);
        }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloListar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listPelicula;
    }
     
    public ArrayList<Pelicula> getListadoPelicula() throws SQLException{
        ArrayList<Pelicula> listPelicula = null;
        String sql="SELECT PP.CODIGO, PP.NOMBRE, PP.PRECIO, PP.FORMATO4K, CC.NOMBRE_CATEGORIA FROM PELICULA PP JOIN CATEGORIA CC ON PP.ID_CATEGORIA=CC.ID_CATEGORIA";
        PreparedStatement preparedStatement;
        try {
            listPelicula=new ArrayList<>();
            preparedStatement = Conexion.getInstance().prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            Pelicula pelicula = new Pelicula();
            pelicula.setCodigo(resultSet.getInt("CODIGO"));
            pelicula.setNombre(resultSet.getString("NOMBRE"));
            pelicula.setPrecio(resultSet.getInt("PRECIO"));
            pelicula.setFormato4k(resultSet.getString("FORMATO4K"));
            pelicula.setIdCatalogo(resultSet.getString("NOMBRE_CATEGORIA"));
            
            listPelicula.add(pelicula);
        }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloListar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listPelicula;
    }
}
