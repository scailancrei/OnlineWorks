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
public class E3 {
    public static void main(String[] args) {
        //Indique cual es el mayor de dos numeros introducido por teclado
        //Si son iguales tambien ha de notificarlo.
        //Variables numeros
        int numero1, numero2;
        //Informacion por teclado
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca numero 1: ");
        numero1 = teclado.nextInt();
        System.out.println("Introduzca numero 2: ");
        numero2 = teclado.nextInt();
        //Estructura if-else para comparar los numeros
        if (numero1 > numero2) {
            System.out.println(" El numero " + numero1 +  " es mayor que " + numero2);
        }
        else if (numero1 < numero2) {
            System.out.println(" El numero " + numero1 + " es menor que " + numero2);
        }
        else if (numero1 == numero2) {
            System.out.println(" El numero " + numero1 + " es = que " + numero2);
        }
        }
    }
    

