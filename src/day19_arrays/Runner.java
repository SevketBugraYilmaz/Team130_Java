package day19_arrays;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {

        int[] sayilar = {3, -5, 4, 6, -2, 9, 1};
        String[] isimler = {"ali", "veli", "saido", "sahil", "saido", "ali", "saido", "mehmet"};

        // sayilar arryindeki tum sayilari 3 artırıp kaydedin

        sayilar = C02_ArrayinElemanlariniArttirma.elemanlariArtir(sayilar, 3);

        System.out.println(Arrays.toString(sayilar)); // [6, -2, 7, 9, 1, 12, 4]

        // sayilar arrayinin yani halinde pozitif elementlerinin toplamını yazdirin

        System.out.println("pozitif elementlerin toplami " + C03_pozitifSayilariToplama.pozitifElementleriTopla(sayilar));
        // pozitif elementlerin toplami 39

        //isimler arryinde mehmet ismi kac kere kullanımıs yazdirin
        C04_KullanimAdediniBulma.elemanArama(isimler, "mehmet");

        C04_KullanimAdediniBulma.elemanArama(isimler, "ali");

    }
}


