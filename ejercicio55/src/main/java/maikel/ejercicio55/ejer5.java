/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maikel.ejercicio55;

import java.util.Scanner;

/**
 *
 * @author dam
 */
public class ejer5 {
    public static void main(String[] args) {
    System.out.println("introduce un valor del dia");
    Scanner entrada;
    entrada= new Scanner(System.in);
    int dia =entrada.nextInt();
    switch (dia){
        case 1:System.out.println("lunes");
        break;
         case 2:System.out.println("martes");
        break;
         case 3:System.out.println("miercoles");
        break;
         case 4:System.out.println("jueves");
        break;
         case 5:System.out.println("viernes");
        break;
         case 6:System.out.println("sabado");
        break;
         case 7:System.out.println("domingo");
        break;
         default:System.out.println("error");
    }
    }
    }
