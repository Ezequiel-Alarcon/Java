package TAREAS_JAVA.Java_POO_Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

// Clase Nota
class Nota {
    private String catedra;
    private double notaExamen;

    public Nota(String catedra, double notaExamen) {
        this.catedra = catedra;
        this.notaExamen = notaExamen;
    }

    public double getNotaExamen() {
        return notaExamen;
    }

    @Override
    public String toString() {
        return "Cátedra: " + catedra + ", Nota: " + notaExamen;
    }
}

// Clase Alumno
class Alumno {
    private String nombreCompleto;
    private long legajo;
    private ArrayList<Nota> notas;

    public Alumno(String nombreCompleto, long legajo) {
        this.nombreCompleto = nombreCompleto;
        this.legajo = legajo;
        this.notas = new ArrayList<>();
    }

    public void agregarNota(Nota nota) {
        notas.add(nota);
    }

    public double calcularPromedio() {
        if (notas.isEmpty()) return 0;
        double suma = 0;
        for (Nota nota : notas) {
            suma += nota.getNotaExamen();
        }
        return suma / notas.size();
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        info.append("Alumno: ").append(nombreCompleto)
                .append(", Legajo: ").append(legajo)
                .append(", Promedio: ").append(String.format("%.2f", calcularPromedio()))
                .append("\nNotas:\n");
        for (Nota nota : notas) {
            info.append("  ").append(nota).append("\n");
        }
        return info.toString();
    }
}

// Clase principal
public class POO_Relaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList<>();

        System.out.println("¿Cuántos alumnos desea cargar?");
        int cantidadAlumnos = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println("Ingrese el nombre completo del alumno:");
            String nombreCompleto = scanner.nextLine();
            System.out.println("Ingrese el legajo del alumno:");
            long legajo = scanner.nextLong();
            scanner.nextLine(); // Consumir el salto de línea

            Alumno alumno = new Alumno(nombreCompleto, legajo);
            System.out.println("¿Cuántas notas desea cargar para este alumno?");
            int cantidadNotas = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            while (cantidadNotas <= 0) {
                System.out.println("Debe ingresar al menos 1 nota. Intente nuevamente.");
                cantidadNotas = scanner.nextInt();
                scanner.nextLine();
            }

            for (int j = 0; j < cantidadNotas; j++) {
                System.out.println("Ingrese la cátedra:");
                String catedra = scanner.nextLine();
                System.out.println("Ingrese la nota del examen:");
                double notaExamen = scanner.nextDouble();
                scanner.nextLine(); // Consumir el salto de línea

                Nota nota = new Nota(catedra, notaExamen);
                alumno.agregarNota(nota);
            }

            alumnos.add(alumno);
        }

        // Mostrar la información de los alumnos y sus notas
        System.out.println("\nInformación cargada:");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }

        scanner.close();
    }
}

