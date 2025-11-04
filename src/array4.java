import java.util.Scanner;
public class array4 {
    public static void main(String[] args) {
        String[] pokemons = new String[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < pokemons.length; i++) {
            System.out.print("Ingresa el Pokémon " + (i + 1) + ": ");
            pokemons[i] = sc.nextLine();
        }
        System.out.println("\nPokémon capturados en orden inverso:");
        for (int i = pokemons.length - 1; i >= 0; i--) {
            System.out.println(pokemons[i]);
        }
        sc.close();
    }
}
