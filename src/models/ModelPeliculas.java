/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author PC22
 */
public class ModelPeliculas {
    
    private Connection conexion;
    private Statement st
            ;
    private ResultSet rs;
    private PreparedStatement ps;
    private String sql;

    public int id_p;
    public String nombreP;
    public String formato;
    public String duracion;
    public String descripcion;
    
    
    public int getID_P(){
        return id_p;
    }
    public void setID_P(int id_p){
        this.id_p = id_p;
    }
    public String getNombreP(){
        return nombreP;
    }
    public void setNombreP(String nombreP){
        this.nombreP = nombreP;
    }
    public String getFormato(){
        return formato;
    }
    public void setFormato(String formato){
        this.formato = formato;
    }
    public String getDuracion(){
        return duracion;
    }
    public void setDuracion(String duracion){
        this.duracion = duracion;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
     public void Conectar(){
    
   try{
        System.out.println("er1");
        conexion=DriverManager.getConnection("jdbc:mysql://localhost/MagiaPeli","root","1234");
        System.out.println("er2");
        st = conexion.createStatement();
        System.out.println("er3");
        seleccionarTodos();
       System.out.println("er4");
}catch (SQLException ex){
    
   
        JOptionPane.showMessageDialog(null, "error 1" + ex.getMessage());
    
    }
    }   
    
    public void llenarValores(){
try{
setID_P(rs.getInt("id_peliculas"));
setNombreP(rs.getString("nombrep"));
setFormato(rs.getString("formato"));
setDuracion(rs.getString("duracion"));
setDescripcion(rs.getString("descripcion"));


}catch (SQLException ex){
JOptionPane.showMessageDialog(null,"error 2");

}
}
public void movePrimero(){
    try{
       rs.first();
        llenarValores();
        
    }
    catch(SQLException ex){
        JOptionPane.showMessageDialog(null, "error 3");
    }
}
public void moveUltimo(){
    try{
        rs.last();
        llenarValores();
        seleccionarTodos();
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, "error 4");
    }
}
public void moveSiguiente(){
    try{
        if(rs.isLast()== false)
         rs.next();
        llenarValores();
        seleccionarTodos();
    
    }catch (SQLException ex){
        JOptionPane.showMessageDialog(null, "error 5");
    }
}
public void moveAnterior(){
    try{
        if(rs.isFirst()== false)
        rs.previous();
        llenarValores();
        seleccionarTodos();
    }catch (SQLException ex){
        JOptionPane.showMessageDialog(null, "error 6");
    }
}
public void seleccionarTodos(){
    try{
        sql="SELECT * FROM peliculas:";
        ps =conexion.prepareStatement(sql);
        rs =ps.executeQuery();
        movePrimero();
        
        
    }
    catch (SQLException ex){
   JOptionPane.showMessageDialog(null, "error 1" + ex.getMessage());
    }
}

public void insertar(){
    try{
        sql= "INSERT INTO peliculas (nombrep,formato,duracion,descripcion)values (?,?,?,?)";
        ps=conexion.prepareStatement(sql);
        ps.setString (1,nombreP);
        ps.setString(2,formato);
        ps.setString(3,duracion);
        ps.setString(4,descripcion);
        ps.executeUpdate();
        movePrimero();
        
    } catch (SQLException ex){
        JOptionPane.showMessageDialog(null, "error 8");
    }
}
public void eliminar(int id_pelicula){
    try{
       sql="DELETE FROM peliculas where id_pelicula=?;";
       ps =conexion.prepareStatement(sql);
       ps.setInt(1,id_p);
       movePrimero();
       
    }catch (SQLException ex){
        JOptionPane.showMessageDialog(null," error 9");
        
    }
}
public void Actualizar(int id_p, String nombreP, String formato, String duracion, String descripcion){
    try{
        sql="UPDATE peliculas SET nombre =?, formato=?,duracion=?, descripcion=? WHERE id_pelicula=?;";
        ps=conexion.prepareStatement(sql);
        ps.setInt(3,id_p);
        ps.setString(0,nombreP);
        ps.setString(1, formato);
        ps.setString(2, duracion);
        ps.setString(4, descripcion);
     
        
        ps.executeUpdate();
        movePrimero();
        
    }catch (SQLException ex){
        JOptionPane.showMessageDialog(null," error 10");
    }
   
}
    
}
