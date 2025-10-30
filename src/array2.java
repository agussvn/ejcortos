public class array2 {
    public static void main(String[] args) {

        int[] puntuaciones = {1200, 2380, 1980, 1750, 2100, 1890};


        int total = 0;
        int max = puntuaciones[0];

        for (int i = 0; i < puntuaciones.length; i++) {
            total += puntuaciones[i];

            if (puntuaciones[i] > max) {
                max = puntuaciones[i];
            }
        }


        double media = (double) total / puntuaciones.length;


        System.out.println("Puntuación total: " + total + " puntos.");
        System.out.println("Media por partida: " + media + " puntos.");
        System.out.println("Tu récord fue de " + max + " puntos en una partida.");
    }
}


