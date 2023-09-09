import java.util.Scanner;
public class Trabajo210 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el numero de inscripcion:");
            int numeroInscripcion = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Ingrese los nombres y apellidos:");
            String nombres = scanner.nextLine();
            System.out.println("Ingrese el patrimonio:");
            double patrimonio = scanner.nextDouble();
            System.out.println("Ingrese el estrato social:");
            int estratoSocial = scanner.nextInt();
            double pagoMatricula = 50000;
            if (patrimonio > 2000000 && estratoSocial > 3) {
                double incremento = patrimonio * 0.03;
                pagoMatricula += incremento;
            }
            System.out.println("Numero de inscripciun: " + numeroInscripcion);
            System.out.println("Nombres y apellidos: " + nombres);
            System.out.println("Pago de matricula: $" + pagoMatricula);
        }
    }
}