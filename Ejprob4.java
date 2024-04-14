/*4.	Escriba un programa que en Java que permita realizar los cálculos de una nota final 
de un estudiante universitario.  Debe presentar el nombre, las notas por porcentaje, a su vez la final.  */

package EjercicioPractico1;

import java.util.Scanner;

public class Ejprob4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantexampar;
        double examenf,maxexamf,porcexaf, primerexapar,segundoexapar,tercerexapar,maxexamp,promexamp,porcexap=0, maxlabs,labs,porclabs, maxasig,asig,porcasig, maxportaf,portaf,porcportaf, maxasist,asist,porcasist, califtotal;
        String nombre;

        System.out.println("Introduzca su nombre: ");
        nombre=scanner.nextLine();
        System.out.println("----------------------------------\n");

        System.out.println("EXAMEN FINAL");
        System.out.println("Introduzca el máximo puntaje que se podía obtener: ");
        maxexamf=scanner.nextDouble();
        System.out.println("Introduzca su nota de Examen Final: ");
        examenf =scanner.nextDouble();
        porcexaf=(examenf*33)/maxexamf;
         System.out.println("----------------------------------\n");

        System.out.println("EXÁMENES PARCIALES");
        System.out.println("¿Cuántos Exámenes Parciales se realizaron (2-3)?");
        cantexampar=scanner.nextInt();
       System.out.println("Introduzca el máximo puntaje que se podía obtener en los Exámenes Parciales: ");
        maxexamp=scanner.nextDouble();
        if (cantexampar==2) {
            System.out.printf("Introduzca la nota de su primer Examen Parcial: ");
            primerexapar=scanner.nextDouble();
            System.out.printf("Introduzca la nota de su segundo Examen Parcial: ");
            segundoexapar=scanner.nextDouble();
            promexamp=(primerexapar+segundoexapar)/2;
             porcexap=(promexamp*30)/maxexamp;
        } else if (cantexampar==3){
            System.out.printf("Introduzca la nota de su primer Examen Parcial: ");
            primerexapar=scanner.nextDouble();
            System.out.printf("Introduzca la nota de su segundo Examen Parcial: ");
            segundoexapar=scanner.nextDouble();
            System.out.printf("Introduzca la nota de su tercer Examen Parcial: ");
            tercerexapar=scanner.nextDouble();
            promexamp=(primerexapar+segundoexapar+tercerexapar)/3;
             porcexap=(promexamp*30)/maxexamp;
        } 
        System.out.println("----------------------------------\n");

        System.out.println("LABORATORIOS: TALLERES, LABORATORIOS");
        System.out.println("Introduzca el máximo puntaje que se podía obtener: ");
        maxlabs=scanner.nextDouble();
        System.out.println("Introduzca su nota de Laboratorios: ");
        labs =scanner.nextDouble();
        porclabs=(labs*17)/maxlabs;
        System.out.println("----------------------------------\n");

        System.out.println("ASIGNACIONES: INVESTIGACIONES, EJERCICIOS PRÁCTICOS");
        System.out.println("Introduzca el máximo puntaje que se podía obtener: ");
        maxasig=scanner.nextDouble();
        System.out.println("Introduzca su nota de Asignaciones: ");
        asig =scanner.nextDouble();
        porcasig=(asig*10)/maxasig;
        System.out.println("----------------------------------\n");

        System.out.println("PORTAFOLIO DIGITAL");
        System.out.println("Introduzca el máximo puntaje que se podía obtener: ");
        maxportaf=scanner.nextDouble();
        System.out.println("Introduzca su nota de Portafolio Digital: ");
        portaf =scanner.nextDouble();
        porcportaf=(portaf*5)/maxportaf;
        System.out.println("----------------------------------\n");

        System.out.println("ASISTENCIA");
        System.out.println("Introduzca el máximo puntaje que se podía obtener: ");
        maxasist=scanner.nextDouble();
        System.out.println("Introduzca su nota de Asistencia: ");
        asist =scanner.nextDouble();
        porcasist=(asist*5)/maxasist;
        System.out.println("----------------------------------\n");

        califtotal=porcexaf+porcexap+porclabs+porcasig+porcportaf+porcasist;
        
        System.out.printf("|La nota final de el/la estudiante %s es %.2f|\n", nombre,califtotal);
    }
}
