/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maikel.ejer6;

import java.util.Scanner;


/**
 *
 * @author dam
 */
public class ejer6 {
     public static void main(String[] args) {
         int anno1;
         int anno2;
         int diferencia;
         Scanner entrada;
    entrada= new Scanner(System.in);

    System.out.println("introduce un valor de un año");
     anno1 =entrada.nextInt();
         System.out.println("introduce un valor de otro año");
           anno2 =entrada.nextInt();
           
           
           if (anno1<anno2)
        diferencia=anno1-anno2;
           else{
              diferencia=anno2-anno1;
              
           }
     }
}
