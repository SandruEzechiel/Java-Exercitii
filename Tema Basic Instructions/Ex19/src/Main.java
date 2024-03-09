import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti un numar: ");
        int numar = scanner.nextInt();

        int inversulNumarului = calculeazaInversul(numar);

        System.out.println("Inversul numarului este: " + inversulNumarului);

    }

    private static int calculeazaInversul(int numar) {
        int inversul = 0;

        while (numar != 0) {
            inversul = inversul * 10 + numar % 10;
            numar =numar/ 10;
        }

        return inversul;
    }
}
