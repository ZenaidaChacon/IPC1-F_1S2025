/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_manejodearchivos;
//Importaciones para leer
import java.io.BufferedReader;
import java.io.FileReader;
//Importaciones para escribir
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
//Importaciones para los errores
import java.io.IOException;


/**
 *
 * @author zenai
 */
public class libBufferedReader {
    public void leerArchivo(){
        String text = "";
        try{
            BufferedReader br;
            FileReader fr = new FileReader("EjemploManejo2.txt");
            br = new BufferedReader(fr);
            System.out.println("El contenido del archivo es: ");
            String line = br.readLine();
            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
            fr.close();
        }catch(IOException e){
            System.out.println("Error al abrir o leer el archivo: ");
            e.printStackTrace();
            
        }catch(Exception e){
            System.out.println("Error al leer el teclado: ");
            e.printStackTrace();
        }
        
    }
    
    public void escribirArchivo(){
        String text = "";
        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter salida = null;
        
        try{
            BufferedReader br;
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Escribir Texto:");
            text = br.readLine();
            fw = new FileWriter("EjemploManejo3.txt");
            bw = new BufferedWriter(fw);
            salida = new PrintWriter(bw);
            salida.println(text);
        }catch(IOException e){
            System.out.println("Error al abrir o guardar el archivo");
        }catch(Exception e ){
            System.out.println("Error al leer el teclado");
            
        }finally{
            try{
                if(salida != null){ 
                    salida.close();
                }
   
            }catch(Exception ie){
                System.out.println("Error: "+ ie.toString());
            }
        }
    }
    
}
