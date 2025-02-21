/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author zenai
 */
public class Profesion {
    private String nombreProfesion;
    
    //Coonstructor, parametros dentro de parentesis
    public Profesion(String nombreProfesion){
        this.nombreProfesion = nombreProfesion;
        //Asignar una profesion
    }
    
    public void setNombreProfesion(String a1){
        this.nombreProfesion = a1;
    }
    
    public String getNombreProfesion(){
        return this.nombreProfesion;
    }
    
    public String accionProfesion(){
        return "La persona obtuvo la profesion: "+nombreProfesion;
    }
}
