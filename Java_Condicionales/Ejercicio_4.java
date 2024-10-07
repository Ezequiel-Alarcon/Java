package TAREAS_JAVA.Java_Condicionales;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        /*
        Ejercicio 4: Calculadora de IMC con Recomendaciones
        Escribe un programa que pida al usuario su peso en kilogramos y su altura en metros, y luego
        calcule su Índice de Masa Corporal (IMC). Imprime una recomendación basada en el IMC (bajo
        peso, peso normal, sobrepeso, obesidad).
         */
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce tu peso en kilogramos: ");
        double peso = entrada.nextDouble();

        System.out.print("Introduce tu altura en metros: ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Tu IMC es: " + imc);

        if (imc < 18.5) {
            System.out.println("Tienes bajo peso. Se recomienda una dieta más calórica y consultar a un nutricionista.");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Tienes un peso normal. ¡Sigue manteniendo un estilo de vida saludable!");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Tienes sobrepeso. Es recomendable hacer más ejercicio y cuidar la alimentación.");
        } else {
            System.out.println("Tienes obesidad. Es importante consultar a un profesional de la salud para asesoramiento.");
        }
    }
}
