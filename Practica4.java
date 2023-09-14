/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica4;

import java.util.Scanner;
/**
 *
 * @author labcca
 */
public class Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dinero = new Scanner (System.in);
        System.out.println("");
        
        System.out.println("ingrese cantidad en pesos");
        double cantidad = dinero.nextInt();
        dinero.close();
        double convdoll= (double)(cantidad*17);
        double conveur= (double)(cantidad*18);
        System.out.println("De pesos a dolares:" + convdoll +"De pesos a euros:" + conveur);
        
    
}
}
