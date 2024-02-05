package Projects;

public class afasfa {

    public static class Main {
        int modelYil;
        String modelIsim;

        public Main(int yil, String isim) {
            modelYil = yil;
            modelIsim = isim;
        }

        public static void main(String[] args) {
            Main benimArabam = new Main(1969, "Mustang");
            System.out.println(benimArabam.modelYil + " " + benimArabam.modelIsim);
        }
    }
}
