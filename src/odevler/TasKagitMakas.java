package odevler;

import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas {

    private int oyuncuSkor;
    private int bilgisayarSkor;

    private final Scanner scanner ;

    private final Random random;


    public TasKagitMakas() {
        oyuncuSkor = 0;
        bilgisayarSkor = 0;
        scanner = new Scanner(System.in);
        random = new Random();

    }

    public static void main(String[] args) {
        TasKagitMakas oyun = new TasKagitMakas();
        oyun.oyna();
    }

    public void oyna() {
        System.out.println("Selcugun eline vermeye hazırsan oyun başlıyor");


        while (oyuncuSkor < 3 && bilgisayarSkor < 3) {
            int oyuncuHamlesi = oyuncuHamlesiAl();
            int bilgisayarHamlesi = bilgisayarHamlesiYap();

            System.out.println("Oyuncu Hamlesi " + oyuncuHamlesi);
            System.out.println("Bilgisayar Hamlesi" + bilgisayarHamlesi);

            sonucuDegerlendir(oyuncuHamlesi, bilgisayarHamlesi);
        }

        if (oyuncuSkor > bilgisayarSkor) {
            System.out.println("Oyunu " + oyuncuSkor + " - " + bilgisayarSkor + " skorla oyuncu kazandı");
        } else {
            System.out.println("Oyunu " + oyuncuSkor + " - " + bilgisayarSkor + " skorla bilgisayar kazandı");
        }
    }

    private int oyuncuHamlesiAl() {
        System.out.println("\nSıradaki Hamlenizi Yapınız");
        System.out.println("0- Taş | 1- Kağıt | 2- Makas");
        System.out.print("Oyuncu Hamlesi : ");
        return scanner.nextInt();
    }

    private int bilgisayarHamlesiYap() {
        return random.nextInt(3);
    }

    private void sonucuDegerlendir(int oyuncuHamlesi, int bilgisayarHamlesi) {
        if (oyuncuHamlesi == bilgisayarHamlesi) {
            System.out.println("Bu tur berabere");
        } else if ((oyuncuHamlesi == 0 && bilgisayarHamlesi == 2) ||
                (oyuncuHamlesi == 1 && bilgisayarHamlesi == 0) ||
                (oyuncuHamlesi == 2 && bilgisayarHamlesi == 1)) {
            System.out.println("Bu turu oyuncu kazandı");
            oyuncuSkor++;
        } else {
            System.out.println("Bu turu bilgisayar kazandı");
            bilgisayarSkor++;
        }
    }

        }



