package day02_Practice;

import java.util.Scanner;

public class P04_Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Adınızı Giriniz");
        String name = scanner.next();  // scan.next() Tüm satırı alır | scan.next() metnin ilk boşluğuna kadar alır
        System.out.println("-----------------------");
        System.out.println("Lütfen soyadınızı Giriniz : ");

        String surname = scanner.next();

        System.out.println(name + " " + surname);

        Scanner sevket = new Scanner(System.in);

        System.out.println("Adınız : ");
        String name1 = sevket.nextLine();

        System.out.println("Soyadınız : ");
        String surname2 = sevket.nextLine();

        System.out.println("Şifreniz");
        String pass = sevket.nextLine();

        System.out.println("---- Sistem Kaydı Tamamlandı -----\n Bilgileriniz sistemlerimize;\n Adı : " + name1
                + "\nSoyadı : " + surname2 + "\nŞifre : " + pass + " \nOlarak Kaydedilmiştir.");


        /*Öğrenciden Vize ve Final Notlarını 1.Vize Notu, 2. Vize Notu ve Final Notu olarak alan
        Yıl sonu Başarı puanını vize ortalamasının %40, Final Notunun %60 etkisi olacak şekilde hesaplayıp
    Tüm Notlarını ve Yıl Sonu Başarı Notunu yyazdıran bir kod yazınız

         */
        System.out.println("1. Vize Notunuz :");
        double vize1 = scanner.nextDouble();
        System.out.println("2. Vize Notunuz : ");
        double vize2 = scanner.nextDouble();
        System.out.println("Final Notunuz : ");
        double finalNotu = scanner.nextDouble();

        System.out.println("------ Yıl Sonu Başarı Notu Hesaplaması ------- ");

        System.out.println("1.Vize Notu : " + vize1);
        System.out.println("2.Vize Notu : " + vize2);
        System.out.println("Final Notu : " + finalNotu);

        System.out.println("1.Vize Notu: "+vize1+"\n2. Vize Notu: " + vize2+"\nFinal Notu: "+finalNotu);
        System.out.println("Yıl Sonu Başarı Notu: "+(((vize2+vize1)/2)*0.4+finalNotu*0.6));




    }
}
