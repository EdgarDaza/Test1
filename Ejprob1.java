/*1.	Escriba un programa que pida el total de kilómetros recorridos, el precio de la gasolina (por litro), 
el dinero de gasolina gastado en el viaje y el tiempo que se ha tardado (en horas y minutos), y que calcule:
Ø	Consumo de gasolina (en litros y dólar) por cada cien kilómetros.
Ø	Consumo de gasolina (en litros y dólar) por cada kilómetro.
Ø	Velocidad media (en km/h y m/s)
 */
package EjercicioPractico1;
import java.util.Scanner;
public class Ejprob1 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kmreco,pregas, dinerogast,consumolitrostotal,consumolitros,consumodolares,consumodolares100,consumolitros100,kmametros,velmediams,velmediakmh;
        int hora, minutos,horaseg,minutoseg,totalseg;
       

        System.out.printf("Introduzca el total de kilómetros recorridos: ");
        kmreco= scanner.nextDouble();
        System.out.printf("Introduzca el precio de la gasolina (por litro): ");
        pregas= scanner.nextDouble();
        System.out.printf("Introduzca el dinero de gasolina gastado en el viaje: ");
        dinerogast= scanner.nextDouble();
        System.out.println("Introduzca las horas y minutos (por separado) que ha tardado: ");
        System.out.printf("Hora: ");
        hora= scanner.nextInt();
        System.out.printf("Minutos: ");
        minutos= scanner.nextInt();

        consumolitrostotal=dinerogast/pregas;
        consumolitros=consumolitrostotal/kmreco;
        consumodolares=dinerogast/kmreco;


        System.out.printf("El consumo de gasolina fue de %.2f litros y de %.2f dolares por cada kilómetro. Se recorrieron %.2f kilómetros.\n", consumolitros,consumodolares,kmreco); 
        
        if(kmreco>=100){
            consumolitros100=consumolitrostotal/(kmreco/100);
            consumodolares100=dinerogast/(kmreco/100);
            System.out.printf("El consumo de gasolina fue de %.2f litros y de %.2f dolares por cada 100 kilómetros. Se recorrieron %.2f kilómetros.\n", consumolitros100,consumodolares100,kmreco); 
        }
        horaseg=hora*3600;
        minutoseg=minutos*60;
        kmametros=kmreco*100;
        totalseg=horaseg + minutoseg;

        velmediams=kmametros/totalseg;
        velmediakmh=velmediams*3.6;
        System.out.printf("La velocidad media fue de %.2f km/h, o lo mismo %.2f m/s.",velmediakmh,velmediams);

        
       
        
        
    }
}
