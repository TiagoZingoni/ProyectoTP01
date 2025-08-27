/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tiago.zingoni
 */
public class Nodo {
    private Object elemento;
    private Nodo enlace;
    
    //Constructor
    
    public Nodo(Object elemento, Nodo enlace){
        this.elemento = elemento;
        this.enlace = enlace;
    }
    //Modificadoras
    
    public void setElemento(Object elemento){
        //Pone el elemento en el nodo
        this.elemento = elemento;
    }
    public void setEnlace(Nodo enlace){
        //Crea el enlace del nodo
        this.enlace = enlace;
    }
    //Observadoras
    public Object getElemento(){
        //Retorna el elemento del nodo
        return elemento;
    }
    public Nodo getEnlace(){
        //Retorna el enlace del nodo
        return enlace;
    }
}

