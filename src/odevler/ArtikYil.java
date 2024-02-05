package odevler;

import java.util.Scanner;

public class ArtikYil {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir yıl giriniz: ");
        int yil = scanner.nextInt();

        if (isArtikYil(yil)) {
            System.out.println(yil + " bir artik yildir.");
        } else {
            System.out.println(yil + " bir artik yil degildir.");
        }
    }

    static boolean isArtikYil(int yil) {
        // 4'e bölünebilen yıllar artık yıldır
        if (yil % 4 == 0) {
            // 100'ün katı olan yıllar arasında sadece 400'e bölünebilenler artık yıldır
            if (yil % 100 == 0) {
                return yil % 400 == 0;
            }
            return true;
        }
        return false;
    }
}


