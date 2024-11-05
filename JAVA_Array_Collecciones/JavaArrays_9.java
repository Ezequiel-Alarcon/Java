package TAREAS_JAVA.JAVA_Array_Collecciones;
import java.util.Random;

public class JavaArrays_9 {
    public static void main(String[] args) {
        int[] aleatorio = new int[10];

        for (int i = 0; i < aleatorio.length; i++) {
            aleatorio[i] = new Random().nextInt(100);
        }

        for (int j : aleatorio) {
            System.out.print(j + " ");
        }
    }
}
