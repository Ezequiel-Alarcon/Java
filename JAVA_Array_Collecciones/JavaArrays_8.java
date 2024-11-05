package TAREAS_JAVA.JAVA_Array_Collecciones;

import java.util.Scanner;

public class JavaArrays_8 {
    // *Leer nombre y sueldo de 20 empleados y mostrar el que más gana
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       double[] sueldo = new double[20];
       String[] nombres = new String[20];

        double mayorSueldo=0;
        String nombreMayor = "";

       for (int i = 0; i < sueldo.length; i++) {
           System.out.println("Ingrese el nombre del empleado: ");
           nombres[i] = sc.nextLine();
           System.out.println("Ingrese el sueldo del empleado: ");
           sueldo[i] = sc.nextDouble();

           if (sueldo[i] > mayorSueldo) {
               mayorSueldo = sueldo[i];
               nombreMayor = nombres[i];
           }
       }

        System.out.println("Empleado con mayor sueldo: " + nombreMayor );
        System.out.println("Sueldo: " + mayorSueldo);

    }
}

