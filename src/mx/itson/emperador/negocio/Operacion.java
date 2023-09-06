/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.emperador.negocio;
/**
 * Contiene métodos para trabajar con tipo de datos String.
 * @author Yovan
 */


public class Operacion {
    
    /**
     * Separa una cadena de texto cada que detecta una coma (,).
     * @param valor Cadena de texto que será separada a partir de la expresión dada.
     * @return Array de String en donde cada posición representa una división de la cadena de texto.
     */
    
    
    
   public String[] separarComa (String valor){
   
       String[] elementos =valor.split(",");
   
       return elementos;
   
   }
   
   /**
     * Separa una cadena de texto cada que detecta un espacio.
     * @param valor Cadena de texto que será separada a partir de la expresión dada.
     * @return Array de String en donde cada posición representa una división de la cadena de texto.
     */
   
   public String[] separarEspacio (String valor){
   
       String[] elementos =valor.split(" ");
   
       return elementos;
   
   }
   
   
   
}