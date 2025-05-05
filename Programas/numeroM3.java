package Programas;

import java.util.Scanner;

public class numeroM3 {

    public static void numerosM3(){

        Scanner numerosentada =new Scanner(System.in);

        System.out.println("Ingresa tu  primer número");
        int num1=numerosentada.nextInt();

        System.out.println("Ingresa tu  segundo número");
        int num2=numerosentada.nextInt();

        System.out.println("Ingresa tu  tercer número");
        int num3=numerosentada.nextInt();

        int mayor=num1;

        int menor=num1;


        if (num2>mayor) {

            mayor=num2;
            
        }

        if (num3>mayor) {
            mayor=num3;
            
        }

        if (num2<menor) {
            menor=num2;

            if (num3<menor) {
                menor=num3;
                
            }

            System.out.println(" tu número mayor es "+mayor+", y el menor "+ menor);
            
        }
    }
}