package TAREAS_JAVA.Java_Condicionales;

import java.util.Scanner;

public class Ejercicio_1 {

    static String accion = "Mad Max: Fury Road";
    static String comedia = "The Grand Budapest Hotel";
    static String drama = "The Pursuit of Happyness";
    static String ciencia_ficcion = "Inception";

    public static void main(String[] args) {
        /*
        Sistema de Recomendación de Películas
        Escribe un programa que pida al usuario su género de película favorito (acción, comedia, drama,
        ciencia ficción) y luego recomiende una película basada en su elección.
         */
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su genero favorito: \n1_accion \n2_comedia \n3_drama \n4_Ciencia Ficcion \nopcion:");
        int op = entrada.nextInt();

        switch (op){
            case 1:
                System.out.println("Su pelicula recomendada  es: " +accion);
                break;
            case 2:
                System.out.println("Su pelicula recomendada  es: " +comedia);
                break;
            case 3:
                System.out.println("Su pelicula recomendada  es: " +drama);
                break;
            case 4:
                System.out.println("Su pelicula recomendada  es: " +ciencia_ficcion);
            default:
                    System.out.println("No se encuentra en la lista");
        }
    }
}
