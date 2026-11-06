import java.util.Scanner;

public class practica {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String nombre;
            double compra;
            double descuento;
            double total;

            System.out.print("Ingrese su nombre: ");
            nombre = scanner.nextLine();

            System.out.print("Ingrese el valor de la compra: ");
            compra = scanner.nextDouble();

            if (compra >= 100000) {
                descuento = compra * 0.20;
            } else {
                descuento = 0;
            }

            total = compra - descuento;

            System.out.println("Su nombre es: " + nombre);
            System.out.println("El valor de su compra es: " + compra);
            System.out.println("El valor del descuento es: " + descuento);
            System.out.println("El total a pagar es: " + total);
        }
    }
}
