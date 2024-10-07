package TAREAS_JAVA.Java_Secuenciales;

import java.util.Scanner;

public class Ejercicio_4 {
    static String feliz = "Feliz:\nPharrell Williams – Happy\nKaty Perry – Firework\nJustin Timberlake – Can't Stop the Feeling!\nTaylor Swift – Shake It Off\nBruno Mars – Uptown Funk";
    static String triste = "Triste:\nAdele – Someone Like You\nSam Smith – Stay With Me\nBillie Eilish – When the Party's Over\nLewis Capaldi – Someone You Loved\nColdplay – The Scientist";
    static String energico = "Enérgico:\nSurvivor – Eye of the Tiger\nThe Prodigy – Firestarter\nEminem – Lose Yourself\nAC/DC – Thunderstruck\nThe Killers – Mr. Brightside";
    static String relajado = "Relajado:\nNorah Jones – Come Away with Me\nJack Johnson – Banana Pancakes\nEnya – Only Time\nJohn Mayer – Gravity\nLana Del Rey – Video Games";
    public static void main(String[] args) {
        /*
        Generador de Listas de Reproducción
        Escribe un programa que pida al usuario su estado de ánimo (feliz, triste, enérgico, relajado) y luego
        genere una lista de reproducción con canciones sugeridas para ese estado de ánimo.
         */
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese su estado de animo: \n1. Feliz \n2. Triste \n3. Enérgico \n4. Relajado \nopción: ");
        int op = entrada.nextInt();

        switch (op){
            case 1:
                System.out.println(feliz);
                break;
            case 2:
                System.out.println(triste);
                break;
            case 3:
                System.out.println(energico);
                break;
            case 4:
                System.out.println(relajado);
            default:
                System.out.println("Opcion incorrecta.");
        }

    }
}
