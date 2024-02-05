package day07_IfElseStatement;

import java.util.Scanner;

public class C05_BirimCevirme {

    public static void main(String[] args) {
        //Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi sorun
        // istedigi birim metre veya santimetre ise cevirip yazdirin
        //yoksa “istediginiz birim sisteme kayitli degil” yazdirin.

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen Mesafeyi (KM) olarak giriniz");
        double mesafeKm = scanner.nextDouble();

        System.out.println("Lütfen Cevirmek istediginiz birimi giriniz");
        String birim  = scanner.next();

        if (birim.equalsIgnoreCase("metre") ){
            System.out.println("Girilen mesafenin metre cinsinden degeri :" + mesafeKm * 1000);
        }  else if (birim.equalsIgnoreCase("santimetre")) {
            System.out.println("Girilen mesafenin santimetre cinsinden degeri : " + mesafeKm * 10000 );
        } else {
            System.out.println("Sadece metre ve santimetreye cevirebilirim , \nistediginiz birim sisteme kayitli degil");
        }
    }
}
