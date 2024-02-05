package Projects;

import java.util.Objects;
import java.util.Scanner;

public class Work4 {

    public static void main(String[] args) {

        //  Java ile kullanıcın seçtiği işlemleri yapan hesap makinesi yapıyoruz. (Metotlar kullanılacak)
        //Hesap makinesinin fonksiyonları :
        //1- Toplama İşlemi
        //2- Çıkarma İşlemi
        //3- Çarpma İşlemi
        //4- Bölme işlemi
        //5- Üslü Sayı Hesaplama
        //6- Faktoriyel Hesaplama
        //7- Mod Alma
        //8- Dikdörtgen Alan ve Çevre Hesabı

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Hesap Makinesi");
            System.out.println("1- Toplama İşlemi");
            System.out.println("2- Çıkarma İşlemi");
            System.out.println("3- Çarpma İşlemi");
            System.out.println("4- Bölme İşlemi");
            System.out.println("5- Üslü Sayı Hesaplama");
            System.out.println("6- Faktoriyel Hesaplama");
            System.out.println("7- Mod Alma");
            System.out.println("8- Dikdörtgen Alan ve Çevre Hesabı");
            System.out.println("0- Çıkış");
            System.out.print("Lütfen bir işlem seçin: ");

            int secim = scanner.nextInt();

            if (secim == 0) {
                System.out.println("Çıkış yapılıyor...");
                break;
            }

            double sonuc;

            switch (secim) {
                case 1:
                    sonuc = toplamaIslemi();
                    break;
                case 2:
                    sonuc = cikarmaIslemi();
                    break;
                case 3:
                    sonuc = carpmaIslemi();
                    break;
                case 4:
                    sonuc = bolmeIslemi();
                    break;
                case 5:
                    sonuc = usluSayiHesaplama();
                    break;
                case 6:
                    sonuc = faktoriyelHesaplama();
                    break;
                case 7:
                    sonuc = modAlma();
                    break;
                case 8:
                    dikdortgenHesapla();
                    sonuc = 0;
                    break;
                default:
                    System.out.println("Geçersiz bir seçim yaptınız. Lütfen tekrar deneyin.");
                    continue;
            }

            if (secim == 8) {

            } else {
                System.out.println("Sonuc : " + sonuc);
            }
        }


    }

    private static double toplamaIslemi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Toplama için ilk sayıyı girin: ");
        double sayi1 = scanner.nextDouble();
        System.out.print("Toplama için ikinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();
        return sayi1 + sayi2;
    }

    private static double cikarmaIslemi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Çıkarma için ilk sayıyı girin: ");
        double sayi1 = scanner.nextDouble();
        System.out.print("Çıkarma için ikinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();
        return sayi1 - sayi2;
    }

    private static double carpmaIslemi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Çarpma için ilk sayıyı girin: ");
        double sayi1 = scanner.nextDouble();
        System.out.print("Çarpma için ikinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();
        return sayi1 * sayi2;
    }

    private static double bolmeIslemi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bölme için ilk sayıyı girin: ");
        double sayi1 = scanner.nextDouble();
        System.out.print("Bölme için ikinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();

        if (sayi2 != 0) {
            return sayi1 / sayi2;
        } else {
            System.out.println("Hata: İkinci sayı 0 olamaz.");
            return Double.NaN; // NaN (Not a Number) döndürerek hatayı belirtiyoruz.
        }
    }

    private static double usluSayiHesaplama() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban sayıyı girin: ");
        double taban = scanner.nextDouble();
        System.out.print("Üs sayıyı girin: ");
        double us = scanner.nextDouble();
        return Math.pow(taban, us); // Math.pow Uslu sayilarda kullanilir
    }

    private static double faktoriyelHesaplama(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Faktoriyeli hesaplanacak sayıyı girin: ");
        int sayi = scanner.nextInt();
        int faktoriyel = 1;
        sayi = Math.abs(sayi);
        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
        }
        return faktoriyel;
    }

    private static double modAlma() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mod alınacak sayıyı girin: ");
        int sayi1 = scanner.nextInt();
        System.out.print("Mod alacak sayıyı girin: ");
        int sayi2 = scanner.nextInt();
        return sayi1 % sayi2;
    }

    private static void dikdortgenHesapla() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dikdörtgenin uzun kenarını girin: ");
        double uzunKenar = scanner.nextDouble();
        System.out.print("Dikdörtgenin kısa kenarını girin: ");
        double kisaKenar = scanner.nextDouble();
        double alan = uzunKenar * kisaKenar;
        double cevre = 2 * (uzunKenar + kisaKenar);
        System.out.println("Dikdörtgenin Alanı: " + alan);
        System.out.println("Dikdörtgenin Çevresi: " + cevre);
    }
}
