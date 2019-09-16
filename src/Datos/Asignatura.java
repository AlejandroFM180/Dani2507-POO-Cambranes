
package Datos;

import java.util.Scanner;

public class Asignatura {
    
 String nombreA ;
 int ndias;
 
  Scanner obtener = new Scanner(System.in);
 
    public void asignanombre(){
        System.out.println("¿Cual es el nombre de la materia?");
         nombreA = obtener.next(); 
    }
    
    public void numerodedias(){
        System.out.println("¿Cuantos dias son a la semana que daran la clase?");
         ndias= obtener.nextInt(); 
    }
    
        public void mostrarmateria(){
        System.out.println("La materia es: "+nombreA);
        System.out.println("La materia se dara "+ndias +"a la semana");
        
    }
}
