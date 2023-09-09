import java.util.Scanner;
public class Trabajo213 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el valor de la compra:");
            double valorCompra = scanner.nextDouble();
            System.out.println("Ingrese el color de la bolita (blanca, verde, amarilla, azul, roja):");
            String colorBolita = scanner.next();
            double descuento = 0;
            switch (colorBolita) {
                case "verde":
                    descuento = 0.1;
                    break;
                case "amarilla":
                    descuento = 0.25;
                    break;
                case "azul":
                    descuento = 0.5;
                    break;
                case "roja":
                    descuento = 1;
                    break;
                default:
                    break;
            }
            double valorPagar = valorCompra - (valorCompra * descuento);
            System.out.println("Valor a pagar: $" + valorPagar);
        }
    }
}