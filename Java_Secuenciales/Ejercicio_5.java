package TAREAS_JAVA.Java_Secuenciales;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        /*
        Calculadora de Costo de Viaje
        Escribe un programa que pida al usuario la distancia del viaje en kilómetros, el consumo de
        combustible del vehículo en litros por kilómetro y el precio del combustible por litro, y luego
        calcule e imprima el costo total del viaje.
         */
        float distancia,consumoKm,precioL,costoTotal;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la distancia del viaje: ");
        distancia = entrada.nextFloat();
        System.out.print("Ingrese el consumo del vehiculo por km: ");
        consumoKm = entrada.nextFloat();
        System.out.print("Ingrese el precio del combustible: ");
        precioL = entrada.nextFloat();

        costoTotal = (distancia*consumoKm)*precioL;
        System.out.println("El costo total del viaje es: "+costoTotal);

    }
}
