package day04;

import java.util.Scanner;

public class P02_ForLoop_EBOB_EKOK{

        public static void main(String[] args) {

            int sayi1 = 12;
            int sayi2 = 18;

            int buyukSayi;
            int kucukSayi;

            if (sayi1 > sayi2) {
                buyukSayi = sayi1;
                kucukSayi = sayi2;
            } else {
                buyukSayi = sayi2;
                kucukSayi = sayi1;
            }
            ;

            int ebob = 0;

            for (int i = kucukSayi; i > 0; i--) {

                if (kucukSayi % i == 0 && buyukSayi % i == 0) {
                    ebob = i;
                    break;
                }
            }

            int ekok = 0;

            for (int i = buyukSayi; i <= buyukSayi * kucukSayi; i += buyukSayi) {

                if (i % kucukSayi == 0 && i % buyukSayi == 0) {
                    ekok = i;
                    break;
                }
            }

            System.out.println("Girilen sayilarin EBOB degeri = " + ebob);
            System.out.println("Girilen sayilarin EKOK degeri = " + ekok);

        }

        }





