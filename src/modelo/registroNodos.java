/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author fabia
 */
public class registroNodos {
    public ArrayList<Nodo> ListaNodos = new ArrayList<>();
    
    
    
    public void IngresarNodo(String Dato)
    {
      
        Nodo NuevoNodo = new Nodo(Dato);
        
        
        this.ListaNodos.add(NuevoNodo);
    }
    
   
    public ArrayList ListarNodos()
    {
        
        return ListaNodos;
        
    }
    
}
  
    

