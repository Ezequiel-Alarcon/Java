package TAREAS_JAVA.Java_Condicionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        /*
        Ejercicio 5: Juego de Piedra, Papel o Tijera
        Escribe un programa que pida al usuario que elija entre piedra, papel o tijera. Luego, el programa
        elige una opción al azar y determina quién gana. Imprime el resultado del juego.
         */
        // Crear un escáner para leer la entrada del usuario
        Scanner entrada = new Scanner(System.in);

        // Pedir al usuario que elija entre piedra, papel o tijera
        System.out.println("Elige una opción: piedra, papel o tijera");
        String eleccionUsuario = entrada.nextLine().toLowerCase();

        // Generar una elección aleatoria para la computadora
        String[] opciones = {"piedra", "papel", "tijera"};
        Random random = new Random();
        String eleccionComputadora = opciones[random.nextInt(3)];

        // Mostrar la elección de la computadora
        System.out.println("La computadora eligió: " + eleccionComputadora);

        // Determinar el resultado del juego
        if (eleccionUsuario.equals(eleccionComputadora)) {
            System.out.println("¡Empate!");
        } else if (eleccionUsuario.equals("piedra") && eleccionComputadora.equals("tijera")
                || eleccionUsuario.equals("papel") && eleccionComputadora.equals("piedra")
                || eleccionUsuario.equals("tijera") && eleccionComputadora.equals("papel")) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("La computadora ganó.");
        }


    }
}
