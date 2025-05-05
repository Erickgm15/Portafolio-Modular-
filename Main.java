
    

    import java.util.Scanner;
    
    import Programas.Opciones;
    import Vistas.vistas;

    public class Main{
public static void main(String[] args) {
    
     
        Scanner global=new Scanner(System.in);
        int opcion;

        do {
            vistas.banner();

            Programas.Opciones.opciones();

            System.out.println("[0] Salir");
            System.out.println("Ingrese una opción");

           

            
           


         opcion=global.nextInt();

            //OPCIONES
            switch (opcion) {
                case 1:
                 
              Programas.Sum.Sum();


                    
                    break;

                    case 2:

                    Programas.Resta.Resta();
                    break;

                    case 3:
                    Programas.Multi.Multi();
                    break;

                    case 4:
                    Programas.Div.Division();
                    break;

                    case 5:
                    Programas.Modulo.modulo();
                    break;

                    case 6:
                    Programas.Promedio3N.promedio();
                    break;

                    case 7:
                    Programas.numeroM2.numeroM2();
                    
                    break;

                    case 8:
                    Programas.numeroM3.numerosM3();
                    break;

                    case 9:
                    Programas.Metrosacm.conversion1();
                    break;

                    case 10:
                    Programas.KgAg.conversion2();
                    break;
            
                default:
                    break;
            }
        } while (opcion!=0);
    }
}

    

