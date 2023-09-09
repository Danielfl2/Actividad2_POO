import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el valor del lado 1 del triangulo:");
            double lado1 = scanner.nextDouble();

            System.out.println("Ingrese el valor del lado 2 del triangulo:");
            double lado2 = scanner.nextDouble();

            System.out.println("Ingrese el valor del lado 3 del triangulo:");
            double lado3 = scanner.nextDouble();

            double perimetro = lado1 + lado2 + lado3;
            double semiperimetro = perimetro / 2;

            double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));

            System.out.println("Perimetro del triangulo: " + perimetro);
            System.out.println("Semiperimetro del triangulo: " + semiperimetro);
            System.out.println("Area del triangulo: " + area);
        }
    }
}