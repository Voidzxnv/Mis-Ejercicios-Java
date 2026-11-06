import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese un numero (0 para terminar): ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                System.out.println("No se ingresaron numeros para comparar.");
                return;
            }

            int mayor = numero;
            int menor = numero;

            while (numero != 0) {
                if (numero > mayor) {
                    mayor = numero;
                }

                if (numero < menor) {
                    menor = numero;
                }

                System.out.print("Ingrese otro numero (0 para terminar): ");
                numero = scanner.nextInt();
            }

            System.out.println("Numero mayor: " + mayor);
            System.out.println("Numero menor: " + menor);
        }
    }
}
