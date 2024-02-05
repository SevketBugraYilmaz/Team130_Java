package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C05_Scanner
{
    public static void main(String[] args)


    {
        //Soru 2- Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir Tam sayı giriniz");
        int girilenTamsayi = scanner.nextInt();

        System.out.println("Bir Ondalık sayı giriniz");
        double girilenOndalik = scanner.nextDouble();

        System.out.println("girilen sayıların toplamı : "+(girilenOndalik + girilenTamsayi));
        System.out.print("girilen sayıların çarpımı : "+(girilenOndalik * girilenTamsayi));

    }
}