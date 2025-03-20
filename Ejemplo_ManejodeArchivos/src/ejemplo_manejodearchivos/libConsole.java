/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_manejodearchivos;
import java.io.Console;
/**
 *
 * @author zenai
 */
public class libConsole {
    public void pedirDatos(){
        Console c = System.console();
        System.out.println("Usuario: ");
        String user = c.readLine();
        System.out.println("Password: ");
        char[] pass = c.readPassword();
        
        
        System.out.println("---------------------------");
        System.out.println("Los datos que se ingresaron son: ");
        System.out.println("Usuario: "+ user);
        System.out.println("Password: "+ pass);
    }
}
