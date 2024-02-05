package day09_SwitchStatement;

import java.util.Scanner;

public class C04_ikiBasamakliSayiYazdirma {
    public static void main(String[] args) {

         // Kullanicidan 2 basamakli bir sayi alip,
        // girilen sayiyi yazi ile yazdirin

        // 34 ==> 3 otuz , 4 dart

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen iki basamaklı bir sayi giriniz");

        int girilenSayi = scanner.nextInt();

        int birlerBasamagi = girilenSayi % 10 ;

        int onlarBasamagi = girilenSayi / 10 ;

        switch (onlarBasamagi){
            case 1 :
                System.out.print("on");
                break;

            case 2 :
                System.out.print("yirmi");
                break;

            case 3 :
                System.out.print("otuz");
                break;

            case 4 :
                System.out.print("kırk");
                break;

            case 5 :
                System.out.print("elli");
                break;

            case 6 :
                System.out.print("altmış");
                break;

            case 7 :
                System.out.print("yetmiş");
                break;

            case 8 :
                System.out.print("seksen");
                break;

            case 9 :
                System.out.print("doksan");
                break;

        }
        switch (birlerBasamagi) {
            case 0 :
                break;

            case 1:
                System.out.print("bir");
                break;

            case 2:
                System.out.print("iki");
                break;

            case 3:
                System.out.print("üç");
                break;

            case 4:
                System.out.print("dört");
                break;

            case 5:
                System.out.print("beş");
                break;

            case 6:
                System.out.print("altı");
                break;

            case 7:
                System.out.print("yedi");
                break;

            case 8:
                System.out.print("sekiz");
                break;

            case 9:
                System.out.print("dokuz");
                break;
        }


    }
}
