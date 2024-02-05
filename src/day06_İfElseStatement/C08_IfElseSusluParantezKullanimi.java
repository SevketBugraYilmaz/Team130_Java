package day06_İfElseStatement;

import java.util.Scanner;

public class C08_IfElseSusluParantezKullanimi
{
    public static void main(String[] args)
    {
        // Kullanıcıdan 2 tamsayı alın
        // eğer sayı1, sayı2'den büyükse sayı1' i 1 azaltıp, sayı2 'yi 1 artırın
        // sayı1 sayı2'den büyük değilse sayı1'i 3 ile çarpın , sayı2'yi 2 ile çarpın
        // sayı1 ve sayı2'nin son değerlerini yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 2 tamsayı giriniz ");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        /*
        Eğer if  ve else'den sonra {} kullanmazsak
        java if body ve else body olarak ilk ;' e kadar olan kısmı alır.

        Eğer if ve else body'leri TEK BIR SATIR'dan oluşuyorsa {} kullanmasak da olur
        AMA if body'sinde veya else body'sinde bir satırdan fazla kod varsa
        MUTLAKA {} kullanmalıyız
         */


        if (sayi1 > sayi2){

            sayi1--;
            sayi2++;
        }  else{
            sayi1 *= 3;
            sayi2 *= 2;
        }

        System.out.println(" Sayı1 : " + sayi1 + ", Sayı2 : " + sayi2);
    }
}
