package day07_IfElseStatement;

import java.util.Scanner;

public class C03_NotYazdirma {

    public static void main(String[] args) {
        // Kullanicidan 100 uzerinden notunu alin
        // negatif veya 100'den büyük değer girerse "Gecersiz Not",
        // 85 ile 100 arasinda ise (sinirlar dahil) AA
        // 65 (dahil) buyuk ve 85'den kucukse BB
        // 50(dahil) buyuk ve 65'den kucukse CC
        // 50'den kucukse DD Kaldin yazdirin

        /*
        if
        else if
        else if
        ......
        else

        seklinde yazilan  bir kod icin

        - sonu else ile bittiğinden
        bir sonuc yazdirmama ihtimali YOKTUR
        - else if .. ile bütün if'ler birbirine bağlandığından
            aynı anda iki if body'sinin devreye girme ihtimali de YOKTUR
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Notunuzu Giriniz");

        double girilenNot = scanner.nextDouble();

        if (girilenNot < 0 || girilenNot > 100) {
            System.out.println("Gecersiz Not");
        } else if (girilenNot >= 85) {
            System.out.println("AA");

        } else if (girilenNot >= 65){
            System.out.println("BB");
        } else if (girilenNot >= 50){
            System.out.println("CC");
        } else{
            System.out.println( " DD Kaldin");
        }
    }
}
