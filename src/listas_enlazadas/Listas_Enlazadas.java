/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas_enlazadas;

import modelo.lista;

/**
 *
 * @author umg
 */
public class Listas_Enlazadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        lista nuevaLista = new lista();
        
        nuevaLista.InsertarNodo(10);
        nuevaLista.InsertarNodo(20);
        nuevaLista.InsertarNodo(30);

        nuevaLista.ListarNodos();
    }
    
}
