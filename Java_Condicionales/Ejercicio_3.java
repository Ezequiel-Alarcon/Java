package TAREAS_JAVA.Java_Condicionales;

import java.util.Scanner;

public class Ejercicio_3 {
    static String fantasia = "El nombre del viento de Patrick Rothfuss";
    static String misterio = "El código Da Vinci de Dan Brown";
    static String romance = "Orgullo y prejuicio de Jane Austen";
    static String cienciaFiccion = " Dune de Frank Herbert";

    public static void main(String[] args) {
        /*
        Ejercicio 3: Sistema de Recomendación de Libros
        Escribe un programa que pida al usuario su género de libro favorito (fantasía, misterio, romance,
        ciencia ficción) y luego recomiende un libro basado en su elección.
         */
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su genero favorito: \n1_fantasia \n2_misterio \n3_romance \n4_Ciencia Ficcion \nopcion:");
        int op = entrada.nextInt();

        switch (op){
            case 1:
                System.out.println("Su libro recomendado  es: " +fantasia);
                break;
            case 2:
                System.out.println("Su libro recomendado  es: " +misterio);
                break;
            case 3:
                System.out.println("Su libro recomendado  es: " +romance);
                break;
            case 4:
                System.out.println("Su libro recomendado  es: " +cienciaFiccion);
            default:
                System.out.println("No se encuentra en la lista");
        }
    }
}
