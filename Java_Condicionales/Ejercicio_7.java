package TAREAS_JAVA.Java_Condicionales;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Pedir al usuario su estado de ánimo
        System.out.println("¿Cómo te sientes hoy? (feliz, triste, enérgico, relajado)");
        String estadoAnimo = entrada.nextLine().toLowerCase();

        // Recomendar actividad según el estado de ánimo
        switch (estadoAnimo) {
            case "feliz":
                System.out.println("¡Qué bien! Te recomendamos salir a caminar o pasar tiempo con amigos.");
                break;
            case "triste":
                System.out.println("Es un buen momento para ver una película inspiradora o escuchar música relajante.");
                break;
            case "enérgico":
                System.out.println("¡Aprovecha esa energía! Haz ejercicio o comienza un proyecto que te apasione.");
                break;
            case "relajado":
                System.out.println("Perfecto para leer un libro o disfrutar de un baño relajante.");
                break;
            default:
                System.out.println("Estado de ánimo no reconocido. Intenta de nuevo.");
                break;
        }
    }
}
