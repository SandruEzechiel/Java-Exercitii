public class Main {
    public static void main(String[] args) {
        System.out.println("Numerele de 4 cifre de forma '3a2b' care se divid cu 9 sunt:");

        for (int a = 0; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                int numar = 3000 + a * 100 + b * 10;
                if (numar % 9 == 0) {
                    System.out.println(numar);
                }
            }
        }
    }
}
