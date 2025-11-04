import java.util.Scanner;

public class array5 {
    public static void main(String[] args) {
        String[] saiyans = {"Son Goku" , "Vegeta" , "Broly" , "Bardock" , "Trunks"};

        int[] poderes ={10000,9500,9000,3500,6000};

        Scanner sc = new Scanner(System.in);
        String respuesta;

        do { System.out.println(" ¿De que saiyan quieres conocer el poder?: ");
    String consulta = sc.nextLine();

    boolean encontrado = false;

    for (int i = 0; i < saiyans.length; i++) {
        if (saiyans[i].equalsIgnoreCase(consulta)) {
            System.out.println(saiyans[i] + " tiene un poder de " + poderes[i]);
            encontrado = true;
            break;
        }
    }


            if (!encontrado) {
                System.out.println("No tengo datos de ese guerrero.");
            }
            System.out.print("¿Quieres consultar otro guerrero? (s/n): ");
            respuesta = sc.nextLine();

        } while (respuesta.equalsIgnoreCase("s"));
        int maxPoder = poderes[0];
        int minPoder = poderes[0];
        int indiceMax = 0;
        int indiceMin = 0;

        for (int i = 1; i < poderes.length; i++) {
            if (poderes[i] > maxPoder) {
                maxPoder = poderes[i];
                indiceMax = i;
            }
            if (poderes[i] < minPoder) {
                minPoder = poderes[i];
                indiceMin = i;
            }
        }

        System.out.println("\nEl Saiyan más fuerte es " + saiyans[indiceMax] + " con un poder de " + maxPoder);
        System.out.println("El Saiyan más débil es " + saiyans[indiceMin] + " con un poder de " + minPoder);

        sc.close();
    }
}








