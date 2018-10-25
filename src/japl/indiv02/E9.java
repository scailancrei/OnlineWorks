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
public class E9 {
    public static void main(String[] args) {
        //Mostrar tablas de multiplicar dependiendo del numero introducido
        //Variables para la tabla de multiplicar
        int numero, total;
        char tecla = 's';
        Scanner teclado  = new Scanner(System.in);
        
        while (tecla == 's') {            
            try {
              
                System.out.println("Ingrese el numero de la tabla a mostrar: ");
                numero = teclado.nextInt();
                
            for (int i = 0; i < 11; i++) {
            total = numero*i;
            System.out.println(numero + " x " + i + "=" + total); 
            
            }

            System.out.println("Introduzca letra S si desea volver a introducir otro numero: ");
            tecla = teclado.next().charAt(0);
            
        } catch(InputMismatchException exception) { //En caso de introducir una letra saldra el siguiente error.
             System.out.println("¡Solo se admiten valores de tipo numerico!");
             tecla = 'o';
                  
            
            
             }  
        }     
    }       
}
               