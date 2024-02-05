package day08_NestedIfElse_Statement;

import java.util.Scanner;

public class C04_NestedIfElse_Statement {
    public static void main(String[] args) {
        //Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scanner=new Scanner(System.in);

        System.out.print("Lütfen cinsiyetinizi giriniz E: Erkek, K: Kadın ");

        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.print("Lütfen yaşınızı giriniz: ");

        int yas = scanner.nextInt();

        // Ana degisken cinsiyet olsun

        if (cinsiyet == 'E'){
            // erkekler
            if (yas>80 || yas  < 15){
                System.out.println("Bu yaslar icin emeklilik sorgumuz calismiyor ");
            } else if (yas>=65) {
                System.out.println("Erkek Emekli Olabilir");
                
            }else{
                System.out.println("Erkek emekli olmak için " + (65-yas) + " sene daha çalışmalıdır");
            }

        } else if (cinsiyet == 'K') {
            // Kadinlar
            if (cinsiyet == 'E'){
                // erkekler
                if (yas>75 || yas  < 15){
                    System.out.println("Bu yaslar icin emeklilik sorgumuz calismiyor ");
                } else if (yas>=60) {
                    System.out.println("Kadın Emekli Olabilir");

                }else{
                    System.out.println("Kadın emekli olmak için " + (60-yas) + " sene daha çalışmalıdır");
                }


                }

        } else{
            System.out.println("Cinsiyet için E  veya K seçmelisiniz");


        }
    }
}

