/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_manejodearchivos;
import java.io.FileInputStream;
import java.io.IOException;
/**
 *
 * @author zenai
 */
public class libFileInput {
    public void leerArchivo(){
        FileInputStream archivo = null; 
        byte[] buffer = new byte[81];
        int nbytes;
        try{
            archivo = new FileInputStream("EjemploManejo2.txt");
            nbytes = archivo.read(buffer,0,81);
            while(nbytes != -1){
                String text = new String(buffer, 0, nbytes);
                System.out.println("Este es el texto: "+text);
                nbytes = archivo.read(buffer,0,81);
            }
            
            
        }catch(IOException e){
            System.out.println(e.toString());
            
        }finally{
            try{
                if(archivo != null) archivo.close();
            }catch(IOException e){
                System.out.println("Error:"+e.toString()+", no se pudo cerrar el archivo");
            }
        }
        
        
    }
    
}
