import java.util.Scanner;

public class Trabajo222 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el nombre del empleado:");
            String nombreEmpleado = scanner.nextLine();

            System.out.println("Ingrese el salario basico por hora del empleado:");
            double salarioBasico = scanner.nextDouble();

            System.out.println("Ingrese el numero de horas trabajadas en el mes:");
            int horasTrabajadas = scanner.nextInt();

            double salarioMensual = salarioBasico * horasTrabajadas;

            if (salarioMensual > 450000) {
                System.out.println("Nombre del empleado: " + nombreEmpleado);
                System.out.println("Salario mensual: $" + salarioMensual);
            } else {
                System.out.println("Nombre del empleado: " + nombreEmpleado);
            }
        }
    }
}