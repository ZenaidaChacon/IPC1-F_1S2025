/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_mvc;
import Controller.Controller;
import Model.Persona;
import View.Vista;
/**
 *
 * @author zenai
 */
public class Ejemplo_MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vista vista = new  Vista(); //Creando instancia o objeto de vista
        
        //Uso del controlador
        Persona persona = new Persona("Estudiante", "Juan",15);
        Controller controller = new Controller(persona, vista);
        Persona persona2 = new Persona("Presidente", "Bernardo",60);
        Controller controller2 = new Controller(persona2, vista);
        
        //Usar las funciones en persona 1
        controller.accionPersona();
        controller.acciones();
         //Usar las funciones en persona 1
        controller2.accionPersona();
        controller2.acciones();
        
        
    }
    
}
