package TAREAS_JAVA.Java_Condicionales;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        /*
        Ejercicio 2: Calculadora de Descuentos
        Escribe un programa que pida al usuario el precio de un producto y la categoría del cliente
        (estudiante, adulto, jubilado). Aplica un descuento del 10% para estudiantes, 5% para adultos y
        15% para jubilados. Imprime el precio final después del descuento.
         */

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = entrada.nextInt();

        System.out.print("Ingrese su categoria: \n1_estudiante \n2_adulto \n3_jubilado \nopcion:");
        int op = entrada.nextInt();
        switch (op){
            case 1:
                precio -= precio*0.1;
                System.out.println("Su precio final es: "+(precio));
                break;
            case 2:
                precio -= precio*0.05;
                System.out.println("Su precio final es: "+(precio));
                break;
            case 3:
                precio -= precio*0.15;
                System.out.println("Su precio final es: "+(precio));
                break;
            default:
                System.out.println("Opcion incorrecta.");
        }

    }
}
