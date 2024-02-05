package Projects;

import java.util.Scanner;

public class Work1 {

    public static void main(String[] args) {

        //Kullanıcıdan iki sayı alıp üçüncü bir değişken kullanmadan ikisinin değerlerini değiştirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen ilk sayiyiyi giriniz");

        int ilkSayi = scanner.nextInt(); //  ilk = 5 ise

        System.out.println("Lütfen ikinci sayiyi giriniz");

        int ikinciSayi = scanner.nextInt();// ikinciSayi = 3 ise

        ilkSayi = ilkSayi + ikinciSayi;
        ikinciSayi = ilkSayi - ikinciSayi;
        ilkSayi = ilkSayi - ikinciSayi;

        System.out.println("İlk Girilen Sayinin Degeri"+ ilkSayi);

        System.out.println("İkinci Girilen Sayinin Degeri" + ikinciSayi);

        




    }
}
