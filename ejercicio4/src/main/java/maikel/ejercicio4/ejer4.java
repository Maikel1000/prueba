/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maikel.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author dam
 */
public class ejer4 {
public static void main(String[] args) {
    System.out.println("introduce un valor del 1 al 10");
    Scanner entrada;
    entrada= new Scanner(System.in);
    int nota =entrada.nextInt();
    switch (nota){
        case 1:System.out.println("insuficiente");
        break;
         case 2:System.out.println("insuficiente");
        break;
         case 3:System.out.println("insuficiente");
        break;
         case 4:System.out.println("insuficiente");
        break;
         case 5:System.out.println("suficiente");
        break;
         case 6:System.out.println("bien");
        break;
         case 7:System.out.println("notable");
        break;
         case 8:System.out.println("notable");
        break;
         case 9:System.out.println("sobresaliente");
        break;
         case 10:System.out.println("sobresaliente");
        break;
         default:System.out.println("error");
    }
            
}
}

