import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti un numar n: ");
        int n = scanner.nextInt();

        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial=factorial* i;
        }

        System.out.println("Factorialul lui " + n + " este: " + factorial);

        scanner.close();
    }
}
