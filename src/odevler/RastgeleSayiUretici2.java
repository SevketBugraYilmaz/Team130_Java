package odevler;

import java.util.Random;
import java.util.Scanner;

public class RastgeleSayiUretici2 {

    // Constructor ile Rastgele Sayı Üretici: Kullanıcının girdiği bir
    // aralıkta rastgele bir sayı üreten bir program yazın.
    // Program, kullanıcının girdiği aralıkta rastgele bir sayı üretmeli ve sonucu ekrana yazdırmalıdır.

    private int aralikBaslangic;
    private int aralikBitis;

    public RastgeleSayiUretici2(int baslangic, int bitis) {
        this.aralikBaslangic = baslangic;
        this.aralikBitis = bitis;
    }

    public int rastgeleSayiUret() {
        Random random = new Random();
        return random.nextInt((aralikBitis - aralikBaslangic) + 1) + aralikBaslangic;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Lutfen belirlediginiz araligin baslangic degerini giriniz ");
        int baslangic = scanner.nextInt();

        System.out.print("Lutfen belirlediginiz araligin bitis degerini giriniz ");
        int bitis = scanner.nextInt();

        RastgeleSayiUretici2 uretici = new RastgeleSayiUretici2(baslangic, bitis);

        int rastgeleSayi = uretici.rastgeleSayiUret();

        System.out.println("Uretilen rastgele sayi : " + rastgeleSayi);


    }
}
