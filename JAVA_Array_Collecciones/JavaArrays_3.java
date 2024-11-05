package TAREAS_JAVA.JAVA_Array_Collecciones;

import java.util.Scanner;

public class JavaArrays_3 {
    /*
    * Programa que lee por teclado la nota de los alumnos de una clase y calcula la nota media del grupo.
    * También muestra los alumnos con notas superiores a la media. El número de alumnos se lee por teclado.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantAlumnos = 0;
        double suma = 0, media;
        
        do {
            System.out.println("Ingrese la cantidad de Alumnos");
            cantAlumnos = entrada.nextInt();
        }while (cantAlumnos <= 0);
        
        double[] notas = new double[cantAlumnos];
        
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Alumno " + (i + 1) + " Nota final: ");
            notas[i] = entrada.nextDouble();
        }

        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        media = suma / notas.length;

        System.out.println("Listado de notas superiores a la media: "+media);

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                System.out.println("Alumno numero " + (i + 1)+ " Nota final: " + notas[i]);
            }
        }
        
    }
}
