/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_manejodearchivos;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 *
 * @author zenai
 */
public class libString {
    public void ejemplo(){
        String txt = "";
        try{
            BufferedReader br;
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Escribir el texto: ");
            txt = br.readLine();
            System.out.println("\n\n El texto separado por espacios es : ");
            //Separa el texto por espacios por defecto
            StringTokenizer st = new StringTokenizer(txt);
            while(st.hasMoreTokens()){
                System.out.println(st.nextToken());
            }
            br.readLine();
            System.out.println("\n\n El texto Completo es: ");
            System.out.println(txt);
        } catch(Exception e){
            System.out.println("\n Error al leer el teclado");
        }
    }
    
}
