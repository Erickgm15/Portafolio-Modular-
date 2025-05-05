package Programas;

import java.util.Scanner;

public class Promedio3N {

    public static void promedio(){
        
        Scanner promedioNumeros =new Scanner(System.in);
        System.out.println("Ingresea tu   primero número");
        double num1=promedioNumeros .nextDouble();

        System.out.println("Ingresea  tu  segundo número");
        double num2=promedioNumeros.nextDouble();

        System.out.println("Ingresa tu  tercer número");
        double num3=promedioNumeros.nextDouble();

        double resultado= (num1+num2+num3)/(3);

        System.out.println("El promedio de los 3 numeros es "+resultado);
    }
}