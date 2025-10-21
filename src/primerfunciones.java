import java.util.Scanner;

public class primerfunciones {

    public static void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "! Bienvenido al servidor de programación.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombreUsuario = sc.nextLine();

        saludar(nombreUsuario);
    }
}

