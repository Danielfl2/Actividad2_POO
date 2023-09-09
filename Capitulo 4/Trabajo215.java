import java.util.Scanner;

public class Trabajo215 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el peso de la esfera A:");
        double pesoEsferaA = scanner.nextDouble();

        System.out.println("Ingrese el peso de la esfera B:");
        double pesoEsferaB = scanner.nextDouble();

        System.out.println("Ingrese el peso de la esfera C:");
        double pesoEsferaC = scanner.nextDouble();

        System.out.println("Ingrese el peso de la esfera D:");
        double pesoEsferaD = scanner.nextDouble();

        if (pesoEsferaA == pesoEsferaB && pesoEsferaA == pesoEsferaC) {
            System.out.println("La esfera D es diferente y es de " + ((pesoEsferaD > pesoEsferaA) ? "mayor" : "menor") + " peso que las otras tres.");
        } else if (pesoEsferaA == pesoEsferaB && pesoEsferaA == pesoEsferaD) {
            System.out.println("La esfera C es diferente y es  de " + ((pesoEsferaC > pesoEsferaA) ? "mayor" : "menor") + " peso que las otras tres.");
        } else if (pesoEsferaA == pesoEsferaC && pesoEsferaA == pesoEsferaD) {
            System.out.println("La esfera B es diferente y es  de" + ((pesoEsferaB > pesoEsferaA) ? "mayor" : "menor") + " peso que las otras tres.");
        } else {
            System.out.println("La esfera A es la diferente y es de " + ((pesoEsferaA > pesoEsferaB && pesoEsferaA > pesoEsferaC && pesoEsferaA > pesoEsferaD) ? "mayor" : "menor") + " peso que las otras tres.");
        }
    }
}