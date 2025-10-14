import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos bloques quieres picar? ");
        int bloques = sc.nextInt();

        for (int i = 1; i <= bloques; i++) {
            System.out.println("Picando bloque " + i + "...");
        }

        System.out.println("¡Has picado " + bloques + " bloques!");

        sc.close();
    }
}

