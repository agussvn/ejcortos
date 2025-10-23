import java.util.Scanner;

public class ultfunciones {
    public static int sumar(int a, int b){
        return a+b;
    }

    public static int restar(int a, int b){
        return a-b;
    }

    public static int multiplicar(int a, int b){
        return a*b;
    }

    public static double dividir(double a, double b){
        if (b==0) {
            System.out.println("El division no puede ser igual a 0");
            return 0;
        }
        return a/b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int num1=sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int num2=sc.nextInt();

        System.out.print(" Elige la operación (+,-,*,/) ");
        String operacion=sc.next();

        double resultado =0;

        switch (operacion){
            case "+":
                resultado = sumar(num1,num2);
                break;
            case "-":
                resultado = restar(num1,num2);
                break;
            case "*":
                resultado = multiplicar(num1,num2);
                break;
            case "/":
                resultado = dividir(num1,num2);
                break;
            default:
                System.out.println("Operación no valida");
                return;
        }
        System.out.println("El resultado es: "+ resultado );
    }
}