package TAREAS_JAVA.Java_Funciones;

public class Ejercicio_5 {
    /*
     Ejercicio 5: Promedio de satisfacción del cliente
    Una empresa desea conocer el promedio de satisfacción de sus clientes basado en encuestas de calificación de 1 a 5.

    **Instrucciones**:
    - Crea un arreglo `calificaciones` con las puntuaciones de satisfacción de los clientes.
    - Escribe una función `calcularPromedioSatisfaccion` que recorra el arreglo y calcule el promedio de satisfacción.
     */
        public static void main(String[] args) {
            int[] calificaciones = {5, 4, 3, 5, 4, 2, 3};

            double promedio = calcularPromedioSatisfaccion(calificaciones);
            System.out.println("Promedio de satisfacción: " + promedio);
        }

        public static double calcularPromedioSatisfaccion(int[] calificaciones) {
            int suma = 0;
            for (int i = 0; i < calificaciones.length; i++) {
                suma += calificaciones[i];
            }
            return (double) suma / calificaciones.length;
        }
    }