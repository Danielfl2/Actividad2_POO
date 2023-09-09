import java.util.Scanner;
public class actividad2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Ingrese el codigo del empleado: ");
            int codigo = input.nextInt();
            input.nextLine();
            System.out.print("Ingrese los nombres del empleado: ");
            String nombres = input.nextLine();
            System.out.print("Ingrese el numero de horas trabajadas al mes: ");
            int horasTrabajadas = input.nextInt();
            System.out.print("Ingrese el valor de la hora trabajada: ");
            double valorHora = input.nextDouble();
            System.out.print("Ingrese el porcentaje de retenciofn en la fuente: ");
            double retencionFuente = input.nextDouble();   
            double salarioBruto = horasTrabajadas * valorHora;
            double retencion = salarioBruto * (retencionFuente / 100);
            double salarioNeto = salarioBruto - retencion;
            System.out.println("Codigo del empleado: " + codigo);
            System.out.println("Nombres del empleado: " + nombres);
            System.out.println("Salario bruto: " + salarioBruto);
            System.out.println("Salario neto: " + salarioNeto);
        }
    }
}