package maikel.parimpar;

import java.util.Scanner;

public class parimpar {//clase

    public static void main(String[] args) {//main  
        int numero;
        int resto;
        Scanner entrada;
        entrada = new Scanner(System.in);

        System.out.println("introduce un número");
        numero = entrada.nextInt();
        resto = numero % 2;
        if (resto == 0) {//resto=0
            System.out.println(numero + " es par");
        }//fin resto=0
        else {//resto!=0
            System.out.println(numero + " es impar");

        }//fin resto!=0
    }//fin main
}//fin clase   

