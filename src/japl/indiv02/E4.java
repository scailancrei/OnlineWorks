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
public class E4 {
    public static void main(String[] args) {
        //Reciba 2 numeros desde teclado y realizar las siguientes acciones
        //Introducir variables
        int numero1, numero2;
        int resta, suma, multiplicacion;
        //Introducir informacion por teclado
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca numero 1: ");
        numero1 = teclado.nextInt();
        System.out.println("Introduzca numero 2: ");
        numero2 = teclado.nextInt();
        //Codificar con if else las operaciones
        if 
                //Si el primer numero es mayor que el segundo se realiza resta
                (numero1 > numero2) {
             resta = numero1 - numero2;
         System.out.println(" Debido a que " + numero1+ " es mayor que " + numero2 + " se restan ambos numeros dando el siguiente resultado:  " + resta);
          }
  
        else {
            //Si el primer numero es menor que el segundo se realiza suma
            if (numero1 < numero2) {
                suma = numero1 + numero2;
                System.out.println(" Debido a que " + numero1+ " es menor que " + numero2 + " se suman ambos numeros dando el siguiente resultado:  " + suma);
            }
            else 
                //Si ambos numeros son iguales se realizan multiplicaciones
                if (numero1 == numero2) {
                multiplicacion = numero1*numero2;
                    System.out.println(" Debido a que " + numero1 + " es igual que " + numero2 + " se multiplican ambos numeros dando el siguiente resultado:  " + multiplicacion);
                }
        }
        
    }
}
