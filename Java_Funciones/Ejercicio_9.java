package TAREAS_JAVA.Java_Funciones;

public class Ejercicio_9 {
    /*
    Ejercicio 9: Calcular el precio final con descuentos
    Una empresa quiere calcular el precio final de sus productos después de aplicar un descuento general del 10%.
    **Instrucciones**:
    - Crea un arreglo `preciosOriginales` que almacene el precio original de varios productos.
    - Escribe una función `calcularPrecioFinal` que aplique el descuento a cada producto y devuelva el precio final.
     */
    public static void main(String[] args) {
        double[] preciosOriginales = {100, 200, 150, 250, 300};
        calcularPrecioFinal(preciosOriginales);
    }

    public static void calcularPrecioFinal(double[] preciosOriginales) {
        System.out.println("Precios finales con 10% de descuento:");
        for (int i = 0; i < preciosOriginales.length; i++) {
            double descuento = preciosOriginales[i] * 0.10;
            double precioFinal = preciosOriginales[i] - descuento;
            System.out.println("Precio original: $" + preciosOriginales[i] + " - Precio final: $" + precioFinal);
        }
    }
}

