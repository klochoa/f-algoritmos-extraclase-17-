/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_principal;

import paquete_deportes.Equipo;
import paquete_deportes.Jugador;
import paquete_deportes.Tecnico;

/**
 *
 * @author Karla
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
         Jugador j1 = new Jugador("Manuel Alvarez", "Arquero",20);
        Jugador j2 = new Jugador("Eduardo Valencia", "Defensa",21);
        Jugador j3 = new Jugador("Fabian Cevallos", "Defensa",30);
        Jugador j4 = new Jugador("Antonio Lara", "Centrocampista",32);
        Jugador j5 = new Jugador("Luis Delgado", "Centrocampista",17);
        Jugador j6 = new Jugador("Xavier Lopez", "Delantro",25);
        
        Jugador [] jugadores = new Jugador [6];
        jugadores[0]=j1;
        jugadores[1]=j2;
        jugadores[2]=j3;
        jugadores[3]=j4;
        jugadores[4]=j5;
        jugadores[5]=j6;
   
        
        Tecnico t1 = new Tecnico("Luis Gomez", "Tecnico principal", 45);
        Tecnico t2 = new Tecnico("Julio Neto", "Asistente Tecnico", 46);
        Tecnico t3 = new Tecnico("Marco Silva", "Preparador Fisico", 47);
        
       
        Tecnico [] tecnicos = new Tecnico[3];
        tecnicos[0]=t1;
        tecnicos[1]=t2;
        tecnicos[2]=t3;
        
         
        Equipo e = new Equipo("Boca Juniors", "B", 1940, jugadores, tecnicos);
        System.out.println(e);
        
        
        
        
        
        
        
        
        
    }
    
}
