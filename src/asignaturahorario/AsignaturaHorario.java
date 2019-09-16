
package asignaturahorario;

import Datos.Asignatura;
import Datos.Horario;
public class AsignaturaHorario {

   
    public static void main(String[] args) {
      
      Asignatura Asig = new Asignatura(); 
      Horario Hora = new Horario();
        
      Asig.asignanombre();
      Asig.numerodedias();
      Hora.Asignadia();
      Hora.HoraE();
      Hora.minutosE();
      Hora.HoraS();
      Hora.minutosS();
      Asig.mostrarmateria();
      Hora.mostrarhorario();
        
    }
    
}

