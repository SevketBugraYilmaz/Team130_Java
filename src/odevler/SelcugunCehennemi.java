package odevler;

import java.util.Arrays;
import java.util.Scanner;

public class SelcugunCehennemi {

        private static String kullaniciAdi;
        private static String sifre;
        private static String email;
        private static String adres;
        private static String telefon;
        private static String meslek;

    static  Scanner scanner = new Scanner(System.in);
         private static String kullaniciResmi;

    private static int hataliGirisSayisi = 0;

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Selçuğun Cehennemine HOŞGELDİNİZ HİHİHA!!! Sıra kayıt olmada :)");
            kullaniciKayit();

            while (true) {
                System.out.println("\nYapmak istediğiniz işlemi seçiniz:");
                System.out.println("1. Kullanıcı adı (mail) ve şifre değiştirme");
                System.out.println("2. Adres bilgilerini güncelleme");
                System.out.println("3. Meslek bilgilerini güncelleme");
                System.out.println("4. İletişim bilgilerini güncelleme");
                System.out.println("5. Hatalı giriş sayısını yazdırma");
                System.out.println("6. Yaş hesaplama");
                System.out.println("7. 5 sayı girip sıralama");
                System.out.println("10. Resim ekleme veya güncelleme");
                System.out.println("8. Çıkış yap");


                int secim = scanner.nextInt();

                switch (secim) {
                    case 1:
                        kullaniciAdiSifreDegistirme();
                        break;
                    case 2:
                        adresGuncelleme();
                        break;
                    case 3:
                        meslekGuncelleme();
                        break;
                    case 4:
                        iletisimBilgisiGuncelle();
                        break;
                    case 5:
                        hataliGirisSayisiniYazdir();
                        break;
                    case 6:
                        yasHesapla();
                        break;
                    case 7:
                        sayiGirVeSirala(scanner);
                        break;
                    case 10:
                        resimEklemeVeyaDegistir(scanner);
                        break;
                    case 8:
                        System.out.println(" Cehennemden Çıkış yapılıyor HİHİHA tekrar geliniz ...");
                        System.exit(0);
                    default:
                        System.out.println("Geçersiz bir seçim yaptınız. Tekrar deneyin.");
                }
            }
        }

        private static void kullaniciKayit() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Kullanıcı adı (mail): ");
            while (true) {
                email = scanner.nextLine();
                if (email.contains("@") && email.endsWith("@gmail.com")) {
                    break;
                } else {
                    System.out.println("Geçersiz email adresi. Tekrar giriniz.");
                }
            }

            System.out.print("Şifre: ");
            sifre = scanner.nextLine();

            System.out.print("Adres: ");
            adres = scanner.nextLine();

            System.out.print("Telefon: ");
            telefon = scanner.nextLine();

            System.out.print("Meslek: ");
            meslek = scanner.nextLine();
        }

        private static void kullaniciAdiSifreDegistirme() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Yeni kullanıcı adı (mail): ");
            while (true) {
                email = scanner.nextLine();
                if (email.contains("@") && email.endsWith("@gmail.com")) {
                    break;
                } else {
                    System.out.println("Geçersiz  zebani  adresi. Tekrar giriniz.");
                }
            }

            System.out.print("Yeni şifre: ");
            sifre = scanner.nextLine();

            System.out.println("Kullanıcı adı (mail) ve şifre başarıyla değiştirildi.");
        }

        private static void adresGuncelleme() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Yeni adres: ");
            adres = scanner.nextLine();

            System.out.println("Adres başarıyla güncellendi.");
        }

        private static void meslekGuncelleme() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Yeni meslek: ");
            meslek = scanner.nextLine();

            System.out.println("Meslek başarıyla güncellendi.");
        }

        private static void iletisimBilgisiGuncelle() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Yeni telefon: ");
            telefon = scanner.nextLine();

            System.out.println("İletişim bilgisi başarıyla güncellendi.");
        }

        private static void hataliGirisSayisiniYazdir() {
            System.out.println("Hatalı giriş sayısı: " + hataliGirisSayisi);
        }

        private static void yasHesapla() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Cehenneme girdiginiz yılı giriniz: ");
            int dogumYili = scanner.nextInt();

            int yas = 2023 - dogumYili;
            System.out.println("Şu ana kadar " + yas + " yıl yaşadınız.");
        }

        private static void sayiGirVeSirala(Scanner scanner) {
            System.out.println("5 sayı giriniz:");

            int[] sayilar = new int[5];
            for (int i = 0; i < 5; i++) {
                sayilar[i] = scanner.nextInt();
            }


            System.out.println("Sıralama :");
            Arrays.sort(sayilar);
            for (int sayi : sayilar) {
                System.out.print(sayi + " ");
            }


            System.out.println("\nSıralama :");
            int index = 0; // Array'in içindeki değerleri saymaya 0 dan başlar 0,1,2,3,4 => 5 tane olduğunu belirtir
            Arrays.sort(sayilar); // elemanları sıralamak için kullanilir
            while (index < 5) {
                System.out.print(sayilar[index] + " ");
                index++;
            }
        }

        private static void resimEklemeVeyaDegistir(Scanner scanner) {

            System.out.print("Lütfen resmin dosya yolunu giriniz (örn: MahmutTuncer.jpg, Cenderma.png): ");

            String yeniResimYolu = SelcugunCehennemi.scanner.nextLine();

            if (kullaniciResmi != null && kullaniciResmi.isEmpty()) {
                System.out.println("Kullanıcının mevcut bir resmi bulunmamaktadır." + kullaniciResmi);
                System.out.println("Kullanıcının resmi değiştiriliyor...");



            }else{
                System.out.println("Kullanıcının resmi başarıyla eklenmiştir");
            }


        }

}
