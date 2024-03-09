import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti un numar: ");
        int numar = scanner.nextInt();

        int cifraMinima = gasesteCifraMinima(numar);

        System.out.println("Cifra minima a numarului este: " + cifraMinima);

        scanner.close();
    }

    private static int gasesteCifraMinima(int numar) {
        int cifraMinima = 9;

        while (numar > 0) {
            cifraMinima = Math.min(cifraMinima, numar % 10);
            numar /= 10;
        }

        return cifraMinima;
    }
}
