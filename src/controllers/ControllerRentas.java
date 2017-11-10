

package controllers;
import views.ViewRentas;
import models.ModelRentas;


public  class ControllerRentas {
     private final  ModelRentas model_rentas;
     private  final  ViewRentas view_rentas;
 
 public ControllerRentas (ModelRentas model_rentas, ViewRentas view_rentas){
    this.model_rentas =model_rentas;
    this.view_rentas =view_rentas;
    this.view_rentas.jbtn_primero.addActionListener(e-> jbtn_primero_click());
    this.view_rentas.jbtn_anterior.addActionListener(e->jbtn_anterior_click());
    this.view_rentas.jbtn_siguiente.addActionListener(e->jbtn_siguiente_click());
    this.view_rentas.jbtn_ultimo.addActionListener(e->jbtn_ultimo_click());
    this.view_rentas.jbtn_eliminar.addActionListener(e->jbtn_eliminar_click());
    this.view_rentas.jbtn_agregar.addActionListener(e->jbtn_agregar_click());
    this.view_rentas.jbtn_actualizar.addActionListener(e->jbtn_actualizar_click());
    initView();
    
}


public void getValores(){
    view_rentas.jtf_id_renta.setText(""+model_rentas.getID_R());
     view_rentas.jtf_id_pelicula.setText(""+model_rentas.getID_P());
      view_rentas.jtf_id_cliente.setText(""+model_rentas.getID_C());
    view_rentas.jtf_formato.setText(model_rentas.getFormato());
    view_rentas.jtf_costo.setText(model_rentas.getCostodia());
    view_rentas.jtf_dias.setText(model_rentas.getDia());
    view_rentas.jtf_total.setText(model_rentas.getRenta());
}

public void setValores(){
    model_rentas.setID_R(Integer.parseInt(view_rentas.jtf_id_renta.getText()));
     model_rentas.setID_P(Integer.parseInt(view_rentas.jtf_id_pelicula.getText()));
      model_rentas.setID_C(Integer.parseInt(view_rentas.jtf_id_cliente.getText()));
    model_rentas.setFormato(view_rentas.jtf_formato.getText());
    model_rentas.setCostodia(view_rentas.jtf_costo.getText());
    model_rentas.setDia(view_rentas.jtf_dias.getText());
    model_rentas.setRenta(view_rentas.jtf_total.getText());
}

public void jbtn_nuevo_click(){  
    view_rentas.jtf_id_renta.setText("");
    view_rentas.jtf_id_pelicula.setText("");
    view_rentas.jtf_id_cliente.setText("");
    view_rentas.jtf_formato.setText("");
    view_rentas.jtf_costo.setText("");
    view_rentas.jtf_dias.setText("");
    view_rentas.jtf_total.setText("");
}
public void jbtn_agregar_click(){
    setValores();
    model_rentas.insertar();
    getValores();
}
public void jbtn_actualizar_click(){
    setValores();
    model_rentas.Actualizar(model_rentas.getID_R(), model_rentas.getID_P(),model_rentas.getID_C(),model_rentas.getFormato(),model_rentas.getCostodia(),model_rentas.getDia(), model_rentas.getRenta());
    getValores();
}
public void jbtn_eliminar_click(){
    setValores();
    model_rentas.eliminar(model_rentas.getID_R());
    getValores();
}


public void jbtn_primero_click(){
    setValores();
    model_rentas.movePrimero();
    getValores();
}

public void jbtn_ultimo_click(){
 setValores();
    model_rentas.moveUltimo();
    getValores();
}

public void jbtn_anterior_click(){
    setValores();
    model_rentas.moveAnterior();
    getValores();
}

public void jbtn_siguiente_click(){
    setValores();
    model_rentas.moveSiguiente();
    getValores();
}
public void initView(){

   model_rentas.Conectar();
   view_rentas.setVisible(true);
   model_rentas.movePrimero();
   getValores();
   
}
    
}
