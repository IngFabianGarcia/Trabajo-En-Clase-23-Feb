/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas_enlazadas;

import Vista.frmPrincipal;
import Controlador.nodoControlador;
import modelo.Nodo;

/**
 *
 * @author umg
 */
public class Listas_Enlazadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frmPrincipal VistaPrincipal = new frmPrincipal();
        Nodo modeloNodo = new Nodo("");
        nodoControlador controler = new nodoControlador(VistaPrincipal, modeloNodo);
        
        
        
      
    }
    
}
