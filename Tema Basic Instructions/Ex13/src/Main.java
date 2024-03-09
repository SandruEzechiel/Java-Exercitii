public class Main {
    public static void main(String[] args) {
        int sumaDorita = 1000;

        System.out.println("Perechile de numere a caror suma este 1000, primul divizibil cu 17, al doilea cu 19:");

        for (int primulNumar = 0; primulNumar <= sumaDorita; primulNumar += 17) {
            int alDoileaNumar = sumaDorita - primulNumar;

            if (alDoileaNumar % 19 == 0) {
                System.out.println("(" + primulNumar + ", " + alDoileaNumar + ")");
            }
        }
    }
}
