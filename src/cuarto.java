import java.util.Scanner;

public class cuarto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántas veces quieres lanzar la moneda? ");
        int lanzamientos = scanner.nextInt();

        int caras = 0;
        int cruces = 0;

        for (int i = 1; i <= lanzamientos; i++) {
            double resultado = Math.random();

            if (resultado < 0.5) {
                System.out.println("Lanzamiento " + i + ": Cara");
                caras++;
            } else {
                System.out.println("Lanzamiento " + i + ": Cruz");
                cruces++;
            }
        }
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Caras: " + caras);
        System.out.println("Cruces: " + cruces);

        scanner.close();
    }
}
