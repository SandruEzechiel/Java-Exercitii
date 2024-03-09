public class Main {
    public static void main(String[] args) {
        int numar = 1001; // Pornim de la 1001 pentru a găsi primul număr prim mai mare decât 1000

        while (!estePrim(numar)) {
            numar++;
        }

        System.out.println("Cel mai mic numar prim mai mare decat 1000 este: " + numar);
    }

    private static boolean estePrim(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
