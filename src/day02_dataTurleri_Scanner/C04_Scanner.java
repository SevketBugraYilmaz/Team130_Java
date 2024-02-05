package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {


        // kullanicidan ismini alip
        // buyuk harf olarak yazdirin


        // 1.adim : scanner objesi olusturmak

        Scanner scanner = new Scanner(System.in);

         //2.adim : kullanıcıdan istediginiz bilgiyi ,
        // kullaniciya bilgi olarak konsolda yazdirin

        System.out.println("Lütfen isminizi giriniz");

        //3.adim :istediğiniz bilgiye uygun bir variable oluşturun
        // scanner objesi ve uygun next () ile bilgiyi kullanicidan alip
        // olusturdugunuz variable'a atın

        String girilenIsim = scanner.nextLine();
        //next() sadece 1 kelime alabilir, nextline bütün girilen satırı alır


        System.out.println(girilenIsim.toUpperCase());


    }

}
