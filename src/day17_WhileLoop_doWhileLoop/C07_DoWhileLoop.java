package day17_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class C07_DoWhileLoop {

    public static void main(String[] args) {

        /*
            While loop'da parantez icinde kontrol edilen degiskene
            biz loop'dan once deger atiyoruz

            eger bu degiskene uygun olmayan bir deger atamasi yaparsak
            loop hic calismaz

            Java bu durumun onune  gecmek icin
            yani kontrolu kullanicidan deger aldiktan sonra
         */

        // Bir ogretmenden not ortalamasi bulmak icin notlari alin
        // ogretmen islemi bitirmek icin negatif bir sayi girmelidir
        // Ogretmen negatif sayi  girdiginde
        // toplam kac not girdigini,
        // not ortalamasini kac oldugunu yazdirin

        Scanner scanner = new Scanner(System.in);
        double not = 0;
        double toplam =0;
        int sayac =0;


        while (not>=0) {

            System.out.println("ortalama hesaplamak icin notlari giriniz\n bitirmek icin negatif sayi girmelisiniz");

            not = scanner.nextDouble();

            if (not >= 0) {
                toplam += not;
                sayac++;



                do {
                    System.out.println("ortalama hesaplamak icin notlari giriniz\n bitirmek icin negatif sayi girmelisiniz");

                    not = scanner.nextDouble();

                    if (not >= 0) {
                        toplam += not;
                        sayac++;

                    }
                } while (not >= 0);
            }
            System.out.println("toplam girilen not sayisi : " + sayac +
                    "\ngirilen notlarin ortalamasi : " + toplam / sayac);
        }
    }
}
