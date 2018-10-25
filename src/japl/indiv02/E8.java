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
public class E8 {
    public static void main(String[] args) {
        //Mostrar tablas de multiplicar dependiendo del numero introducido
        //Variables para la tabla de multiplicar
        int numero, total;
        Scanner teclado  = new Scanner(System.in);
        System.out.println("Ingrese el numero de la tabla a mostrar: ");
        numero = teclado.nextInt();
        
        for (int i = 0; i < 11; i++) {
            total = numero*i;
            System.out.println(numero + " x " + i + "=" + total);
        }
    }
    
}
