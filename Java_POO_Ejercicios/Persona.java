package TAREAS_JAVA.Java_POO_Ejercicios;

public class Persona {
    // Atributos de la clase
    String nombre;
    String apellidos;
    String númeroDocumentoIdentidad;
    int añoNacimiento;
    String paísNacimiento; // Nuevo atributo: país de nacimiento
    char género;           // Nuevo atributo: género ('H' o 'M')

    /**
     * Constructor de la clase Persona que inicializa los valores de los atributos.
     * @param nombre Nombre de la persona
     * @param apellidos Apellidos de la persona
     * @param númeroDocumentoIdentidad Número de documento de identidad
     * @param añoNacimiento Año de nacimiento
     * @param paísNacimiento País de nacimiento
     * @param género Género ('H' o 'M')
     */
    public Persona(String nombre, String apellidos, String númeroDocumentoIdentidad, int añoNacimiento, String paísNacimiento, char género) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.númeroDocumentoIdentidad = númeroDocumentoIdentidad;
        this.añoNacimiento = añoNacimiento;
        this.paísNacimiento = paísNacimiento;
        this.género = género;
    }

    /**
     * Método que imprime en pantalla los datos de una persona.
     */
    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Número de documento de identidad: " + númeroDocumentoIdentidad);
        System.out.println("Año de nacimiento: " + añoNacimiento);
        System.out.println("País de nacimiento: " + paísNacimiento);
        System.out.println("Género: " + género);
        System.out.println();
    }

    public static void main(String[] args) {
        Persona p1 = new Persona("Pedro", "Pérez", "1053121010", 1998, "Argentina", 'H');
        Persona p2 = new Persona("Luis", "León", "1053223344", 2001, "Chile", 'M');

        p1.imprimir();
        p2.imprimir();
    }
}
