/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import models.ModelClientes;
import views.ViewClientes;

/**
 *
 * @author PC22
 */
public class ControllerClientes {
      private  final ModelClientes model_clientes;
    private final   ViewClientes view_clientes;
 
public ControllerClientes (ModelClientes model_clientes, ViewClientes view_clientes){
    this.model_clientes =model_clientes;
    this.view_clientes =view_clientes;
    this.view_clientes.jbtn_primero.addActionListener(e-> jbtn_primero_click());
    this.view_clientes.jbtn_anterior.addActionListener(e->jbtn_anterior_click());
    this.view_clientes.jbtn_siguiente.addActionListener(e->jbtn_siguiente_click());
    this.view_clientes.jbtn_ultimo.addActionListener(e->jbtn_ultimo_click());
    this.view_clientes.jbtn_eliminar.addActionListener(e->jbtn_eliminar_click());
    this.view_clientes.jbtn_agregar.addActionListener(e->jbtn_agregar_click());
    this.view_clientes.jbtn_actualizar.addActionListener(e->jbtn_actualizar_click());
    initView();
    
}


public void getValores(){
    view_clientes.jtf_id_cliente.setText(""+model_clientes.getID_C());
    view_clientes.jtf_nombreC.setText(model_clientes.getNombreC());
    view_clientes.jtf_telefono.setText(model_clientes.getTelefono());
    view_clientes.jtf_email.setText(model_clientes.getEmail());
    view_clientes.jtf_direccion.setText(model_clientes.getDireccion());
}

public void setValores(){
    model_clientes.setID_C(Integer.parseInt(view_clientes.jtf_id_cliente.getText()));
    model_clientes.setNombreC(view_clientes.jtf_nombreC.getText());
    model_clientes.setTelefono(view_clientes.jtf_telefono.getText());
    model_clientes.setEmail(view_clientes.jtf_email.getText());
    model_clientes.setDireccion(view_clientes.jtf_direccion.getText());
   
}

public void jbtn_nuevo_click(){  
    view_clientes.jtf_id_cliente.setText("");
    view_clientes.jtf_nombreC.setText("");
    view_clientes.jtf_telefono.setText("");
    view_clientes.jtf_email.setText("");
    view_clientes.jtf_direccion.setText("");
}
public void jbtn_agregar_click(){
    setValores();
    model_clientes.insertar();
    getValores();
}
public void jbtn_actualizar_click(){
    setValores();
    model_clientes.Actualizar(model_clientes.getID_C(), model_clientes.getNombreC(),model_clientes.getTelefono(),model_clientes.getEmail(),model_clientes.getDireccion());
    getValores();
}
public void jbtn_eliminar_click(){
    setValores();
    model_clientes.eliminar(model_clientes.getID_C());
    getValores();
}


public void jbtn_primero_click(){
    setValores();
    model_clientes.movePrimero();
    getValores();
}

public void jbtn_ultimo_click(){
 setValores();
    model_clientes.moveUltimo();
    getValores();
}

public void jbtn_anterior_click(){
    setValores();
    model_clientes.moveAnterior();
    getValores();
}

public void jbtn_siguiente_click(){
    setValores();
    model_clientes.moveSiguiente();
    getValores();
}
public void initView(){

   model_clientes.Conectar();
   view_clientes.setVisible(true);
   model_clientes.movePrimero();
   getValores();
   
}
    
}
