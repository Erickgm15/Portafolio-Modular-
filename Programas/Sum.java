package Programas;

import java.util.Scanner;

public class Sum {

    public static void Sum(){

        Scanner suma=new Scanner(System.in);

        System.out.println("Ingrese el primer número");
        double num1=suma.nextDouble();

        System.out.println("Ingrese el segudno núnero");
        double num2=suma.nextDouble();

        System.out.println("El resultado de la resta es "+ (num1+num2));

    }
}