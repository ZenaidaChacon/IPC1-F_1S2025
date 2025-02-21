/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_hilos;

/**
 *
 * @author zenai
 */
public class Cliente {
    private String nombre;
    private int[] compras;

    public Cliente(String nombre, int[] compras) {
        this.nombre = nombre;
        this.compras = compras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getCompras() {
        return compras;
    }

    public void setCompras(int[] compras) {
        this.compras = compras;
    }


    
    
}
