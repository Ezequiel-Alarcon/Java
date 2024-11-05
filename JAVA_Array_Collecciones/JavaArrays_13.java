package TAREAS_JAVA.JAVA_Array_Collecciones;

/*
 * Programa que genera un cuadrado latino de orden N.
 */
import java.util.Scanner;

public class JavaArrays_13 {

    public static void main(String[] args) {
        //leer el número de filas
        int N = leerFilas();

        //crear un cuadrado latino de orden N
        int[][] M = cuadradoLatino(N);

        //mostrar cuadrado latino
        mostrarMatriz(M);

    }

    //método para introducir por teclado el orden del cuadrado latino
    public static int leerFilas() {
        Scanner sc = new Scanner(System.in);
        int filas;
        //lectura del número de filas
        do {
            System.out.print("Número de filas > 2: ");
            filas = sc.nextInt();
        } while (filas <= 2);
        return filas;
    }

    //método que crea un cuadrado latino de orden n
    public static int [][] cuadradoLatino(int n) {
        //se crea la matriz de n filas y n columnas
        int [][] a = new int[n][n];
        for (int j = 0; j < a.length; j++) { //en la primera fila guardamos los numeros desde 1 hasta N
            a[0][j] = j + 1;
        }

        for (int i = 1; i < a.length; i++) { //para el resto de filas
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = a[i - 1][j]; //en cada fila copiamos la anterior
            }
            desplazarDerecha(a[i]);    //rotamos la fila actual un lugar a la derecha
        }
        return a;
    }

    //método que desplaza los elementos de un array de una dimensión un lugar a la derecha
    public static void desplazarDerecha(int[] a) {
        int aux = a[a.length - 1];               //se guarda el último elemento de la fila en la variable aux
        for (int i = a.length - 1; i > 0; i--) { //se desplazan los elementos
            a[i] = a[i - 1];                     //copiando en cada elemeno el que tienen a su izquierda
        }
        a[0] = aux;    //finalmente se copia en el primer elemento el último que habíamos guarda en aux
    }

    //método para mostrar por pantalla la la matriz que contiene el cuadrado latino
    public static void mostrarMatriz(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("%5d", A[i][j]);
            }
            System.out.println();
        }
    }
}//fin cuadrado latino Java
