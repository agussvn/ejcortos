import java.util.Scanner;

public class tercero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Introduce los HP de tu Pokemón ");
        int HPjugador = sc.nextInt();

        System.out.println(" Introduce los HP del Pokemón rival ");
        int HPrival = sc.nextInt();

        int danhojugador= 20;
        int danhorival = 15;

        while (HPjugador > 0 && HPrival > 0) {
            System.out.println("\n !Nuevo turno! ");
            HPjugador -= danhorival ;
            HPrival -= danhojugador ;

            System.out.println(" Tu pokemón hace " + danhojugador + " de daño " + " ,el rival se queda a " + Math.max(HPrival, 0) + " de vida ");
            System.out.println(" El rival te hace " + danhorival + " de daño " + " ,te quedas a " + Math.max(HPjugador, 0) + " de vida ");

            if (HPjugador > 0 && HPrival <= 0) {
                System.out.println("\n Tu pokemón ha ganado!");
            } else if (HPrival > 0 && HPjugador <= 0) {
                System.out.println("\n Has perdido!");
            } if  (HPjugador <= 0 && HPrival <= 0) {}
                System.out.println("\n Los dos pokemon han caído!");
                 sc.close();
        }

    }








    }
