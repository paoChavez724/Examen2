/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.ModelPeliculas;
import views.ViewPeliculas;

/**
 *
 * @author PC22
 */
public class ControllerPeliculas {
    private final  ModelPeliculas model_peliculas;
    private  final  ViewPeliculas view_peliculas;
 
public ControllerPeliculas (ModelPeliculas model_clientes, ViewPeliculas view_clientes){
    this.model_peliculas =model_clientes;
    this.view_peliculas =view_clientes;
    this.view_peliculas.jbtn_primero.addActionListener(e-> jbtn_primero_click());
    this.view_peliculas.jbtn_anterior.addActionListener(e->jbtn_anterior_click());
    this.view_peliculas.jbtn_siguiente.addActionListener(e->jbtn_siguiente_click());
    this.view_peliculas.jbtn_ultimo.addActionListener(e->jbtn_ultimo_click());
    this.view_peliculas.jbtn_eliminar.addActionListener(e->jbtn_eliminar_click());
    this.view_peliculas.jbtn_agregar.addActionListener(e->jbtn_agregar_click());
    this.view_peliculas.jbtn_actualizar.addActionListener(e->jbtn_actualizar_click());
    initView();
    
}


public void getValores(){
    view_peliculas.jtf_id_pelicula.setText(""+model_peliculas.getID_P());
    view_peliculas.jtf_nombreP.setText(model_peliculas.getNombreP());
    view_peliculas.jtf_formato.setText(model_peliculas.getFormato());
    view_peliculas.jtf_duracion.setText(model_peliculas.getDuracion());
    view_peliculas.jtf_descripcion.setText(model_peliculas.getDescripcion());
}

public void setValores(){
    model_peliculas.setID_P(Integer.parseInt(view_peliculas.jtf_id_pelicula.getText()));
    model_peliculas.setNombreP(view_peliculas.jtf_nombreP.getText());
    model_peliculas.setFormato(view_peliculas.jtf_formato.getText());
    model_peliculas.setDuracion(view_peliculas.jtf_duracion.getText());
    model_peliculas.setDescripcion(view_peliculas.jtf_descripcion.getText());
   
}

public void jbtn_nuevo_click(){  
    view_peliculas.jtf_id_pelicula.setText("");
    view_peliculas.jtf_nombreP.setText("");
    view_peliculas.jtf_formato.setText("");
    view_peliculas.jtf_duracion.setText("");
    view_peliculas.jtf_descripcion.setText("");
}
public void jbtn_agregar_click(){
    setValores();
    model_peliculas.insertar();
    getValores();
}
public void jbtn_actualizar_click(){
    setValores();
    model_peliculas.Actualizar(model_peliculas.getID_P(), model_peliculas.getNombreP(),model_peliculas.getFormato(),model_peliculas.getDuracion(),model_peliculas.getDescripcion());
    getValores();
}
public void jbtn_eliminar_click(){
    setValores();
    model_peliculas.eliminar(model_peliculas.getID_P());
    getValores();
}


public void jbtn_primero_click(){
    setValores();
    model_peliculas.movePrimero();
    getValores();
}

public void jbtn_ultimo_click(){
 setValores();
    model_peliculas.moveUltimo();
    getValores();
}

public void jbtn_anterior_click(){
    setValores();
    model_peliculas.moveAnterior();
    getValores();
}

public void jbtn_siguiente_click(){
    setValores();
    model_peliculas.moveSiguiente();
    getValores();
}
public void initView(){

   model_peliculas.Conectar();
   view_peliculas.setVisible(true);
   model_peliculas.movePrimero();
   getValores();
   
}
    
}
