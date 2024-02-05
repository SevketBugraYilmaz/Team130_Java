package day06_İfElseStatement;

import java.util.Scanner;

public class C05_AyIsmiYazdirma2
{
    public static void main(String[] args)
    {
        //Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        // Eğer girilen harf ile başlayan ay yoksa
        // "girdiğiniz harf ile başlayan ay yok" yazdırın
        // NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        // Kullanici o veya O yazdiginda output Ocak olsun.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir harf giriniz ");

        char harf = scanner.next().charAt(0);

        int flag = 44;

        if (harf == 'o' || harf == 'O') {
            System.out.println("Ocak");
            flag++;
        }

        if (harf == 's' || harf == 'S') {
            System.out.println("Subat");
            flag++;
        }

        if (harf == 'm' || harf == 'M') {
            System.out.println("Mart");
            flag++;
        }

        if (harf == 'n' || harf == 'N') {
            System.out.println("Nisan");
            flag++;
        }

        if (harf == 't' || harf == 'T') {
            System.out.println("Temmuz");
            flag++;
        }

        if (harf == 'a' || harf == 'A') {
            System.out.println("Ağustos veya Aralık ");
            flag++;
        }
        if (harf == 'e' || harf == 'E') {
            System.out.println("Eylül veya Ekim ");
            flag++;
        }

        if (harf == 'k' || harf == 'K') {
            System.out.println("Kasım");
            flag++;
        }

        if (flag == 44 ) {
            System.out.println("girdiğiniz harf ile bir ay bulunmamaktadır ");
        }

    }
}
