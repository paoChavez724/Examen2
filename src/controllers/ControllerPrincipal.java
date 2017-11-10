/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import views.ViewPrincipal;
import views.ViewClientes;
import views.ViewPeliculas;
import views.ViewRentas;
import models.*;

/**
 *
 * @author PC22
 */
public class ControllerPrincipal {
    ModelPrincipal modelp;
    ViewPrincipal view_Principal;
    ViewClientes view_Clientes;
    ViewPeliculas view_Peliculas;
    ViewRentas view_Rentas;
    
    public ControllerPrincipal(ModelPrincipal modelp, ViewPrincipal view_principal, ViewClientes view_clientes, ViewPeliculas view_peliculas, ViewRentas view_rentas) {
        this.modelp = modelp;
        this.view_Principal = view_Principal;
        this.view_Clientes = view_Clientes;    
        this.view_Peliculas = view_Peliculas;
        this.view_Rentas = view_Rentas;
        view_Principal.jmi_clientes.addActionListener(e->jmi_clientes_click());
        view_Principal.jmi_peliculas.addActionListener(e ->jmi_peliculas_click());
        view_Principal.jmi_rentas.addActionListener(e ->jmi_rentas_click());
        initView();
    }

    private void jmi_clientes_click() {
        this.view_Principal.setContentPane(view_Clientes);
        this.view_Principal.revalidate();
        this.view_Principal.repaint();
    }
    private void jmi_peliculas_click(){
        this.view_Principal.setContentPane(view_Peliculas);
        this.view_Principal.revalidate();
        this.view_Principal.repaint();
    }
     private void jmi_rentas_click() {
        this.view_Principal.setContentPane(view_Rentas);
        this.view_Principal.revalidate();
        this.view_Principal.repaint();
    }
    
     private void initView(){
        this.view_Principal.setTitle("Peliculas");
        this.view_Principal.setLocationRelativeTo(null);
        this.view_Principal.setVisible(true);
    }
}
