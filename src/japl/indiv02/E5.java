/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japl.indiv02;

import java.util.Scanner;

/**
 *
 * @author ScaiLanCrei
 */
public class E5 {
    public static void main(String[] args) {
        //Vamos a introducir las variables
        int opcion, suma, resta, multiplicacion, division, salir;
        
        //Colocamos informacion de entrada y salida
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escoja una opcion: ");
        System.out.println("1. suma");
        System.out.println("2. resta");
        System.out.println("3. multiplicacion");
        System.out.println("4. division");
        System.out.println("5. salir");
        switch (opcion = teclado.nextInt()) {
            case 1: System.out.println("Opcion 1:");
                System.out.println("Se va a realizar una suma");
                break;
            case 2: System.out.println("Opcion 2");
                System.out.println("Se va a realizar una resta");
                break;
            case 3: System.out.println("Opcion 3");
                System.out.println("Se va a realizar una multiplicacion");
                break;
            case 4: System.out.println("Opcion 4 ");
                System.out.println("Se va a realizar una division");
                break;
            case 5: System.out.println("Opcion 5");
                System.out.println("Esta usted saliendo de la aplicacion");
                break;
            default:
                System.out.println("Este numero no coincide con ninguna de las opciones disponibles");
                
            
        }
                
                
                
    }
}
