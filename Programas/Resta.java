package Programas;

import java.util.Scanner;

public class Resta {

    public static void Resta(){

        Scanner restaentrada=new Scanner(System.in);

        System.out.println("Ingrese el primer número");
        double num1=restaentrada.nextDouble();

        System.out.println("Ingrese el segudno núnero");
        double num2=restaentrada.nextDouble();

        System.out.println("El resultado de la resta es "+ (num1-num2));

    }
}