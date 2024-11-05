package TAREAS_JAVA.Java_POO_Ejercicios;

public class Planeta {
    // Atributos de la clase
    String nombre;
    int cantidadSatélites;
    double masa;            // Masa en kilogramos
    double volumen;         // Volumen en kilómetros cúbicos
    int diámetro;           // Diámetro en kilómetros
    int distanciaMediaSol;  // Distancia media al Sol en millones de kilómetros
    TipoPlaneta tipo;       // Tipo de planeta: GASEOSO, TERRESTRE, ENANO
    boolean observable;     // Observable a simple vista
    double periodoOrbital;  // Nuevo atributo: periodo orbital (en años)
    double periodoRotación; // Nuevo atributo: periodo de rotación (en días)

    /**
     * Constructor de la clase Planeta que inicializa los valores de los atributos.
     * @param nombre Nombre del planeta
     * @param cantidadSatélites Cantidad de satélites
     * @param masa Masa del planeta
     * @param volumen Volumen del planeta
     * @param diámetro Diámetro del planeta
     * @param distanciaMediaSol Distancia media al Sol
     * @param tipo Tipo de planeta
     * @param observable Si es observable a simple vista
     * @param periodoOrbital Periodo orbital en años
     * @param periodoRotación Periodo de rotación en días
     */
    public Planeta(String nombre, int cantidadSatélites, double masa, double volumen, int diámetro, int distanciaMediaSol, TipoPlaneta tipo, boolean observable, double periodoOrbital, double periodoRotación) {
        this.nombre = nombre;
        this.cantidadSatélites = cantidadSatélites;
        this.masa = masa;
        this.volumen = volumen;
        this.diámetro = diámetro;
        this.distanciaMediaSol = distanciaMediaSol;
        this.tipo = tipo;
        this.observable = observable;
        this.periodoOrbital = periodoOrbital;
        this.periodoRotación = periodoRotación;
    }

    /**
     * Método que imprime en pantalla los datos de un planeta.
     */
    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de satélites: " + cantidadSatélites);
        System.out.println("Masa: " + masa + " kg");
        System.out.println("Volumen: " + volumen + " km³");
        System.out.println("Diámetro: " + diámetro + " km");
        System.out.println("Distancia media al Sol: " + distanciaMediaSol + " millones de km");
        System.out.println("Tipo de planeta: " + tipo);
        System.out.println("Observable a simple vista: " + observable);
        System.out.println("Periodo orbital: " + periodoOrbital + " años");
        System.out.println("Periodo de rotación: " + periodoRotación + " días");
        System.out.println();
    }

    public static void main(String[] args) {
        Planeta planeta1 = new Planeta("Júpiter", 79, 1.898e27, 1.43e15, 139820, 778, TipoPlaneta.GASEOSO, true, 11.86, 0.41);
        Planeta planeta2 = new Planeta("Marte", 2, 6.417e23, 1.63e11, 6792, 228, TipoPlaneta.TERRESTRE, true, 1.88, 1.03);

        planeta1.imprimir();
        planeta2.imprimir();
    }
}

// Enum para el tipo de planeta
enum TipoPlaneta {
    GASEOSO,
    TERRESTRE,
    ENANO
}
