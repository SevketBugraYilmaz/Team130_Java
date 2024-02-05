package day06_İfElseStatement;

import java.util.Scanner;

public class C01_İfStatements {

    public static void main(String[] args) {

        /*
        Bağımsız if cümleleri
        kodun geriye kalanı ile ilgilenmez
        Sadece if parantezindeki boolean şarta odaklanır
        boolean şart ==> true ise if body'si çalışır
        boolean şart ==> false ise if body'si çalışmaz

        birden fazla bağımsız if cümlesi kullanıldığında
        girilen değere bağlı olarak
        tüm if body'leri devreye girebileceği gibi
        hiçbir if body'si devreye girmeyebilir de

         */

        // kullanicidan 2 deger alin

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Lutfen 2 tamsayi giriniz");

        int sayi1 = scanner.nextInt();

        int sayi2 = scanner.nextInt();

        // 1.sayi , 2.sayidan buyukse aferin yazdirin

        if (sayi1 > sayi2) {

            System.out.println("Aferin");
        }

        // 1. sayi cift ise cift sayilari severim yazdirin

        if (sayi1 % 2 == 0) {
            System.out.println("Çift sayilari severim");
        }

        // 2. sayi 50'den buyukse buyuk sayilarla isim olmaz yazdirin

        if (sayi2 > 50) {
            System.out.println("Buyuk sayilarla isim olmaz");
        }

        // toplamlari 100'den kücükse ufak sayilarla isim olmaz yazdirin

        if (sayi1 + sayi2 < 100) {
            System.out.println("Ufak sayilarla isim olmaz ");
        }


    }
}
