import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double promedio;
            double descuento;
            double valorDescuento;
            double valorMatricula = 1000000;
            double valorFinal;

            System.out.print("Ingrese el promedio del estudiante: ");
            promedio = scanner.nextDouble();

            if (promedio == 5.0) {
                descuento = 100;
            } else if (promedio >= 4.5) {
                descuento = 50;
            } else if (promedio >= 4.0) {
                descuento = 25;
            } else {
                descuento = 0;
            }

            valorDescuento = valorMatricula * descuento / 100;
            valorFinal = valorMatricula - valorDescuento;

            System.out.println("El promedio del estudiante es: " + promedio);
            System.out.println("El porcentaje de descuento es: " + descuento + "%");
            System.out.println("El descuento es: " + valorDescuento);
            System.out.println("El valor final de la matricula es: " + valorFinal);
        }
    }
}
