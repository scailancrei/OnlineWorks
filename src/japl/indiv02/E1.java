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
public class E1 {
    public static void main(String[] args) {
        //Introducir variables
        int numero;
        //Pedir el numero por teclado
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce numero: ");
        numero = teclado.nextInt();
        //Configuramos los numeros positivos y negativos
        if (numero > 0) {
            System.out.println("El numero que has introducido es positivo: " + numero);
           
        } else 
            if (numero < 0) {
                System.out.println("El numero que has introducido es negativo: "+ numero);
            }
            
        }
    }
    

