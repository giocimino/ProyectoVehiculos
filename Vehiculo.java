import java.util.Scanner;

public class Vehiculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la marca: ");
        String marca = scanner.nextLine();

        System.out.print("Ingrese el modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Ingrese la cilindrada: ");
        int cilindrada = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea

        System.out.print("Ingrese el tipo de combustible: ");
        String tipoCombustible = scanner.nextLine();

        System.out.print("Ingrese la capacidad de pasajeros: ");
        int capacidad = scanner.nextInt();

        System.out.println("La marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
        System.out.println("El tipo de combustible es: " + tipoCombustible);
        System.out.println("Tiene una capacidad de " + capacidad + " pasajeros.");

        scanner.close();
    }
}
