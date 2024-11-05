package TAREAS_JAVA.JAVA_Array_Collecciones;

public class JavaArrays_4 {
    /*
     * Programa que crea un array de 20 elementos llamado Pares y guarde los 20 primeros
     * números pares. Mostrar por pantalla el contenido del array creado
     */
    public static void main(String[] args) {

        int i=0,contador=0;
        int[] numPares = new int[20];

        for (i=0; i<numPares.length; i++) {
            numPares[i]=contador;
            contador+=2;
        }

        for (i=0; i<numPares.length; i++) {
            System.out.println(numPares[i]);
        }

    }
}
