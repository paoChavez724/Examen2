/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import models.*;
import views.*;
import controllers.*;

/**
 *
 * @author PC22
 */
public class Main {

   private static ModelPrincipal model_principal;
    private static ViewPrincipal view_principal;    
    private static ControllerPrincipal controller_Principal;
    
    private static ModelPeliculas model_peliculas;
    private static ViewPeliculas view_peliculas;    
    private static ControllerPeliculas controller_peliculas;
    
    private static ModelClientes model_clientes;
    private static ViewClientes view_clientes;
    private static ControllerClientes controller_clientes;
    
    private static ModelRentas model_rentas;
    private static ViewRentas view_rentas;
    private static ControllerRentas controller_rentas;
    
    public static void main (String pao[]){
        
       model_peliculas = new ModelPeliculas();
       view_peliculas = new ViewPeliculas();
       controller_peliculas = new ControllerPeliculas(model_peliculas, view_peliculas);
       
       model_clientes = new ModelClientes();
       view_clientes = new ViewClientes();
       controller_clientes = new ControllerClientes(model_clientes, view_clientes);
       
       model_rentas = new ModelRentas();
       view_rentas = new ViewRentas();
       controller_rentas = new ControllerRentas(model_rentas, view_rentas);
       
       model_principal = new ModelPrincipal();
       view_principal = new ViewPrincipal();
       controller_Principal = new ControllerPrincipal(model_principal, view_principal, view_clientes, view_peliculas, view_rentas);
    }
    
}
