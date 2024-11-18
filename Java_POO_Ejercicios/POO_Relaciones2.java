package TAREAS_JAVA.Java_POO_Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

// Clase Ingrediente
class Ingrediente {
    private String nombre;
    private double cantidad;
    private String unidadDeMedida;

    public Ingrediente(String nombre, double cantidad, String unidadDeMedida) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidadDeMedida = unidadDeMedida;
    }

    @Override
    public String toString() {
        return nombre + " - " + cantidad + " " + unidadDeMedida;
    }
}

// Clase Plato
class Plato {
    private String nombreCompleto;
    private double precio;
    private boolean esBebida;
    private ArrayList<Ingrediente> ingredientes;

    public Plato(String nombreCompleto, double precio, boolean esBebida) {
        this.nombreCompleto = nombreCompleto;
        this.precio = precio;
        this.esBebida = esBebida;
        this.ingredientes = new ArrayList<>();
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        if (!esBebida) {
            ingredientes.add(ingrediente);
        }
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        info.append("Plato: ").append(nombreCompleto)
                .append("\nPrecio: $").append(String.format("%.2f", precio))
                .append("\nTipo: ").append(esBebida ? "Bebida" : "Comida")
                .append("\n");

        if (!esBebida && !ingredientes.isEmpty()) {
            info.append("Ingredientes:\n");
            for (Ingrediente ingrediente : ingredientes) {
                info.append("  - ").append(ingrediente).append("\n");
            }
        }
        return info.toString();
    }
}

// Clase principal
public class POO_Relaciones2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Plato> menu = new ArrayList<>();

        System.out.println("¿Cuántos platos desea agregar al menú?");
        int cantidadPlatos = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        for (int i = 0; i < cantidadPlatos; i++) {
            System.out.println("Ingrese el nombre del plato:");
            String nombrePlato = scanner.nextLine();

            System.out.println("Ingrese el precio del plato:");
            double precio = scanner.nextDouble();

            System.out.println("¿Es una bebida? (true/false):");
            boolean esBebida = scanner.nextBoolean();
            scanner.nextLine(); // Consumir el salto de línea

            Plato plato = new Plato(nombrePlato, precio, esBebida);

            if (!esBebida) {
                System.out.println("¿Cuántos ingredientes desea agregar para este plato?");
                int cantidadIngredientes = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                while (cantidadIngredientes <= 0) {
                    System.out.println("Debe ingresar al menos 1 ingrediente. Intente nuevamente.");
                    cantidadIngredientes = scanner.nextInt();
                    scanner.nextLine();
                }

                for (int j = 0; j < cantidadIngredientes; j++) {
                    System.out.println("Ingrese el nombre del ingrediente:");
                    String nombreIngrediente = scanner.nextLine();

                    System.out.println("Ingrese la cantidad del ingrediente:");
                    double cantidadIngrediente = scanner.nextDouble();

                    System.out.println("Ingrese la unidad de medida del ingrediente:");
                    scanner.nextLine(); // Consumir el salto de línea
                    String unidadDeMedida = scanner.nextLine();

                    Ingrediente ingrediente = new Ingrediente(nombreIngrediente, cantidadIngrediente, unidadDeMedida);
                    plato.agregarIngrediente(ingrediente);
                }
            }

            menu.add(plato);
        }

        // Mostrar el menú completo
        System.out.println("\nMenú del Restaurant:");
        for (Plato plato : menu) {
            System.out.println(plato);
        }

        scanner.close();
    }
}
