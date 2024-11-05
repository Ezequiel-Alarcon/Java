package TAREAS_JAVA.JAVA_Array_Collecciones;

import java.util.Scanner;

public class JavaArrays_1 {
    /*
     * Programa que lea por teclado 10 números enteros y los guarde en un array.
     * A continuación calcula y muestra la media de los valores positivos y la  de los valores negativos.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int NumPositivo = 0, NumNegativo = 0;
        double acumuladorPositivo = 0, acumuladorNegativo = 0;
        int[] num = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("numeros[" + i + "]= ");
            num[i] = entrada.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (num[i] > 0) {
                acumuladorPositivo += num[i];
                NumPositivo++;
            } else if (num[i] < 0) {
                acumuladorNegativo += num[i];
                NumNegativo++;
            }
        }

        if (NumPositivo != 0) {
            System.out.println("Media de los valores positivos: " + acumuladorPositivo / NumPositivo);
        } else {
            System.out.println("No ha introducido numeros positivos");
        }
        if (NumNegativo != 0) {
            System.out.println("Media de los valores negativos: " + acumuladorNegativo / NumNegativo);
        } else {
            System.out.println("No ha introducido numeros negativos");
        }
    }
}