import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti un numar n: ");
        int n = scanner.nextInt();

        System.out.println("Divizorii lui " + n + " sunt:");

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) System.out.println(i);
        }

    
    }
}
