package Programas;

import java.util.Scanner;

public class KgAg {

    public static void conversion2(){
        
        Scanner kilogramosEntrada= new Scanner(System.in);

        System.out.println("Ingrese su cantidad en kilogramos");
        int kilogramos=kilogramosEntrada.nextInt();

        System.out.println(kilogramos+"  Los kilogramos equivalen a "+(kilogramos*1000)+" gramos");
    }
}