
import java.util.Scanner;

public class array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("introduce el núm de elementos del array:");
        int n = sc.nextInt();

        System.out.println("Dame un valor mínimo:");
        double min = sc.nextDouble();

        System.out.println("Ahora el valor máx:");
        double max = sc.nextDouble();

        double[] numeros = new double[n];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Math.random() * (max - min) + min;
        }
        System.out.println("\nContenido del array:");
        for (int i = 0; i <numeros.length; i++) {
            System.out.printf("posición %d: %.2f%n" , i, numeros[i]);
        }
        sc.close();
    }
}