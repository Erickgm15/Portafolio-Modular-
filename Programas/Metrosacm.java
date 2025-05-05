package Programas;

import java.util.Scanner;

public class Metrosacm {

    public static void conversion1(){

        Scanner metrosEntrada=new Scanner(System.in);

        System.out.println("Ingrese su cantidad en metros");
        int metros=metrosEntrada.nextInt();

        System.out.println(metros+" Los metros equivalen a "+(metros*100)+" centímetros");


    }
}