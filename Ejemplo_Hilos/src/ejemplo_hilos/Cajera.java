/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_hilos;

/**
 *
 * @author zenai
 */
public class Cajera {
    private String nombre;

    public Cajera(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
   public void procesarCompra(Cliente cliente, long timeStamp){
       System.out.println(" seg " + "la cajera: "+this.nombre+"COMIENZA A ATENDER EL CLIENTE"+cliente.getNombre()+
               "esta siendo atendido en el tiempo: "+(System.currentTimeMillis()-timeStamp)/1000 + " Seg");
       for (int i = 0; i<cliente.getCompras().length; i++){
           System.out.println("Procesando los productos: "+(i+1)+"->en el tiempo:"+(System.currentTimeMillis()-timeStamp)/1000 + " Seg");
       }
       System.out.println("La cajera "+this.nombre +" ha terminado de atender al cliente: "+cliente.getNombre()+" en: "+(System.currentTimeMillis()-timeStamp)/1000 + " Seg");
   }
   
   private void esperarSegundos(int segundos){
       try{
           Thread.sleep(segundos*1000);
          
       }catch(InterruptedException ex){
           Thread.currentThread().interrupt();
       }
   }
    
}
