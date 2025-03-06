/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_clase07;

/**
 *
 * @author zenai
 */
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.*;
import javax.swing.AbstractAction.*;
import javax.swing.JOptionPane;

public class PDFGenerator {
    public static void generarPDF(String text, String fileName, String outputDirectory){
        Document document = new Document();
        try{
            
            String outputPath = validatePath(fileName, outputDirectory);
            PdfWriter.getInstance(document, new FileOutputStream(outputPath));
            document.open();
            
            document.add(new Paragraph(text));
            document.close();
            JOptionPane.showMessageDialog(null, "PDF creado con Exito en: "+outputPath);
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al generar el PDF: "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static String validatePath(String fileName, String outputDirectory){
        //Ver si la carpeta existe
            File dir = new File(outputDirectory);
            if(!dir.exists()){
                dir.mkdirs();
            }
        //Verificar si el archivo existe
        File file = new File(outputDirectory, fileName+".pdf");
        int count = 1;
        while(file.exists()){
            file = new File(outputDirectory, fileName+"_"+count+".pdf");
            count++;
        }
        if(count>1){
            JOptionPane.showMessageDialog(null, "El archivo ya existia, se guardo como: " + file.getName());
        }
        return file.getAbsolutePath();
    }
    
    public static void generatePDFWithTable(String[][] data, String[] headers,String fileName, String outputDirectory ){
                Document document = new Document();
        try{
            
            String outputPath = validatePath(fileName, outputDirectory);
            PdfWriter.getInstance(document, new FileOutputStream(outputPath));
            document.open();
            //Crear tabla con el numero de columnas
            PdfPTable table = new PdfPTable(headers.length);
            //Agregar los encabezados
            for(String header: headers){
                PdfPCell cell = new PdfPCell(new Phrase(header));
                cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
                table.addCell(cell);
            }
            //Agregar los datos
            for(String[] row: data){
                for(String cellData : row){
                    table.addCell(cellData);
                }
                
            }
            document.add(table);
            document.close();
            JOptionPane.showMessageDialog(null, "PDF con tabla creado con Exito en: "+outputPath);
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al generar el PDF: "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void generatePDFWithImage(String imagePath, String fileName, String outputDirectory ){
                Document document = new Document();
        try{
            
            String outputPath = validatePath(fileName, outputDirectory);
            PdfWriter.getInstance(document, new FileOutputStream(outputPath));
            document.open();
            //Agregar un titulo
            Font fontNegrita = new Font(Font.FontFamily.HELVETICA, 16, Font.BOLD );
            Paragraph titulo = new Paragraph("Este es un PDF con Imagen", fontNegrita);
            titulo.setAlignment(Element.ALIGN_CENTER);
            document.add(titulo);
            //Espacio entre titulo e imagen
            document.add(new Paragraph("\n"));
            //Agregar la imagen
            try{
                Image img = Image.getInstance(imagePath);
                img.scaleToFit(500,500);//Ajustar el tamaño
                document.add(img);
            }catch(Exception imgEx){
                JOptionPane.showMessageDialog(null, "No se pudo añadir la imagen");
            }       
            
            document.close();
            JOptionPane.showMessageDialog(null, "PDF con Imagenes creado con Exito en: "+outputPath);
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al generar el PDF: "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
