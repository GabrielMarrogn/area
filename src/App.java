import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double pi = 3.14159;
        sc.close();

        double triangulo = a*c /2;
        double circulo = pi * Math.pow(c, 2);
        double trapezio = (a + b) * c/ 2;
        double quadrado = b * b;
        double retrangulo = a * b;

        System.out.printf("TRIANGULO: %.3f\n", triangulo);
        System.out.printf("CIRCULO: %.3f\n", circulo);
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETANGULO: %.3f\n", retrangulo);
    }
}
