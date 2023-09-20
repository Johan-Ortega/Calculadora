
package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        
        Scanner o = new Scanner(System.in);
        Scanner n = new Scanner(System.in);
        int opcion;
        
        System.out.println("\n¿Qué operacion desea hacer?: \n"
            + "1. Para realizar una Suma \n"
            + "2. Para realizar una Resta\n"
            + "3. Para realizar una Multipliación\n"
            + "4. Para realizar una División\n");
        
        opcion = o.nextInt();
        
        while(0<opcion && opcion<5){
        
            System.out.println("Ingrese la primera cantidad: ");
            int x = n.nextInt();
            System.out.println("Ingrese la segunda cantidad: ");
            int y = n.nextInt();

            Calculos cal = new Calculos();
            cal.setNumeros(x, y);
        
            switch(opcion){

                case 1:
                    System.out.println("La suma es: [" + cal.Suma() + "]");
                    break;

                case 2:
                    System.out.println("La resta es: [" + cal.Resta() + "]");
                    break;

                case 3:
                    System.out.println("La multiplicación es: [" + cal.Multipliacion() + " ]");
                    break;

                case 4:
                    System.out.println("La división es: [ " + cal.Division() + " ]");
                    break;

                default:
                    System.out.println("Opcion no valida...");
            }
            System.out.println("---------------------------------------------------------------------------------------------");
            System.out.println("\n¿Qué operacion desea hacer?: \n"
                + "1. Para realizar una Suma \n"
                + "2. Para realizar una Resta\n"
                + "3. Para realizar una Multipliación\n"
                + "4. Para realizar una División\n");

            opcion = o.nextInt();
        }
    }
    
}