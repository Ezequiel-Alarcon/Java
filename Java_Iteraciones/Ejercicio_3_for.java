package TAREAS_JAVA.Java_Iteraciones;

import java.util.Scanner;

public class Ejercicio_3_for {
    public static void main(String[] args) {
        /*
        Ejercicio 3: Control de inventario
        Una tienda necesita revisar el inventario de sus productos y determinar
        si algún artículo tiene menos de 5 unidades disponibles para realizar un pedido.

        Instrucciones:
        •Pide al usuario ingresar el número de productos.
        •Usa un bucle para ingresar la cantidad disponible de cada producto.
        •Si algún producto tiene menos de 5 unidades, muestra un mensaje indicando que es necesario realizar un pedido.
         */

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el numero de productos: ");
        int numProductos = entrada.nextInt();
        String mensaje = "";

        for (int i = 0; i < numProductos; i++) {
            System.out.print("Ingrese el nombre del producto: ");
            String nombre = entrada.next();

            System.out.print("Ingrese la cantidad disponible: ");
            int cantidad = entrada.nextInt();

            if (cantidad<5){
                mensaje += "Es necesario realizar un pedido para el producto: "+nombre+"\n";
            }
        }
        System.out.println(mensaje);
    }
}
