package Programas;

import Vistas.vistas;

public class Opciones {

   static String lista[]={

"La suma de 2 números",
"Resta de 2 números",
"Multiplicación de 2 numeros",
"División de 2 números",
"Módulo",
"Promedio de tres números",
"Número mayor y menor entre 2 números",
"Número mayor y menor entre 3 números",
"Conversión de metros a centímetros",
"Conversión de kilogramos a gramos"
    };

    public static void opciones(){

        for (int i = 0; i < lista.length; i++) {
            System.out.println("["+(i+1)+"]"+lista[i]);
            
        }
    
     }
    

    
}



 