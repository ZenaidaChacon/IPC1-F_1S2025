/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Persona;
import Model.Profesion;
import View.Vista;
/**
 *
 * @author zenai
 */
public class Controller {
    private Persona persona; //Instanciar un objeto de tipo persona
    private Vista vista; //Instanciamso un objeto de tipo vista
    
    public Controller(Persona persona, Vista vista){
        this.persona = persona;
        this.vista = vista;
    }
    
    public void accionPersona(){
        vista.print(persona.accionProfesion());
        //Se imprime o ser manda a imprimimr en consola del objeto persona su metodo llamado accionProfesion
    }
    
    public void acciones(){
        if(persona instanceof Persona){
            vista.print(((Profesion)persona).accionProfesion());
        }else{
            vista.print("No hay Nada");
        }
    }
    
    
    
    
}
