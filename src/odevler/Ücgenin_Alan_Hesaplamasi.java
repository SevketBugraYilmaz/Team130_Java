package odevler;

import java.util.Scanner;

public class Ücgenin_Alan_Hesaplamasi {
    public static void main(String[] args) {

        //Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
        //Formül
        //Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        //𝑢 = (a+b+c) / 2
        //Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen Üçgenin Kenarlarının Uzunluklarını Giriniz");

        System.out.println("Birinci Kenarın Uzunluğu");
        int sayi1 = scanner.nextInt();

        System.out.println("İkinci Kenarın Uzunluğu");
        int sayi2 = scanner.nextInt();

        System.out.println("Üçüncü Kenarın Uzunluğu");
        int sayi3  = scanner.nextInt();

        int u = (sayi1 + sayi2 + sayi3)/2;

        System.out.println("Üçgenin Çevresi : " + 2 * u );

        // Üçgenin Alanını Bulunuz

        System.out.println("Üçgenin tabanı : ");
        int a = scanner.nextInt();

        System.out.println("Üçgenin Yükseliği : ");
        int h = scanner.nextInt();

        int A = ( a * h )/2;

        System.out.println("Üçgenin Alanı : " + A );


    }
}
