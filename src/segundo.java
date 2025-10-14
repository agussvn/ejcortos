import java.util.Scanner;

public class segundo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo, precio;
        System.out.println("Introduce tu saldo:");
        saldo = sc.nextDouble();

        System.out.println("Introduce el precio del refresco:");
        precio = sc.nextDouble();

        while (saldo < precio) {
            System.out.println("Saldo insuficiente");
            System.out.println("Introduce más saldo");
            saldo += sc.nextDouble();
        }
        double restante = saldo - precio;
        System.out.println("Saldo restante: " + restante);
        sc.close();





    }
}