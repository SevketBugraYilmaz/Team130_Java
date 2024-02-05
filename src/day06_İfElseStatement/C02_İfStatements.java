package day06_İfElseStatement;

import java.util.Scanner;

public class C02_İfStatements {

    public static void main(String[] args) {

        // kullanicidan 2 sayi alin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 2 sayi giriniz");

        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();

        // ilk sayi 2. den büyükse  "büyüksün sayi1" yazdirin

        boolean sonuc = sayi1 > sayi2;

        if (sonuc) {
            System.out.println("Büyüksün sayı1");

        }

        // 2. sayi 0'dan büyükse "büyüksün sayi2" yazdiralim

        sonuc = sayi2 > 0;
        if (sonuc) {
            System.out.println("Büyüksün sayı2");
        }

        // iki sayinin toplami 100'den büyükse "ikinizde büyüksünüz yazdirin

        sonuc = sayi1 + sayi2 > 100;
        if (sonuc) {
            System.out.println("İkinizde Büyüksünüz");
        }


    }
}
