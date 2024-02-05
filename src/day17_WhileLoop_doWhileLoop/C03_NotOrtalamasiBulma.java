package day17_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class C03_NotOrtalamasiBulma {

    public static void main(String[] args) {

        // Bir ogeretmenden not ortalamasi bulmak icin notlari alin
        // ogretmen islemi bitirmek icin negatif bir sayi girmelidir
        // Ogretmen negatif sayi girdiginde
        // toplam kac not girdigini,
        // not ortalamasinin kac oldugunu
        // ve en yuksek notu yazdirin


        Scanner scanner = new Scanner(System.in);

        double Not=0;
        double toplam =0;
        double enYuksek =0;

        int sayac=0;

        while(Not>=0){

            System.out.println("ortalama icin notlari giriniz ,\nislemi bitirmek icin negatif bir sayi giriniz");

            Not = scanner.nextDouble();

            if (Not>=0){

                toplam += Not;
                sayac++;

            // en yuksek not icin her girilen notu
            // o andaki en yuksek not ile karsilastiralim
            //  ve girilen not , en yuksek nottan buyukse,
            // onu en yuksek not alarak atayalim

            if (Not > enYuksek) enYuksek = Not;
        }
    }
        System.out.println("Not girilen ogrenci sayisi : " + sayac +
                            "\nGirilen notlarin ortalamasi " + toplam/sayac +
                            "\nGirilen en yuksek not : " + enYuksek);
    }
}
