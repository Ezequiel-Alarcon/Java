package TAREAS_JAVA.JAVA_Array_Collecciones;

import java.util.Scanner;

public class JavaArrays_5 {
    //Contar el número de elementos positivos, negativos y ceros de un array de 10 elementos.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int positivos=0,negativos=0,ceros=0;
        int[] num = new int[10];

        System.out.println("ingrese 10 numeros");

        for (int i = 0; i < num.length; i++) {
            System.out.print("Numero "+(i+1)+":");
            num[i] = entrada.nextInt();
        }

        for (int j : num) {
            if (j > 0) {
                positivos++;
            } else if (j < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        System.out.println("Positivos: "+positivos);
        System.out.println("Negativos: "+negativos);
        System.out.println("Ceros: "+ceros);

    }
}
