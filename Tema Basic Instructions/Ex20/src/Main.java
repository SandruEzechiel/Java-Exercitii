import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti un numar: ");
        int numar = scanner.nextInt();

        if (estePalindrom(numar)) {
            System.out.println("Numarul " + numar + " este palindrom.");
        } else {
            System.out.println("Numarul " + numar + " nu este palindrom.");
        }

        scanner.close();
    }

    private static boolean estePalindrom(int numar) {
        int inversul = 0;
        int temp = numar;

        while (temp != 0) {
            inversul = inversul * 10 + temp % 10;
            temp =temp/ 10;
        }

        return inversul == numar;
    }
}
