/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.emperador.ui;


import java.util.Scanner;
import mx.itson.emperador.negocio.Operacion;

public class Main {
    
    public static void main(String[] args) {
        
        
        System.out.println("Escriba el texo a separar");
        Scanner leer = new Scanner (System.in);
        
        String oracion = leer.nextLine();

        
        
        String [] resultado = new Operacion().separarComa(oracion);
        
        for(String r : resultado){
            String [] datosAlumno = new Operacion().separarEspacio(r);
            
            System.out.println("[ID: "+datosAlumno[0]+"] [Nombre y apeliido: "+datosAlumno[3]+" "+datosAlumno[1]+"]");
        }
        
        
    }
    
    
    
}
