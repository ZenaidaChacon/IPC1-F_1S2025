/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casteos;

/**
 *
 * @author zenai
 */

public class Casteos {

    public static int a;
    public static int b;
    public static String hola;
    public static char letra;

    public static void main(String[] args) {
        // TODO code application logic here
        Casteos.a = 40;
        Casteos.b = 10;
        Casteos.hola= "12";
        Casteos.letra = 'a';
        //Casteos de numeros a cadenas
        System.out.println(Integer.toString(Casteos.a)+": Se unieron :"+Casteos.hola);
        //Casteo implicito para decimales
        double v = Casteos.a;
        Integer numero = 50;
        int entero = numero;
        System.out.println(numero.doubleValue());
        //Ejemplo de numero a char
        char n = (char)Casteos.a;
        System.out.println(n);
        //De char a entero
        System.out.println((int)Casteos.letra);
        //De string a numero
        System.out.println(Integer.parseInt(hola));
        
        
        
        
    }
    
}
