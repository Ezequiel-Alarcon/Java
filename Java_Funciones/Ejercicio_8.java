package TAREAS_JAVA.Java_Funciones;

public class Ejercicio_8 {
    /*
    Ejercicio 7: Descuento por compras grandes
    Una tienda de ropa ofrece un 15% de descuento a las compras superiores a $500.

     **Instrucciones**:
     - Crea un arreglo `compras` que almacene los montos de las compras de los clientes.
     - Escribe una función `aplicarDescuento` que aplique el descuento a las compras que superen los $500.
     */

    public static void main(String[] args) {
        String[] empleados = {"Pedro", "Juan", "Ana", "Maria", "Luis"};
        int[] horasTrabajadas = {40, 35, 30, 45, 20};
        calcularPagoSemanal(empleados, horasTrabajadas);
    }

    public static void calcularPagoSemanal(String[] empleados, int[] horasTrabajadas) {
        int tarifaPorHora = 15;
        System.out.println("Pago semanal por empleado:");
        for (int i = 0; i < empleados.length; i++) {
            int pago = horasTrabajadas[i] * tarifaPorHora;
            System.out.println(empleados[i] + " - Pago: $" + pago);
        }
    }
}
