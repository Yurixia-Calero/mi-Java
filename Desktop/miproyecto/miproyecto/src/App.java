import java.util.Scanner;

public class App {

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número para multiplicar: ");
        int a = scanner.nextInt();

        System.out.print("Ingrese el segundo número para multiplicar: ");
        int b = scanner.nextInt();

        int resultado = multiplicar(a, b);
        System.out.println("Resultado de la multiplicación: " + resultado);

        scanner.close();
    }
}
