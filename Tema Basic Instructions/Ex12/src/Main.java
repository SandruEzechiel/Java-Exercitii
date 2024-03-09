import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti un numar n: ");
        int n = scanner.nextInt();

        System.out.println("Divizorii primi ai lui " + n + " sunt:");

        for (int i = 2; i <= n; i++) {
            while (n % i == 0 && estePrim(i)) {
                System.out.println(i);
                n /= i;
            }
        }

       
    }

    private static boolean estePrim(int numar) {
        return numar > 1 && java.math.BigInteger.valueOf(numar).isProbablePrime(50);
    }
}
