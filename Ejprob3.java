/*3.	Escribir un programa que permita la transformación de monedas de Euro a: Dolar, Pesetas, Yen, 
Libra esterlina, Franco Suizo, Dólar canadiense. El mismo debe preguntar la divisa por día, 
cantidad de dinero para poder hacer las transformaciones.  */
package EjercicioPractico1;
import java.util.Scanner;
public class Ejprob3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double euro,divisadia,cambio;
        System.out.println("Introduzca la cantidad de monedas de euro, para poder hacer las transformaciones:");
        euro=scanner.nextDouble();
        System.out.println("Divisas Disponibles:");
        System.out.println("1. Dólar");
        System.out.println("2. Pesetas");
        System.out.println("3. Yen");
        System.out.println("4. Libra esterlina");
        System.out.println("5. Franco Suizo");
        System.out.println("6. Dólar Canadiense");
        System.out.printf("Elija una opción: ");
        opcion=scanner.nextInt();
        switch(opcion){
            case 1:System.out.printf("Introduzca el cambio de Euro a Dólar: ");
                    divisadia=scanner.nextDouble();
                    cambio=divisadia*euro;
                    System.out.printf("El cambio es: %.2f Euro(s) -> %.2f Dólar(es).",euro,cambio);
            break;
            case 2:System.out.printf("Introduzca el cambio de Euro a Pesetas: ");
                    divisadia=scanner.nextDouble();
                    cambio=divisadia*euro;
                    System.out.printf("El cambio es: %.2f Euro(s) -> %.2f Peseta(s).",euro,cambio);
            break;
            case 3:System.out.printf("Introduzca el cambio de Euro a Yen: ");
                    divisadia=scanner.nextDouble();
                    cambio=divisadia*euro;
                    System.out.printf("El cambio es: %.2f Euro(s) -> %.2f Yen(es).",euro,cambio);
            break;
            case 4:System.out.printf("Introduzca el cambio de Euro a Libra Esterlina: ");
                    divisadia=scanner.nextDouble();
                    cambio=divisadia*euro;
                    System.out.printf("El cambio es: %.2f Euro(s) -> %.2f Libra(s) Esterlina(s).",euro,cambio);
            break;
            case 5:System.out.printf("Introduzca el cambio de Euro a Franco Suizo: ");
                    divisadia=scanner.nextDouble();
                    cambio=divisadia*euro;
                    System.out.printf("El cambio es: %.2f Euro(s) -> %.2f Franco(s) Suizo(s).",euro,cambio);
            break;
            case 6:System.out.printf("Introduzca el cambio de Euro a Dólar Canadiense: ");
                    divisadia=scanner.nextDouble();
                    cambio=divisadia*euro;
                    System.out.printf("El cambio es: %.2f Euro(s) -> %.2f Dólar(es) Canadiense(s).",euro,cambio);
            break;
            default: System.out.println("Opción Inválida.");
        }
        
    }
}
