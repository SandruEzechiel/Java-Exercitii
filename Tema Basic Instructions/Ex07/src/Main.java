import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti valoarea lui n: ");
        int n = scanner.nextInt();

        double suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Numarul " + (i + 1) + ": ");
            suma=suma+ scanner.nextDouble();
        }

        double media = suma / n;

        System.out.println("Media aritmetica a celor " + n + " numere este: " + media);

        scanner.close();
    }
}
