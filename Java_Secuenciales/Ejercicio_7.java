package TAREAS_JAVA.Java_Secuenciales;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        /*
        Calculadora de Índice de Felicidad
        Escribe un programa que pida al usuario varios factores de felicidad (nivel de satisfacción con la
        vida, nivel de estrés, nivel de salud, etc.) en una escala del 1 al 10 y luego calcule e imprima un
        índice de felicidad basado en esos factores.
         */
        Scanner entrada = new Scanner(System.in);
        int satisfaccionVida,nivelEstres,nivelSalud,relacionesPersonales,satisfaccionLaboral,indiceFelicidad;

        System.out.println("Que tan sastifecho esta con su estilo de vida? 1-10");
        satisfaccionVida = entrada.nextInt();
        System.out.println("Que tan sastifecho esta con su nivel de estres? 1-10 ");
        nivelEstres = entrada.nextInt();
        System.out.println("Que tan sastifecho esta con su nivel de salud? 1-10 ");
        nivelSalud = entrada.nextInt();
        System.out.println("Que tan sastifecho esta con sus relaciones personales? 1-10 ");
        relacionesPersonales = entrada.nextInt();
        System.out.println("Que tan sastifecho esta con su trabajo? 1-10 ");
        satisfaccionLaboral = entrada.nextInt();

        indiceFelicidad = (satisfaccionVida+nivelEstres+nivelSalud+relacionesPersonales+satisfaccionLaboral)/5;
        System.out.println("Su nivel de felicidad es: "+indiceFelicidad);

    }
}
