import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti un numar: ");
        int numar = scanner.nextInt();

        int cifraMaxima = gasesteCifraMaxima(numar);

        System.out.println("Cifra maxima a numarului este: " + cifraMaxima);

    }

    private static int gasesteCifraMaxima(int numar) {
        int cifraMaxima = 0;

        while (numar > 0) {
            cifraMaxima = Math.max(cifraMaxima, numar % 10);
            numar =numar/ 10;
        }

        return cifraMaxima;
    }
}
