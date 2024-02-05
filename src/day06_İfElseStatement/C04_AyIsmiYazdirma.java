package day06_İfElseStatement;

import java.util.Scanner;

public class C04_AyIsmiYazdirma {

    public static void main(String[] args) {

        //Soru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        //NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        // Kullanici o veya O yazdiginda output Ocak olsun.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir harf giriniz ");

        char harf = scanner.next().charAt(0);

        if (harf == 'o' || harf == 'O') {
            System.out.println("Ocak");
        }

        if (harf == 's' || harf == 'S') {
            System.out.println("Subat");

        }

        if (harf == 'm' || harf == 'M') {
            System.out.println("Mart");
        }

        if (harf == 'n' || harf == 'N') {
            System.out.println("Nisan");
        }

        if (harf == 't' || harf == 'T') {
            System.out.println("Temmuz");
        }

        if (harf == 'a' || harf == 'A') {
            System.out.println("Ağustos veya Aralık ");
        }
        if (harf == 'e' || harf == 'E') {
            System.out.println("Eylül veya Ekim ");
        }

        if (harf == 'k' || harf == 'K') {
            System.out.println("Kasım");
        }

    }
}
