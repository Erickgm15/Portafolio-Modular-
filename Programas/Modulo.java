package Programas;

import java.util.Scanner;

public class Modulo {

    public static void modulo(){

        Scanner moduloentrada=new Scanner(System.in);
        System.out.println("Ingrese el primer núnero");
        double num1=moduloentrada.nextDouble();

        System.out.println("Ingrese el segundo número");
        double num2=moduloentrada.nextDouble();



        System.out.println("El residuo de "+num1+"/"+num2+" es "+(num1%num2));
    }
}