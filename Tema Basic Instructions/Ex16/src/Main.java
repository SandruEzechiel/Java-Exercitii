import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti un numar: ");
        int numar = scanner.nextInt();

        afiseazaCifre(numar);

    }

    private static void afiseazaCifre(int numar) {
        System.out.println("Cifrele numarului sunt:");

        // Convertește numărul în șir de caractere pentru a itera prin cifre
        String numarString = Integer.toString(numar);

        for (int i = 0; i < numarString.length(); i++) {
            char cifra = numarString.charAt(i);
            System.out.println(cifra);
        }
    }
}
