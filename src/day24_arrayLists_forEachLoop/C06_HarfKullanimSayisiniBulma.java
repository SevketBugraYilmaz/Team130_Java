package day24_arrayLists_forEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class C06_HarfKullanimSayisiniBulma {

    public static void main(String[] args) {

        //Kullanicidan bir cumle ve bir harf alin,
        // harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        // kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle girin");
        String cumle = scanner.nextLine();

        System.out.println("Aranacak harfi girin ");

        String harf = scanner.next().substring(0);


        /*
        cumledeki her harfe iki türlü ulaşabiliriz
        1- for loop ve substring ile
        2- split ile array'e cevirip , for each ile loop ile
         */


        String[] cumleHarfArrayi = cumle.split("");

        System.out.println(Arrays.toString(cumleHarfArrayi));  // [A, l, i,  , t, o, p, u,  , t, u, t,  ]

        int sayac = 0;

        for (String each : cumleHarfArrayi
        ) {

            if (each.equalsIgnoreCase(harf)) {
                sayac++;


            }
        }

        if (sayac == 0) {
            System.out.println("harf cumlede kullanilmamis");
        } else {
            System.out.println("Verilen harf cumlede " + sayac + " defa kullanilmis");
        }
    }
}
