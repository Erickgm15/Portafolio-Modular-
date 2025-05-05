package Programas;

import java.util.Scanner;

public class Div {

    public static void Division(){
        
        Scanner diventrada=new Scanner(System.in);

        System.out.println("Ingrese el primer número");
        double num1=diventrada.nextDouble();

        System.out.println("Ingrese el segundo número");
         double num2=diventrada.nextDouble();

         System.out.println("El resultado de la división es "+(num1/num2));
    
    }
}