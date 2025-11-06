public class array1 {
    public static void main(String[] args) {

        String[] inventario = {"espada" , "pico" , "hacha" , "pala" , "antorcha"};

        for (int i=0; i<inventario.length; i++){
          System.out.println(" Tienes en tu inventario " + inventario[i]);
        }

        System.out.println(" El jugador tiene" + inventario.length + " objectos en el inventario");

    }
}
