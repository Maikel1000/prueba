/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maikel.ejercicio;

import java.util.Scanner;

/**
 *. Escribe un programa que introduzca un año y calcule si es bisiesto. 
“Un año es bisiesto si es múltiplo de 4 pero no de 100 o bien en múltiplo de 400” 

 * @author dam
 */
public class alternativas3 {
    public static void main(String[] args) {
        int anno;
        Scanner entrada;
        entrada=new Scanner (System.in);
        System.out.println("introduce el año(valor comprendido entre 1000 y 3000");
        anno=entrada.nextInt();
        
        if(anno<1000 || anno>3000)
        {
            System.out.println("valor invalido");
        }
        else{
            if(anno%4==0 && anno%100!=0 || anno%400==0)
            System.out.println("es bisiesto");
        
             else{
                System.out.println(anno+"no es bisiesto");
                }
                }
        System.out.println("fin de programa");
    }
}
