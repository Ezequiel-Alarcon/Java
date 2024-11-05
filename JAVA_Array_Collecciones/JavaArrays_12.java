package TAREAS_JAVA.JAVA_Array_Collecciones;

/*
 * Programa que genera un cuadrado mágico de orden N, siendo N un entero positivo e impar.
 */
import java.util.Scanner;
public class JavaArrays_12 {

    public static void main(String[] args) {
        //crear el array
        int[][] M = crearArray();

        //generar cuadrado mágico
        cuadradoMagico(M);

        //mostrar el array
        mostrarMatriz(M);
    }

    //método que crea un array cuadrado de N filas y N columnas
    //el número de filas se introduce por teclado y se
    //se crea y devuelve una matriz de ese tamaño
    public static int[][] crearArray() {
        Scanner sc = new Scanner(System.in);
        int filas;
        //lectura del número de filas
        do {
            System.out.print("Número de filas (impar): ");
            filas = sc.nextInt();
        } while (filas % 2 == 0 || filas < 0);
        //crear la matriz cuadradda
        int[][] A = new int[filas][filas];
        return A;
    }

    //método para crear un cuadrado mágico
    //el método recibe una matriz y le asigna valores de forma
    //que la matriz sea un cuadrado mágico
    public static void cuadradoMagico(int[][] matriz) {
        int N = matriz.length;
        int i = 0, j = N / 2, cont = 1;
        boolean multiplo = false;
        matriz[i][j] = cont; //se coloca el 1 en el elemento central de la primera fila
        for (cont = 2; cont <= N * N; cont++) { //for para colocar el resto de elementos en la matriz
            if (!multiplo) {        //si el anterior número no es múltiplo de N
                i--;                //fila anterior
                if (i < 0){
                    i = N - 1;
                }
                j++;                //columna siguiente
                if (j >= N){
                    j = 0;
                }
            } else {                //si el anterior número es múltiplo de N
                i++;                //fila siguiente, misma columna
                if (i >= N){
                    i = 0;
                }
            }
            matriz[i][j] = cont;
            if (cont % N == 0){     //comprobamos si número actual es multiplo de N
                multiplo = true;
            } else {
                multiplo = false;
            }
        }
    }

    //método para mostrar el cuadrado mágico por pantalla
    public static void mostrarMatriz(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("%5d", A[i][j]);
            }
            System.out.println();
        }
    }
}
