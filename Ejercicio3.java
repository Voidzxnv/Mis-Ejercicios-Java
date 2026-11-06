import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int ahorroInicial = 50000;
            int totalAportes = 0;

            while (totalAportes < 500000) {
                System.out.print("Ingrese su aporte: ");
                int aporte = scanner.nextInt();

                if (aporte > 0) {
                    totalAportes += aporte;
                } else {
                    System.out.println("El aporte debe ser mayor que cero.");
                }
            }

            int totalAhorrado = ahorroInicial + totalAportes;
            System.out.println("Total ahorrado: " + totalAhorrado);
            System.out.println("Total de aportes: " + totalAportes);
        }
    }
}
