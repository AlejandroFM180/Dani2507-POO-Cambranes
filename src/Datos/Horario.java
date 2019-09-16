
package Datos;

import java.util.Scanner;

public class Horario {
    String diaf;
    int horaen;
    int minutoen;
    int horasa;
    int minutosa;
    Scanner obtener = new Scanner(System.in);
    
    public void Asignadia(){
        System.out.println("Que dia es las clases?"); 
              
         diaf= obtener.next();
    }
 
    public void HoraE(){
        System.out.println("A que hora es la entrada?");
         horaen = obtener.nextInt();
       
    }
    
     public void minutosE(){
          System.out.println("Cual es el minuto de entrada?");
         minutoen= obtener.nextInt();; 
        
    }
    
    public void HoraS(){
        System.out.println("A que hora es la salida?");
         horasa=obtener.nextInt();
        
    }
    
     public void minutosS(){
          System.out.println("Cual es el minuto de salida?");
         minutosa = obtener.nextInt();
        
    }
    
    public void mostrarhorario(){
        System.out.println("El dia de la materia es: "+diaf);
        System.out.println("Hora de entrada: "+horaen+":"+minutoen);
        System.out.println("Hora de Salida: "+horasa+":"+minutosa);
  
    }   
}
