/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoderol;

/**
 *
 * @author Usuario
 */
public class Criatura{
    
    String nombre;
    int vida;
    int minpower;
    int maxpower;
    
    public Criatura (String nombre, int vida, int minpower, int maxpower){

        this.nombre = nombre;
        this.vida= vida;
        this.minpower = minpower;
        this.maxpower= maxpower;
    }
    
    public void atacar (String nombre, int vida){ 
       this.nombre = nombre;
       this.vida = vida;
    }
    
    public void golpear (int minpower, int maxpower){
        this.minpower = minpower;
        this.maxpower = maxpower;
    }
    
    public void setVida (int vida){
        this.vida=vida;
    }
    public int getVida (){
        return vida;
    }
    public void recuperar (){}
    public void descansar (){}
    
}
