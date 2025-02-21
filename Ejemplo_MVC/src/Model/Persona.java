/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author zenai
 */
public class Persona extends Profesion{
    private String nombre;
    private int edad;
    
    public Persona(String nombreProfesion, String nombre, int edad){
        super(nombreProfesion);
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }

    
    @Override
    public String accionProfesion(){
        return "la persona con la profesion "+getNombreProfesion() + ", Su nombre es: "+getNombre()+", Tiene la edad de: "+getEdad();
    }
    
}
