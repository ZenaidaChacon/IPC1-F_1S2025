/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_manejodearchivos;
//Importaciones para usar file
import java.io.File;
import java.io.IOException;

/**
 *
 * @author zenai
 */
public class Ejemplo_ManejodeArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Ejemplo utilizando la libreria File
        /*
        try{
            File archivo = new File("EjemploManejo1.txt");
            System.out.println("Existe?"+ archivo.exists());
            boolean wasCreate = archivo.createNewFile();
            System.out.println("Se creo? "+wasCreate);
            System.out.println("Existe?"+ archivo.exists());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        
        //Escribir Archivo con FileOutputStream
        libFileOutput f = new libFileOutput();
        f.escribirArchivo();
        
        //Escribir Archivo con FileInputStream
        libFileInput f = new libFileInput();
        f.leerArchivo();
        //Escribir y leer archivo con BufferedReader
        libBufferedReader lb = new libBufferedReader();
        lb.leerArchivo();
        lb.escribirArchivo();
        //Ejemplo String Tokenizer
        libString ls = new libString();
        ls.ejemplo();*/
        
        //Ejemplo con console
        libConsole lc = new libConsole();
        lc.pedirDatos();
    }
    
}
