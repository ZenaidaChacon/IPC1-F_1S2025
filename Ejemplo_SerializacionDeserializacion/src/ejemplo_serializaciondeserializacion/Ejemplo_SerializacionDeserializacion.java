/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_serializaciondeserializacion;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
/**
 *
 * @author zenai
 */
public class Ejemplo_SerializacionDeserializacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Prueba de serializacion");
        Persona persona = new Persona("Alejandro", 26);
        try{
            FileOutputStream archivo = new FileOutputStream("persona.ser");
            ObjectOutputStream salida = new ObjectOutputStream(archivo);
            salida.writeObject(persona);
            System.out.println("Objeto serializado Correctamente");
        }catch (IOException e){
            System.out.println("el error es: "+ e.toString());
        }
        try{
            FileInputStream archivoD = new FileInputStream ("persona.ser");
            ObjectInputStream entrada = new ObjectInputStream(archivoD);
            Persona per = (Persona) entrada.readObject();
            System.out.println("Nombre: "+per.getNombre());
            System.out.println("Edad: "+per.getEdad());
            
            
        }catch (IOException|ClassNotFoundException e){
            e.printStackTrace();
        }
        
    }
    
}
