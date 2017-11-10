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
public class ModelClientes {
    private Connection conexion;
    private Statement st
            ;
    private ResultSet rs;
    private PreparedStatement ps;
    private String sql;

    public int id_c;
    public String nombreC;
    public String telefono;
    public String email;
    public String direccion;
    
    
    public int getID_C(){
        return id_c;
    }
    public void setID_C(int id_c){
        this.id_c = id_c;
    }
    public String getNombreC(){
        return nombreC;
    }
    public void setNombreC(String nombreC){
        this.nombreC = nombreC;
    }
    public String getTelefono(){
        return telefono;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direcccion){
        this.direccion = direccion;
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
setID_C(rs.getInt("id_clientes"));
setNombreC(rs.getString("nombrec"));
setTelefono(rs.getString("telefono"));
setEmail(rs.getString("email"));
setDireccion(rs.getString("direccion"));


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
        ps.setString (1,nombreC);
        ps.setString(2,telefono);
        ps.setString(3,email);
        ps.setString(4,direccion);
        ps.executeUpdate();
        movePrimero();
        
    } catch (SQLException ex){
        JOptionPane.showMessageDialog(null, "error 8");
    }
}
public void eliminar(int id_cliente){
    try{
       sql="DELETE FROM peliculas where id_cliente=?;";
       ps =conexion.prepareStatement(sql);
       ps.setInt(1,id_c);
       movePrimero();
       
    }catch (SQLException ex){
        JOptionPane.showMessageDialog(null," error 9");
        
    }
}
public void Actualizar(int id_c, String nombrec, String telefono, String email, String direccion){
    try{
        sql="UPDATE peliculas SET nombrec =?, telefono=?, email=?, direccion=? WHERE id_cliente=?;";
        ps=conexion.prepareStatement(sql);
        ps.setInt(3,id_c);
        ps.setString(0,nombrec);
        ps.setString(1, telefono);
        ps.setString(2, email);
        ps.setString(4, direccion);
     
        
        ps.executeUpdate();
        movePrimero();
        
    }catch (SQLException ex){
        JOptionPane.showMessageDialog(null," error 10");
    }
   
}
    
}
