import java.util.Scanner;
public class trabajo212 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese los nombres del trabajador:");
            String nombres = scanner.nextLine();
            System.out.println("Ingrese el numero de horas trabajadas:");
            int horasTrabajadas = scanner.nextInt();
            System.out.println("Ingrese el valor de una hora de trabajo:");
            double valorHora = scanner.nextDouble();
            double salarioDevengado;
            if (horasTrabajadas <= 40) {
                salarioDevengado = horasTrabajadas * valorHora;
            } else {
                int horasNormales = 40;
                double horasExtras = horasTrabajadas - horasNormales;
                if (horasExtras <= 8) {
                    salarioDevengado = (horasNormales * valorHora) + (horasExtras * valorHora * 2);
                } else {
                    double horasExtrasDobles = 8;
                    double horasExtrasTriples = horasExtras - horasExtrasDobles;
                    salarioDevengado = (horasNormales * valorHora) + (horasExtrasDobles * valorHora * 2) + (horasExtrasTriples * valorHora * 3);
                }
            }
            System.out.println("Nombre del trabajador: " + nombres);
            System.out.println("Salario devengado: $" + salarioDevengado);
        }
    }
}