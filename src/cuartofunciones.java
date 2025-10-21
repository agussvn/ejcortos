import java.util.Random;
import java.util.Scanner;

public class cuartofunciones {

    public static int lanzarDado() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
    public static void main(String[] args) {

        System.out.print(" Has lanzado el dado 5 veces. ");

        for (int i = 1; i <= 5; i++) {
            int resultado = lanzarDado();
            System.out.print( " \nTirada nº" + i + " = " + resultado);
        }
        System.out.println("\nParece que hoy es tu día de suerte. ");
    }

}