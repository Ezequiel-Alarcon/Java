package TAREAS_JAVA.Java_Secuenciales;

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        /*
        Generador de Planes de Estudio
        Escribe un programa que pida al usuario cuántas horas al día puede estudiar y luego genere un
        plan de estudio semanal distribuyendo esas horas en diferentes materias
         */

        Scanner entrada = new Scanner(System.in);
        float horasEstudio,horasPorMaterias,horasSemanales;
        int cantidadMaterias;

        System.out.print("Ingrese la cantidad de materias: ");
        cantidadMaterias = entrada.nextInt();

        if (cantidadMaterias <= 0) {
            System.out.println("La cantidad de materias debe ser mayor a 0.");
            return; // Salir del programa si el número de materias no es válido
        }

        System.out.print("Ingrese la cantidad de horas que puede estudiar por dia: ");
        horasEstudio = entrada.nextFloat();

        if (horasEstudio <= 0) {
            System.out.println("Las horas de estudio deben ser mayores a 0.");
            return; // Salir del programa si las horas no son válidas
        }

        horasSemanales = horasEstudio * 7;
        horasPorMaterias = horasSemanales/cantidadMaterias;

        System.out.println("Puedes estudiar " + horasPorMaterias + " horas por materia cada día.");

    }
}
