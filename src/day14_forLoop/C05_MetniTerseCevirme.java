package day14_forLoop;

import java.util.Scanner;

public class C05_MetniTerseCevirme {
    public static void main(String[] args) {

        // Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir mesaj giriniz");
        String metin  = scanner.nextLine(); // Java Candir

        String tersMetin="";

        for (int i = metin.length()-1; i >=0 ; i--) {

            tersMetin += metin.charAt(i);
            
        }

        System.out.println(tersMetin);

        //  kullanicinin girdigi metin polindrome olup olmadigini yazdirin

        if (metin.equalsIgnoreCase(tersMetin)){
            System.out.println("Girilen metin polidrome");
        }else{
            System.out.println("Girilen metin polidrome degil");
        }
    }
}
