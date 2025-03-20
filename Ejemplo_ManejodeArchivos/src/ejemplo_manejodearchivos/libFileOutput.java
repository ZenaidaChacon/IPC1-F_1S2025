/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_manejodearchivos;

import java.io.FileOutputStream;
import java.io.IOException;
/**
 *
 * @author zenai
 */
public class libFileOutput {
    public void escribirArchivo(){
        FileOutputStream archivo = null;
        byte[] buffer = new byte[81];
        int nBytes;
        try{
            System.out.println("Escribir el texto a guardar en el archivo: ");
            nBytes = System.in.read(buffer);
            archivo = new FileOutputStream("EjemploManejo2.txt");
            archivo.write(buffer,0,nBytes);
            
        }catch(IOException e){
            System.out.println("Error: "+e.toString());
        }finally{
            try{
                if(archivo != null){
                    archivo.close();
                }
            }catch(IOException ioe){
                System.out.println("Error: "+ioe.toString());
            }
                
            }
        }
            
        
    }
        

