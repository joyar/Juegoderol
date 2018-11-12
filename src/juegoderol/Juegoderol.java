/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoderol;
import javax.swing.JOptionPane;
import java.util.Random;
/**
 *
 * @author Usuario
 */
public class Juegoderol {
    
    
    
    public static void main(String[] args) {
 
        Criatura jugador1 = new Criatura ("Troyanito",100,10,25);  
        Criatura jugador2 = new Criatura("Toyu",100,8,26);
        
        JOptionPane.showMessageDialog(null, "Bienvenido a Force and Dragons"+'\n'+"Para comenzar a jugar presione Aceptar");
        JOptionPane.showMessageDialog(null, "Jugador 1: "+jugador1.nombre+"\nNivel de energía: "+jugador1.vida+"\nMínimo poder: "+jugador1.minpower+"\nMáximo poder: "+jugador1.maxpower);
        JOptionPane.showMessageDialog(null, "Jugador 2: "+jugador2.nombre+"\nNivel de energía: "+jugador2.vida+"\nMínimo poder: "+jugador2.minpower+"\nMáximo poder: "+jugador2.maxpower);
        JOptionPane.showMessageDialog(null, "¡Comienza la batalla!");
        int contador =0;
        contador = contador +1;
        Random aleatorio = new Random();    

        int n = aleatorio.nextInt(10);
        
        do {
       
        JOptionPane.showMessageDialog(null,"Round: "+contador+ "Ataca el jugador 1\nPulse Aceptar para dar inicio al ataque");
        
        jugador1.atacar("Troyano", 100);
        
        jugador1.golpear (10,25);

        JOptionPane.showMessageDialog(null, "Descuenta "+n+" puntos a su oponente");

        jugador2.vida = jugador2.vida-n;

        int b = aleatorio.nextInt(10);

        jugador1.vida = jugador1.vida-b;

        JOptionPane.showMessageDialog(null, "Round: "+contador+"Ataca el jugador 2\nPulse Aceptar para dar inicio al ataque");
        
        jugador2.atacar("Toyu", 100);
        
        jugador2.golpear (8,26);

        JOptionPane.showMessageDialog(null, "Descuenta "+b+" puntos a su oponente");
        Random aleas = new Random();    

        }

        while (jugador1.vida >0||jugador2.vida>0);
        
          
        if (jugador1.vida<= 0){
            
            JOptionPane.showMessageDialog(null, "Ganador: Jugador 2");
        }
        else {
            
            JOptionPane.showMessageDialog(null, "Ganador: Jugador 1");
        }
    }
}
       
        
    

    

 

        
        
        
        
    
    
    


