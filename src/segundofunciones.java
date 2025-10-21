import java.util.Scanner;

public class segundofunciones {
    public static int sumar(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el 1er num: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce el 2er num: ");
        int num2 = sc.nextInt();

        int resultado = sumar(num1,num2);

        System.out.println(" La suma de" + num1 + " + " + num2 + "es = " + resultado);
    }
}