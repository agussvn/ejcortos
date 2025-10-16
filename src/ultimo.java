import java.util.Scanner;

public class ultimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroAleatorio = (int)(Math.random() * 10) + 1;
        int intento;
        int contador = 0;

        System.out.println("Adivina el número (entre 1 y 10):");

        do {
            System.out.print("Introduce tu número: ");
            intento = sc.nextInt();
            contador++;

            if (intento < numeroAleatorio) {
                System.out.println("El número es mayor.");
            } else if (intento > numeroAleatorio) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("¡Correcto! Has adivinado el número en " + contador + " intentos!");
            }
        } while (intento != numeroAleatorio);

        sc.close();
    }
}

