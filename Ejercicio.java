import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double totalDeVentas = 0;
            double ventaMayor = 0;
            int ventasMayoresA100000 = 0;
            boolean huboVentasMayoresA800000 = false;

            for (int i = 1; i <= 15; i++) {
                System.out.print("Ingrese el valor de la venta " + i + ": ");
                double venta = scanner.nextDouble();

                totalDeVentas += venta;

                if (venta > 100000) {
                    ventasMayoresA100000++;
                }

                if (venta > ventaMayor) {
                    ventaMayor = venta;
                }

                if (venta > 800000) {
                    huboVentasMayoresA800000 = true;
                }
            }

            System.out.println("Total vendido: " + totalDeVentas);
            System.out.println("Ventas superiores a 100.000: " + ventasMayoresA100000);
            System.out.println("Venta de mayor valor: " + ventaMayor);
            System.out.println("Hubo una venta superior a 800.000: " + huboVentasMayoresA800000);
        }
    }
}
