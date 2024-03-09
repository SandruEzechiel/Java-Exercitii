public class Main {
    public static void main(String[] args) {
        int sumaDorita = 1000;

        System.out.println("Perechile de numere a caror suma este 1000, primul divizibil cu 17 sau 13, al doilea cu 19 sau 7:");

        for (int primulNumar = 0; primulNumar <= sumaDorita; primulNumar++) {
            if (primulNumar % 17 == 0 || primulNumar % 13 == 0) {
                int alDoileaNumar = sumaDorita - primulNumar;

                if (alDoileaNumar % 19 == 0 || alDoileaNumar % 7 == 0) {
                    System.out.println("(" + primulNumar + ", " + alDoileaNumar + ")");
                }
            }
        }
    }
}

