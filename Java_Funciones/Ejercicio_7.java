package TAREAS_JAVA.Java_Funciones;

public class Ejercicio_7 {
    /*
    Ejercicio 7: Descuento por compras grandes
    Una tienda de ropa ofrece un 15% de descuento a las compras superiores a $500.

    **Instrucciones**:
    - Crea un arreglo `compras` que almacene los montos de las compras de los clientes.
    - Escribe una función `aplicarDescuento` que aplique el descuento a las compras que superen los $500.
     */
    public static void main(String[] args) {
        double[] compras = {400, 600, 200, 800, 1200};
        aplicarDescuento(compras);
    }

    public static void aplicarDescuento(double[] compras) {
        System.out.println("Compras con descuento del 15% (si superan $500):");
        for (int i = 0; i < compras.length; i++) {
            if (compras[i] > 500) {
                double descuento = compras[i] * 0.15;
                System.out.println("Compra: $" + compras[i] + " - Descuento: $" + descuento);
            }
        }
    }
}
