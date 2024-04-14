/*2.	Escriba un programa que permita transformación de grados ºC a grados ºF y viceversa.  */
package EjercicioPractico1;
import java.util.Scanner;
public class Ejprob2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorc,valorf,conversion;
        int opcion;
        System.out.println("Conversión de Grados");
        System.out.println("1. Grados Celsius (°C) a Grados Fahrenheit (°F) ");
        System.out.println("2. Grados Fahrenheit (°F) a Grados Celsius (°C) ");
        System.out.printf("¿Qué opción elige (1-2)? ");
        opcion= scanner.nextInt();
        switch(opcion){
            case 1: System.out.printf("Introduzca el valor de Grados °C: ");
                    valorc=scanner.nextDouble();
                    conversion=(valorc*9/5) + 32;
                    System.out.printf("%.2f grados Celsius equivalen a %.2f grados Fahrenheit.",valorc,conversion);
            break;
            case 2: System.out.printf("Introduzca el valor de Grados °F: ");
                    valorf=scanner.nextDouble();
                    conversion=(valorf-32)*5/9;
                    System.out.printf("%.2f grados Fahrenheit equivalen a %.2f grados Celsius.",valorf,conversion);
            break;
            default:System.out.println("Esa no es una opción.");
                    
        }
        
    }
}
