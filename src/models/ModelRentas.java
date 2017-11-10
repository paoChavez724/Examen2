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
public class ModelRentas {
    private Connection conexion;
    private Statement st
            ;
    private ResultSet rs;
    private PreparedStatement ps;
    private String sql;

    public int id_r;
    public int id_p;
    public int id_c;
    public String formato;
    public String costodia;
    public String dia;
    public String renta;
    
    public int getID_R(){
        return id_r;
    }
    public void setID_R(int id_r){
        this.id_r = id_r;
    }
    public int getID_P(){
        return id_p;
    }
    public void setID_P(int id_p){
        this.id_p = id_p;
    }
    public int getID_C(){
        return id_c;
    }
    public void setID_C(int id_c){
        this.id_c = id_c;
    }
    public String getFormato(){
        return formato;
    }
    public void setFormato(String formato){
        this.formato = formato;
    }
    public String getCostodia(){
        return costodia;
    }
    public void setCostodia(String costodia){
        this.costodia = costodia;
    }
    
    public String getDia(){
        return dia;
    }
    public void setDia(String Dia){
        this.dia = dia;
    }
    
    public String getRenta(){
        return renta;
    }
    public void setRenta(String Renta){
        this.renta = renta;
    }
    
    public void llenarValores(){
try{
setID_R(rs.getInt("id_rentas"));
setID_C(rs.getInt("id_clientes"));
setID_P(rs.getInt("id_peliculas"));
setFormato(rs.getString("formato"));
setCostodia(rs.getString("costodia"));
setDia(rs.getString("dia"));
setRenta(rs.getString("renta"));

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
        sql="SELECT * FROM rentas:";
        ps =conexion.prepareStatement(sql);
        rs =ps.executeQuery();
        movePrimero();
        
        
    }
    catch (SQLException ex){
   JOptionPane.showMessageDialog(null, "error 1" + ex.getMessage());
    }
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

public void insertar(){
    try{
        sql= "INSERT INTO rentas ( id_peliculas, id_clientes, formato,costodia,dia,renta)values (?,?,?,?)";
        ps=conexion.prepareStatement(sql);
        ps.setString (1,formato);
        ps.setString(2,costodia);
        ps.setString(3,dia);
        ps.setString(4,renta);
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
       ps.setInt(1,id_r);
       movePrimero();
       
    }catch (SQLException ex){
        JOptionPane.showMessageDialog(null," error 9");
        
    }
}
public void Actualizar(int id_p, String nombreP, String formato, String duracion, String descripcion){
    try{
        sql="UPDATE renta SET formato =?, formato=?,duracion=?, descripcion=? WHERE id_pelicula=?;";
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

    public void Actualizar(int id_r, int id_p, int id_c, String formato, String costodia, String dia, String renta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

    

