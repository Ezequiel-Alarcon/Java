package TAREAS_JAVA.JAVA_Array_Collecciones;

import java.util.Scanner;

public class JavaArrays_7 {
    /*
     * Leer la altura de N personas y calcular la altura media
     * Mostra cuántos hay superiores a la media.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i,N,mediaSuperior=0,mediaInferior=0;
        double media=0;

        System.out.print("Ingrese el numero de personas: ");
        N = entrada.nextInt();
        int[] altura = new int[N];

        for (i=0; i < N; i++){
            System.out.print("Ingrese la altura de la persona "+(i+1)+ ": ");
            altura[i] = entrada.nextInt();
            media += altura[i];
        }

        media = media/N;

        for (i=0; i < N; i++){
            if (altura[i]>media){
                mediaSuperior++;
            }
            else{
                mediaInferior++;
            }
        }

        System.out.println("La estatura media es: "+media);
        System.out.println("Mayores a la estatura media: "+mediaSuperior);
        System.out.println("Menores a la estatura media: "+mediaInferior);

    }
}
