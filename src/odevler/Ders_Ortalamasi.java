package odevler;

import java.util.Scanner;

public class Ders_Ortalamasi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dersSayisi, sinavSayisi, not;

        double ortalama = 0;

        double dersOrtalamasi = 0;

        System.out.println("Ders Sayisi :");

        dersSayisi = scanner.nextInt();

        System.out.println("Sinav Sayisi");

        sinavSayisi = scanner.nextInt();

        for (int i = 1; i <= dersSayisi; i++) {

            for (int y = 1; y <= sinavSayisi; y++) {

                System.out.println("Not : ");

                not = scanner.nextInt();

                dersOrtalamasi = (dersOrtalamasi + not);

            }

            dersOrtalamasi = dersOrtalamasi / sinavSayisi;

            System.out.println("dersOrtalamasi : " + dersOrtalamasi);

            ortalama = dersOrtalamasi + ortalama;

            dersOrtalamasi = 0;
        }
        ortalama = ortalama / dersSayisi;

        System.out.println("Genel Ortalama " + ortalama);
    }
}
