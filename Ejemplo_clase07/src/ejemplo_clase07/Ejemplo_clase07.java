/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_clase07;

/**
 *
 * @author zenai
 */
public class Ejemplo_clase07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PDFGenerator.generarPDF("Este es un texto de prueba para añadirlo al PDF", "Ejemplo_01", "C:\\Users\\zenai\\Desktop\\DocumentosPrueba");
        /*String[][] data ={
            {"ID", "Nombre", "Edad"},
            {"1", "David", "25"},
            {"2", "Maria", "21"},
            {"3", "Jose", "28"}
        };
        
        String[] headers = {"ID", "Nombre", "Edad"};
        PDFGenerator.generatePDFWithTable(data, headers, "Ejemplo_02", "C:\\Users\\zenai\\Desktop\\DocumentosPrueba");*/
        Vista v = new Vista();
        v.setVisible(true);
    }
    
    
}
