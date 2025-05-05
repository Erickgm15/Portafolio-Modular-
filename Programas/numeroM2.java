package Programas;

import java.util.Scanner;

public class numeroM2 {

    public static void numeroM2(){

        Scanner numerosEn=new Scanner(System.in);

        System.out.println("Ingresa tu Primer numero ");
        int num1=numerosEn.nextInt();

        System.out.println("Ingresa tu segundo numero ");
        int num2=numerosEn.nextInt();


        int mayor=num1;
        int menor=num1;

        if (num2>mayor){
            mayor=num2;  
        }

        if (num2<menor) {
            menor=num2;
            
        }

        System.out.println(" Tu numero mayor es  "+mayor+",y el menor "+ menor);



    }
}