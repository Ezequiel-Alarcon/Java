package TAREAS_JAVA.Java_Secuenciales;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        /*
        Calculadora de Calorías Quemadas
        Escribe un programa que pida al usuario su peso en kilogramos, la duración del ejercicio en
        minutos y el tipo de ejercicio (correr, nadar, andar en bicicleta), y luego calcule e imprima las
        calorías quemadas. Utiliza diferentes tasas de calorías quemadas por minuto para cada tipo de
        ejercicio.
         */
        double peso,tiempo,calorias;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese su peso en kilogramos: ");
        peso = entrada.nextDouble();
        System.out.print("Ingrese su tiempo en minutos: ");
        tiempo = entrada.nextDouble();
        System.out.print("Ingrese su tipo de ejercicio: (correr, nadar, bicicleta) ");
        String tipo = entrada.next();

        switch (tipo) {
            case "correr" -> {
                calorias = peso * tiempo * 0.0175 * 10;
                System.out.print("Ha quemado un total de " + calorias + " calorias");
            }
            case "nadar" -> {
                calorias = peso * tiempo * 0.0175 * 9;
                System.out.print("Ha quemado un total de " + calorias + " calorias");
            }
            case "bicicleta" -> {
                calorias = peso * tiempo * 0.0175 * 7;
                System.out.print("Ha quemado un total de " + calorias + " calorias");
            }
            default -> System.out.print("Tipo de ejercicio no valido");
        }

    }
}
