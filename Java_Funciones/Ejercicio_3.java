package TAREAS_JAVA.Java_Funciones;

public class Ejercicio_3 {
    /*
     Ejercicio 3: Gestión de clientes
    Una pequeña empresa de servicios tiene una lista de clientes a los que debe enviar facturas,
    pero quiere procesar solo aquellos que tengan facturas pendientes por más de $500.

    **Instrucciones**:
    - Crea un arreglo `clientes` que almacene los nombres de los clientes y un arreglo `facturasPendientes` con el monto de sus facturas pendientes.
    - Escribe una función `enviarFacturas` que imprima los nombres de los clientes con facturas mayores a $500.
     */

    public static void main(String[] args) {
        String[] clientes = {"Ana", "Juan", "Carlos", "Maria", "Luis"};
        int[] facturasPendientes = {600, 300, 700, 400, 800};

        enviarFacturas(clientes, facturasPendientes);
    }

    public static void enviarFacturas(String[] clientes, int[] facturasPendientes) {
        System.out.println("Clientes con facturas pendientes mayores a $500:");
        for (int i = 0; i < clientes.length; i++) {
            if (facturasPendientes[i] > 500) {
                System.out.println(clientes[i] + " - Factura: $" + facturasPendientes[i]);
            }
        }
    }
}
