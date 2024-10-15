package TAREAS_JAVA.Java_Funciones;

public class Ejercicio_1 {
    public static void main(String[] args) {
        /*
         Ejercicio 1: Cálculo de ingresos mensuales
        Una pequeña tienda registra sus ventas diarias en un arreglo. Se necesita escribir una
        función que use un bucle para calcular los ingresos totales mensuales.

        **Instrucciones**:
        - Crea un arreglo `ventas` que almacene las ventas diarias de una tienda durante 30 días.
        - Escribe una función `calcularIngresosMensuales` que recorra el arreglo y sume las ventas.
        - Imprime el total de ingresos mensuales.
         */

        int[] ventas = {100, 200, 150, 300, 400, 250, 120, 310, 270, 90, 100, 200, 150, 300, 400, 250, 120, 310, 270, 90, 100, 200, 150, 300, 400, 250, 120, 310, 270, 90};

        // Llamamos a la función para calcular ingresos
        int total = calcularIngresosMensuales(ventas);
        System.out.println("Ingresos totales del mes: " + total);
    }

    public static int calcularIngresosMensuales(int[] ventas) {
        int total = 0;
        // Recorremos el arreglo y sumamos las ventas
        for (int i = 0; i < ventas.length; i++) {
            total += ventas[i];
        }
        return total;
    }

}
