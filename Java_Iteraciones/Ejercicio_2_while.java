package TAREAS_JAVA.Java_Iteraciones;

import java.util.Scanner;

public class Ejercicio_2_while {
    public static void main(String[] args) {
        /*
        Ejercicio 2: Cálculo de salarios semanales
        Una empresa desea calcular el salario semanal de sus empleados basándose en las horas
        trabajadas y una tarifa fija por hora.
        Instrucciones:
        •	Pide al usuario ingresar la cantidad de empleados.
        •	Para cada empleado, pide ingresar las horas trabajadas.
        •	Usa un bucle para calcular el salario de cada empleado (suponiendo una tarifa fija de $15 por hora).
         */

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de empleados; ");
        int empleados = entrada.nextInt();
        int i = 0;
        String salarios = "";


        while (i < empleados){
            System.out.print("Ingrese el nombre del empleado: ");
            String nombre = entrada.next();

            System.out.println("Ingrese el numero de horas trabajadas: ");
            int horasTrabajadas = entrada.nextInt();

            int salario = horasTrabajadas * 15;

            salarios += "El salario del empleado " + nombre + " es: $" + salario + "\n";

            i ++;
        }
        System.out.println(salarios);
    }
}