package TAREAS_JAVA.Java_Iteraciones;

import java.util.Scanner;

public class Ejercicio_1_while {
    public static void main(String[] args) {
        /*
         Ejercicio 1: Cálculo del tiempo dedicado a cada actividad
         Un alumno quiere medir el tiempo total que dedica a sus actividades académicas y personales durante el día.
         Instrucciones:
        •Pide al usuario que ingrese las horas dedicadas a cada actividad: estudiar, hacer ejercicios, leer, y tiempo libre.
        •Usa un bucle para registrar las horas y luego calcula el tiempo total dedicado.
         */

        Scanner entrada = new Scanner(System.in);

        double totalDedicado = 0;
        int i = 0;

        while (i < 4){

            if (i == 1) {
                System.out.print("Ingrese la cantidad de horas dedicadas para hacer ejercicios: ");
                double horasEjercicio = entrada.nextDouble();
                totalDedicado += horasEjercicio;
            }
            else if (i == 2){
                System.out.print("Ingrese la cantidad de horas dedicadas para leer: ");
                double horasLeer = entrada.nextDouble();
                totalDedicado += horasLeer;
            }
            else if (i == 3){
                System.out.print("Ingrese la cantidad de horas de tiempo libre: ");
                double horasTiempo = entrada.nextDouble();
                totalDedicado += horasTiempo;
            }
            i ++;
        }

        System.out.println("El tiempo total dedicado es: " + totalDedicado);

    }
}
