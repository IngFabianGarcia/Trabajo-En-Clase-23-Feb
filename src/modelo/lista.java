package modelo;


public class lista {
  Nodo  Primero;

public void InsertarNodo(String dato){
    Nodo nodoNuevo = new Nodo(dato);
    if(Primero == null){
        Primero = nodoNuevo;
    }
    else{
        
        nodoNuevo.siguiente= Primero;
        Primero = nodoNuevo;
    }
}  

public void ListarNodos(){
    Nodo Auxiliar;
    Auxiliar = Primero;
    while(Auxiliar!=null){
        System.out.println(Auxiliar.getDato());
        Auxiliar = Auxiliar.siguiente;
        
    }
}
}
