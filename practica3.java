import java.util.Scanner;

public class practica3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;

            do {
                System.out.println(".====== MENU DE VIDEOJUEGOS ======.");
                System.out.println("1. Minecraft");
                System.out.println("2. Fortnite");
                System.out.println("3. Free Fire");
                System.out.println("4. Salir");
                System.out.print("Elige una opcion: ");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has elegido Minecraft");
                        break;
                    case 2:
                        System.out.println("Has elegido Fortnite");
                        break;
                    case 3:
                        System.out.println("Has elegido Free Fire");
                        break;
                    case 4:
                        System.out.println("Has salido del menu");
                        break;
                    default:
                        System.out.println("Opcion invalida. Por favor, ingrese una opcion valida.");
                }
            } while (opcion != 4);
        }
    }
}
