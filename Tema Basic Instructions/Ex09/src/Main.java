import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti un numar n (diferit de 0 sau 1): ");
        int n = scanner.nextInt();

        if (n <= 1) {
            System.out.println("Numarul trebuie sa fie mai mare decat 1");
        } else {
            boolean estePrim = true;

            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    estePrim = false;
                    break;
                }
            }

            System.out.println(estePrim ? n + " este un numar prim." : n + " nu este un numar prim.");
        }

        scanner.close();
    }
}
