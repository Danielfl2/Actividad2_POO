import java.util.Scanner;
public class Trabajo214 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el importe de ventas del departamento 1:");
        double ventasDepartamento1 = scanner.nextDouble();
        System.out.println("Ingrese el importe de ventas del departamento 2:");
        double ventasDepartamento2 = scanner.nextDouble();
        System.out.println("Ingrese el importe de ventas del departamento 3:");
        double ventasDepartamento3 = scanner.nextDouble();
        System.out.println("Ingrese el salario de los vendedores de cada departamento:");
        double salarioVendedores = scanner.nextDouble();
        double ventasTotales = ventasDepartamento1 + ventasDepartamento2 + ventasDepartamento3;
        double incentivoDepartamento1 = 0;
        double incentivoDepartamento2 = 0;
        double incentivoDepartamento3 = 0;
        if (ventasDepartamento1 > ventasTotales * 0.33) {
            incentivoDepartamento1 = salarioVendedores * 0.2;
        }
        if (ventasDepartamento2 > ventasTotales * 0.33) {
            incentivoDepartamento2 = salarioVendedores * 0.2;
        }
        if (ventasDepartamento3 > ventasTotales * 0.33) {
            incentivoDepartamento3 = salarioVendedores * 0.2;
        }
        double salarioFinalDepartamento1 = salarioVendedores + incentivoDepartamento1;
        double salarioFinalDepartamento2 = salarioVendedores + incentivoDepartamento2;
        double salarioFinalDepartamento3 = salarioVendedores + incentivoDepartamento3;
        System.out.println("Valor recibido por salario en el departamento 1: $" + salarioFinalDepartamento1);
        System.out.println("Valor recibido por salario en el departamento 2: $" + salarioFinalDepartamento2);
        System.out.println("Valor recibido por salario en el departamento 3: $" + salarioFinalDepartamento3);
    }
}