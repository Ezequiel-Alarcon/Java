package TAREAS_JAVA.Java_Funciones;

public class Ejercicio_4 {
    /*
     Ejercicio 4: Cálculo de descuentos para fidelización
    Una empresa ofrece descuentos a sus clientes dependiendo de la cantidad de compras que han realizado.
     Si han comprado más de 10 veces, reciben un 10% de descuento.

    **Instrucciones**:
    - Crea un arreglo `clientes` y otro `compras` que almacene la cantidad de compras de cada cliente.
    - Escribe una función `calcularDescuentos` que recorra el arreglo y aplique el descuento a los clientes que califiquen.
    ¡Claro! Aquí tienes cinco ejercicios adicionales en Java, orientados a pequeñas empresas y enfocados en bucles y funciones.
     */

    public static void main(String[] args) {
        String[] clientes = {"Ana", "Juan", "Carlos", "Maria", "Luis"};
        int[] compras = {12, 8, 15, 5, 11};

        calcularDescuentos(clientes, compras);
    }

    public static void calcularDescuentos(String[] clientes, int[] compras) {
        System.out.println("Clientes con descuento:");
        for (int i = 0; i < clientes.length; i++) {
            if (compras[i] > 10) {
                System.out.println(clientes[i] + " tiene un 10% de descuento.");
            }
        }
    }
}

