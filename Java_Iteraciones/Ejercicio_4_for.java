package TAREAS_JAVA.Java_Iteraciones;

import java.util.Scanner;

public class Ejercicio_4_for {
    public static void main(String[] args) {
        /*
        Ejercicio 4: Registro de ventas diarias
        Una tienda desea registrar las ventas realizadas cada día durante una semana.
        El programa debe calcular el total de ventas al final de la semana.
        Instrucciones:
        •	Usa un bucle para registrar las ventas diarias durante 7 días.
        •	Al final del bucle, muestra el total de ventas de la semana.
         */

        Scanner entrada = new Scanner(System.in);
        int ventasTotal = 0, ventasDias;

        for (int i = 1; i < 8; i++) {
            System.out.print("Dia "+i+": ");
            ventasDias = entrada.nextInt();
            ventasTotal += ventasDias;
        }

        System.out.println("El total de ventas de la semana es: "+ventasTotal);

    }
}
