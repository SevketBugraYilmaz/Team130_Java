package odevler;

import java.util.Random;
import java.util.Scanner;

public class RastgeleSayiUretici1 {

    //  Rastgele Sayı Üretici: Kullanıcının girdiği bir
    //  aralıkta rastgele bir sayı üreten bir program yazın.
    //  Program, kullanıcının girdiği aralıkta rastgele bir sayı üretmeli ve sonucu ekrana yazdırmalıdır.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen belirlediginiz araligin baslangic degerini giriniz");
        int araliginBaslangici = scanner.nextInt();

        System.out.println("Lutfen belirlediginiz araligin bitis degerini giriniz");
        int araliginBitisi = scanner.nextInt();

        int rastgeleSayi = rastgeleSayiUretici1(araliginBaslangici , araliginBitisi);

        System.out.println( "Uretilen rastgele sayi " + rastgeleSayi);
    }

    private static int rastgeleSayiUretici1(int min , int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1 ) + min;
    }


}
