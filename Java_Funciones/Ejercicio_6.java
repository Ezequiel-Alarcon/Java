package TAREAS_JAVA.Java_Funciones;

public class Ejercicio_6 {
    /*
     Ejercicio 6: Cálculo de impuestos
    Una pequeña empresa debe calcular el impuesto de venta para cada una de las facturas emitidas.

    **Instrucciones**:
    - Crea un arreglo `facturas` con los montos de las facturas de los clientes.
    - Escribe una función `calcularImpuesto` que aplique un 21% de impuesto a cada factura.
     */

    public static void main(String[] args) {
        double[] facturas = {1000, 1500, 2000, 2500, 3000};
        calcularImpuesto(facturas);
    }

    public static void calcularImpuesto(double[] facturas) {
        System.out.println("Facturas con el 21% de impuesto:");
        for (int i = 0; i < facturas.length; i++) {
            double impuesto = facturas[i] * 0.21;
            System.out.println("Factura: $" + facturas[i] + " - Impuesto: $" + impuesto);
        }
    }
}
