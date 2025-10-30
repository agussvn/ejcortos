import java.util.Random;
import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {

        String[] jugadores = {"Rojo", "Azul", "Verde", "Amarillo", "Rosa", "Negro"};


        Random random = new Random();
        int probImpostor = random.nextInt(jugadores.length);

        System.out.println("Jugadores en la partida:");
        for (int i = 0; i < jugadores.length; i++) {
            System.out.println("- " + jugadores[i]);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("\n¿Quién crees que es el impostor? Escribe el nombre: ");
        String sospechoso = sc.nextLine();

        String impostorReal = "";
        for (int i = 0; i < jugadores.length; i++) {
            if (i == probImpostor) {
                impostorReal = jugadores[i];
            }
        }

        System.out.println("\nEl impostor era: " + impostorReal + " SUS ");

        if (sospechoso.equalsIgnoreCase(impostorReal)) {
            System.out.println(" ¡Has acertado! ");
        } else {
            System.out.println(" Has fallado ");
        }

        sc.close();
    }
}
