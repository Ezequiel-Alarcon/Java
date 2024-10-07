package TAREAS_JAVA.Java_Condicionales;

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        /*
        Ejercicio 6: Evaluador de Hábitos Saludables
        Escribe un programa que pida al usuario cuántas horas al día duerme, cuántas horas al día hace
        ejercicio y cuántas comidas saludables consume al día. Luego, imprime una evaluación de sus
        hábitos saludables basada en estos datos.
         */

        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Cuántas horas al día duermes? ");
        int horasDormir = entrada.nextInt();

        System.out.print("¿Cuántas horas al día haces ejercicio? ");
        int horasEjercicio = entrada.nextInt();

        System.out.print("¿Cuántas comidas saludables consumes al día? ");
        int comidasSaludables = entrada.nextInt();

        if (horasDormir >= 7 && horasDormir <= 9) {
            System.out.println("Tienes buenos hábitos de sueño.");
        } else {
            System.out.println("Deberías dormir entre 7 y 9 horas al día.");
        }

        if (horasEjercicio >= 1) {
            System.out.println("Tienes buenos hábitos de ejercicio.");
        } else {
            System.out.println("Es recomendable hacer al menos 1 hora de ejercicio al día.");
        }

        if (comidasSaludables >= 3) {
            System.out.println("Tienes buenos hábitos alimenticios.");
        } else {
            System.out.println("Deberías consumir al menos 3 comidas saludables al día.");
        }

    }
}
