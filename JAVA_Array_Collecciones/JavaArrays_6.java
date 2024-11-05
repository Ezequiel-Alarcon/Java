package TAREAS_JAVA.JAVA_Array_Collecciones;

import java.util.Scanner;

public class JavaArrays_6 {
    //* Leer 10 números enteros y mostrar la media de los valores positivos y la de los valores negativos.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int pos=0,neg=0;
        double sumaPositiva=0,sumaNegativa=0;
        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Numero "+(i+1));
            num[i] = entrada.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            if(num[i]>0){
                sumaPositiva+=num[i];
                pos++;
            }
            else {
                sumaNegativa += num[i];
                neg++;
            }
        }

        if (pos != 0) {
            System.out.println("Media de los valores positivos: " + sumaPositiva / pos);
        } else {
            System.out.println("No ha introducido números positivos");
        }
        if (neg != 0) {
            System.out.println("Media de los valores negativos: " + sumaNegativa / neg);
        } else {
            System.out.println("No ha introducido números negativos");
        }
        
    }
}
