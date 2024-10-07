package TAREAS_JAVA.Java_Secuenciales;

import java.util.Scanner;

public class Ejercicio_3 {
    static String principiante = """
            Principiante:
            Lunes: Caminar 30 minutos
            Martes: Descanso o yoga suave 20 minutos
            Miércoles: Andar en bicicleta 20 minutos
            Jueves: Descanso o estiramientos 15 minutos
            Viernes: Natación suave 20 minutos
            Sábado: Caminar 40 minutos
            Domingo: Descanso
            """;
    static String intermedio = """
            Intermedio:
            Lunes: Correr 30 minutos + 10 minutos de estiramientos
            Martes: Entrenamiento de fuerza (piernas y brazos) 40 minutos
            Miércoles: Andar en bicicleta 45 minutos
            Jueves: Yoga o pilates 30 minutos
            Viernes: Entrenamiento HIIT (alta intensidad) 30 minutos
            Sábado: Correr 40 minutos
            Domingo: Descanso o caminata ligera 30 minutos""";
    static String avanzado = """
            Avanzado:
            Lunes: Correr 60 minutos (ritmo moderado) + 15 minutos de estiramientos
            Martes: Entrenamiento de fuerza (cuerpo completo) 60 minutos
            Miércoles: Natación intensa 45 minutos
            Jueves: Entrenamiento HIIT 45 minutos
            Viernes: Ciclismo intenso 60 minutos
            Sábado: Entrenamiento de fuerza (circuito) 60 minutos
            Domingo: Yoga o estiramientos profundos 30 minutos""";

    public static void main(String[] args) {
        /*
        Generador de Rutinas de Ejercicio
        Escribe un programa que pida al usuario su nivel de condición física (principiante, intermedio,
        avanzado) y luego genere una rutina de ejercicio semanal con diferentes tipos de ejercicios y
        duraciones.
         */

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su nivel de condicion fisica: \n1. Principiante \n2. Intermedio \n3. Avanzado \nopcion: ");
        int op;
        op = entrada.nextInt();

        switch (op) {
            case 1:
                System.out.println("Programa para Principiantes: \n");
                System.out.println(principiante);
                break;
            case 2:
                System.out.println("Programa para Intermedios: \n");
                System.out.println(intermedio);
                break;
            case 3:
                System.out.println("Programa para Avanzado: \n");
                System.out.println(avanzado);
                break;
            default:
                System.out.println("Opcion incorrecta.");

        }
    }
}
