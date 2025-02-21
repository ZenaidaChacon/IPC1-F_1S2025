/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_hilos;

/**
 *
 * @author zenai
 */
public class Ejemplo_Hilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cliente1 = new Cliente("Cliente 1", new int[]{2,2,1,5,2,1});
        Cliente cliente2 = new Cliente("Cliente 2", new int[]{1,3,5,1,1});
        
        Cajera cajera1 = new Cajera("Cajera 1");
        Cajera cajera2 = new Cajera("Cajera 2");
        
        //Tiempo inicial
        long initialtime = System.currentTimeMillis();
        cajera1.procesarCompra(cliente1, initialtime);
        cajera2.procesarCompra(cliente2, initialtime);
    }
    
}
