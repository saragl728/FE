import java.util.Scanner;

public class dosrnparte {
    public static void main(String[] args) {
        Scanner escan = new Scanner(System.in);
        int ratiogolpe;
        int r1, r2; // números aleatorios que se generan
        int salida; // media de los números
        int golpes = 0;

        System.out.println("Introducir el ratio de ataque");
        ratiogolpe = Integer.parseInt(escan.nextLine());
        escan.close();

        //lo intenta hasta que acierte
        do {
            // se tiran 2 números
            r1 = (int) (Math.random() * 101);
            r2 = (int) (Math.random() * 101);

            // se hace la media de los números aleatorios
            salida = (r1 + r2) / 2;
            // se comprueba si el número es menor que el ratio de ataque
            if (salida < ratiogolpe) {
                System.out.println("Ha acertado");
            } else {
                System.out.println("No ha acertado");
            }
            golpes++;
        } while (salida >= ratiogolpe);
        System.out.println("Se han tardato " + golpes + " ataques");

    }
}
