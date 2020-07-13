/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios1;

import java.util.Scanner;

/**
 *
 * @author dalton
 */
public class Ejercicios1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double minutos=6,totalMinutos;
        Scanner scn = new Scanner(System.in);
        
        if (minutos <= 3) {
            System.out.println("Su lamada es valor de s/0.60");
            
        } else {
            totalMinutos=(0.6+(minutos -3)*0.3);
            System.out.println("El monto a pagar es: "+ totalMinutos);
        }
        
                      
        
    }
    
}
