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
public class E2 {
    public static void main(String[] args) {
        int numero;
        //Introducimos la clase scanner para pedir informacion por teclado
        Scanner teclado = new Scanner(System.in);
        //Pedimos la informacion por teclado
        System.out.println("Introduzca numero: ");
        numero = teclado.nextInt();
        
        if (numero > 0) {
            System.out.println("El numero introducido es positivo: ");
      } else {
        if (numero < 0) {
             System.out.println("El numero introducido es negativo");
            }
            if (numero == 0) {
                System.out.print("El numero introducido es el cero");
            }

            }
            }
         }

    
    

