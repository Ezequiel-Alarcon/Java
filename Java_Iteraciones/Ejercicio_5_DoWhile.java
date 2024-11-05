package TAREAS_JAVA.Java_Iteraciones;

import java.util.Scanner;

public class Ejercicio_5_DoWhile {
    public static void main(String[] args) {
        /*
        Ejercicio 5: Cálculo de horas extras
        Una empresa desea calcular las horas extras trabajadas por sus empleados.
        Si un empleado trabaja más de 40 horas en la semana, las horas adicionales se consideran horas extras.
        Instrucciones:
        •	Pide al usuario ingresar el número de empleados.
        •	Usa un bucle para ingresar las horas trabajadas por cada empleado.
        •	Si un empleado trabajó más de 40 horas, calcula y muestra las horas extras.
         */

        Scanner entrada = new Scanner(System.in);

        int i=0, numEmpleados;

        System.out.print("Ingrese el numero de empleados: ");
        numEmpleados = entrada.nextInt();

        do {
            System.out.print("Ingrese el numero de horas trabajadas: ");
            int horasTrabajadas = entrada.nextInt();

            if (horasTrabajadas > 40){
                int horasExtras = horasTrabajadas - 40;
                System.out.println("Usted tiene "+horasExtras+" horas extras");
            }else{
                System.out.print("No tiene horas extras");
            }

            i ++;

        } while (i < numEmpleados);
    }
}
