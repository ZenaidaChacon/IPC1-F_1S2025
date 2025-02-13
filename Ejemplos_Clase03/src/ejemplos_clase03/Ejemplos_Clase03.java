/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplos_clase03;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author zenai
 */
public class Ejemplos_Clase03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ExpresionesAritmeticas();
        //Entradas();
        //EjemploIf();
        //menuSwitch();
        //EjemploWhile();
        //EjemploDoWhile();
        //EjemploFor();
        //EjemploForEach();
        //Tablero();
        //Tablero2();
        tableroAleatorio();
    }
    
    public static void ExpresionesAritmeticas(){
        System.out.println("Expresiones");
        System.out.print("Se imprimio");
        System.out.println("---------------");
        int a= 10;
        int b = 20;
        System.out.println(a+b);
        int suma = a+b;
        System.out.println("la suma es: "+suma);
        
        System.out.println("Expresiones abreviadas");
        System.out.println("Suma: "+(a+=b));
        a +=b;
        
        System.out.println(a);
    }
    
    public static void Entradas(){
        Scanner valor = new Scanner(System.in);
        System.out.println("Ingrese lo que se le solicita");
        //Para palabras
        System.out.println("Ingrese un nombre:");
        String nombre = valor.nextLine();
        System.out.println("El nombre es: "+ nombre);
        //Para numeros
        System.out.println("Ingrese un numero entero");
        int numero = valor.nextInt();
        System.out.println("El numero es: "+numero);
               
    }
    
    public static void EjemploIf(){
        //If
        int a =10;
        if(a == 10){
            System.out.println("Son iguales");
        }
        //if-else
        int edad = 15;
        if(edad >= 18 ){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
        
        //Else if
        int  notas = 80;
        
        if(notas < 61){
            System.out.println("Perdio la clase");
        }else if(notas == 61){
            System.out.println("Paso raspando la clase");
        }else{
            System.out.println("Se gano la clase");
        }
        
    }
    
    //Ejemplo switch
    public static void menuSwitch(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido, este es el menu de inicio ");
        System.out.println("1. Nombre");
        System.out.println("2. Salir");
        System.out.println("Eliga una opcion porfavor");
        int opcion = sc.nextInt();
        switch(opcion){
            case 1: 
                System.out.println("Mi nombre es xxxxxxxxx");
                menuSwitch();
                break;
            case 2:
                System.out.println("Saliendo del programa");
                break;
            default:
                System.out.println("No existe esa opcion");
                menuSwitch();
        }
    }
    
    //Ejemplo While
    public static void EjemploWhile(){
        int j = 0;
        boolean flag = false;
        while(flag == false){
            System.out.println("Valor: "+ j);
            j++;
            if(j == 5){
                flag = true;
            }
        }
    }
    //Ejemplo ciclo doWhile
    public static void EjemploDoWhile(){
        int j = 1;
        do{
            System.out.println("Esta es la iteracion: "+j);
            j++;
        }while(j <=5 );
    }
    //Ejemplo de for
    public static void EjemploFor(){
        for(int i=5; i>0; i--){
            System.out.println("El valor de i es: "+i);
        }
    }
    
    //Ejemplo de for each
    public static void EjemploForEach(){
        int[] numeros = {1,2,3,4,5};
        String [] palabras = {"uno", "dos", "tres"};
        for(String p: palabras){
            System.out.println(p);
        }
    }
    
    //Ejemplo de tablero forma 1
    public static void Tablero(){
        //Tablero de 5*5
        int [][] tablero = new int[5][5];
        int[] Fila = {1,2,3,4,5};
        int[] Columna = {10, 20,30,40,50};
        
        //LLenar tablero con la suma de los dos vectores
        for(int i = 0; i<5; i++){
            for(int j = 0; j<5;j++){
                tablero[i][j] = Fila[i]+Columna[j];
            }
        }
        //Accediendo mediante coordenadas
        System.out.println("Posicion tablero [0][0]"+ tablero[0][0]);
        
        //Impriendo la matriz completa
        for(int i = 0; i<5; i++){
            for(int j = 0; j<5;j++){
                //System.out.print("los valores son: "+tablero[i][j]);
                System.out.print(tablero[i][j]+"\t");
            }
            System.out.println();
        }
    }
    //Ejemplo de tablero forma 2
    public static void Tablero2(){
        //Tablero de 5*5
        int[][] tablero = {
            {1,2,3,4,5},
            {1,2,3,4,5},
            {1,2,3,4,5},
            {1,2,3,4,5},
            {1,2,3,4,5},
        };
        //Impriendo la matriz completa
        for(int i = 0; i< tablero[i].length-1; i++){
            for(int j = 0; j< tablero[i].length-1;j++){
                //System.out.print("los valores son: "+tablero[i][j]);
                System.out.print(tablero[i][j]+"\t");
            }
            System.out.println("");
        }
        
    }
    //Ejemplo de tablero aleatorio
    public static void tableroAleatorio(){
        char[][] tablero = new char[5][5];
        Random random = new Random();
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //LLenar matriz con letras aleatorias
        for (int i = 0; i<5; i++){
            for(int j=0; j<5; j++){
                tablero[i][j]=letras.charAt(random.nextInt(letras.length()));
            }
        }
        
        
        tablero[0][0]='H';
        tablero[0][1]='o';
        tablero[0][2]='l';
        tablero[0][3]='a';
        
        //Impriendo la matriz completa
        for(int i = 0; i<5; i++){
            for(int j = 0; j<5;j++){
                //System.out.print("los valores son: "+tablero[i][j]);
                System.out.print(tablero[i][j]+"\t");
            }
            System.out.println();
        }
        
        //Buscar letra
         for(int i = 0; i<5; i++){
            for(int j = 0; j<5;j++){
                if(tablero[i][j]=='H'){
                    tablero[i][j] = '#';
                }
            }  
        }
        System.out.println("------------------------"); 
        System.out.println("Se encontro Letra");
         System.out.println("------------------------"); 
               //Impriendo la matriz completa
        for(int i = 0; i<5; i++){
            for(int j = 0; j<5;j++){
                //System.out.print("los valores son: "+tablero[i][j]);
                System.out.print(tablero[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
}


