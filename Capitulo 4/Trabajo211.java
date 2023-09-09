import java.util.Scanner;
public class Trabajo211 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo nUmero:");
        int numero2 = scanner.nextInt();
        System.out.println("Ingrese el tercer numero:");
        int numero3 = scanner.nextInt();
        int mayor = numero1;
        if (numero2 > mayor) {
            mayor = numero2;
        }

        if (numero3 > mayor) {
            mayor = numero3;
        }

        System.out.println("El mayor numero es: " + mayor);
    }
}