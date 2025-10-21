import java.util.Scanner;

public class tercerofunciones{
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Introduce la temp en grados celsius ");
        double tempCelsius = scanner.nextDouble();

        double tempFahrenheit = celsiusAFahrenheit(tempCelsius);

        System.out.println(tempFahrenheit + " ºC equivalen a " + tempFahrenheit + " ºF ");
    }

}


