import java.util.Scanner;

public class practica2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String nombre;
            int edad;
            double entrada = 20000;
            double descuento = 0;
            double total;
            double valorDescuento;

            System.out.print("Ingrese su nombre: ");
            nombre = scanner.nextLine();

            System.out.print("Ingrese su edad: ");
            edad = scanner.nextInt();

            if (edad < 12) {
                descuento = 0.50;
            } else if (edad < 18) {
                descuento = 0.30;
            }

            valorDescuento = entrada * descuento;
            total = entrada - valorDescuento;

            System.out.println("Su nombre es: " + nombre);
            System.out.println("Su edad es: " + edad);
            System.out.println("El valor de la entrada es: " + entrada);
            System.out.println("El valor del descuento es: " + valorDescuento);
            System.out.println("El total a pagar es: " + total);
        }
    }
}
