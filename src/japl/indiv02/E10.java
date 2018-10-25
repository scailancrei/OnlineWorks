/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japl.indiv02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ScaiLanCrei
 */
public class E10 {
    public static void main(String[] args) {
        //Introducir un numero y que nos indique si es positivo.
        //Si no lo es finalizara el programa pero en caso de que sea mayor que
        // cero mostrara todos los numeros entre los que es divisible
        int numero;
        Scanner sc = new Scanner(System.in);
       
        
        try { 
        System.out.println("Introduce numero: ");
        numero = sc.nextInt();
        
        if (numero > 0) {
            System.out.println("El numero " + numero + " es positivo"); 
        
            for (int i = numero; i >= 1; i--) {
                if (numero%i==0) {
                    System.out.println(i);
                }
                
            }
            } else {
            if (numero <= 0) 
                System.out.println("El numero " + numero + "  es negativo"); 
                    }
                
            } catch (InputMismatchException e) {
                System.out.println("Solo se pueden introducir valores numericos");
                         }  
        }
}

    

