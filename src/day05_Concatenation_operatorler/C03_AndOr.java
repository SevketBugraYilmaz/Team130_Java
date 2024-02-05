package day05_Concatenation_operatorler;

import java.util.Scanner;

public class C03_AndOr {
    public static void main(String[] args) {

        // Kullanicidan not isteyin
        // girilen not 0 ile 100 arasinda  ise true , yoksa false yazdiralim
        // 0 ve 100 dahil

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen Notunuzu Gırınız");

        int not = scanner.nextInt();

        System.out.println(not >=0 && not <= 100);

        // not 50 ile 80 (dahil) arasında değilse true
        // arasinda ise false yazdirin

        // Eğer istenilen  durum bir aralık ise And operatörü kullanılır

        // Eğer istenen durum bir aralığın dışında kalan  bölge ise
        // ya Or kullanılır

        // not 50'den kucukse veya 80'den büyükse true
        // arasinda ise false yazdirin

        System.out.println(not < 50 || not > 80); // istenen durum

        // önce istenmeyen durumu yazalım
        // sonra  başına ! koyalım

        System.out.println(  ! (not >= 50 && not <= 80)   ); // ! istenmeyen durum
        

    }
}
