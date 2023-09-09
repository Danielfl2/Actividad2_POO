import java.util.Scanner;

public class Trabajo22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor del lado del triangulo equilatero:");
        double lado = scanner.nextDouble();

        double perimetro = 3 * lado;
        double altura = Math.sqrt(3) / 2 * lado;
        double area = (Math.sqrt(3) / 4) * lado * lado;

        System.out.println("Perimetro del triangulo: " + perimetro);
        System.out.println("Altura del triangulo: " + altura);
        System.out.println("Area del triangulo: " + area);
    }
}