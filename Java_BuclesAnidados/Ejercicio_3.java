package TAREAS_JAVA.Java_BuclesAnidados;

import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {
        int N;
        double factorial, suma = 0;
        Scanner sc = new Scanner(System.in);

        // Leer un número entero >= 0
        do {
            System.out.print("Introduce un número >= 0: ");
            N = sc.nextInt();
        } while (N < 0);  // Asegura que N sea mayor o igual a 0

        // Para cada número desde 0 hasta N
        for (int i = 0; i <= N; i++) {

            // Se calcula el factorial de i
            factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial = factorial * j;
            }

            // Se muestra el factorial de cada número
            System.out.printf("%n%2d! = %.0f %n", i, factorial);

            // Se suma el factorial a la variable suma
            suma = suma + factorial;
        }

        // Al final del proceso se muestra la suma de todos los factoriales
        System.out.printf("Suma de los factoriales desde 0 hasta %d: %.0f%n", N, suma);
    }
}

