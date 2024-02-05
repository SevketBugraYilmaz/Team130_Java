package day03_scanner_dataCasting;

import java.util.Scanner;

public class C08_DataCasting {
    public static void main(String[] args) {

        int sayi1 = 20;
        int sayi2 = 3;

        System.out.println(sayi1/sayi2); // 6.66666.... ==> 6

        double sayi3 = 3;
        System.out.println(sayi1/sayi3);

        //kullanicidan 2 tamsayi alip
        // 1. sayiyi 2.sayiya bolun
        // sonucu ondalikli olarak yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 tamsayi giriniz");

        sayi1 = scanner.nextInt();
        sayi2 = scanner.nextInt();

        System.out.println("Verilen sayilarin bölümü" + (double) sayi1/sayi2); //5.714285714285714
    }
}
