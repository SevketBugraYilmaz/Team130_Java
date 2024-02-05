package day15_MethodOlusturma;

import java.util.Scanner;

public class C04_PozitifTamBolenleriYazdir {
    public static void main(String[] args) {

        // Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif
        // tam bolenleri sayisini bulup bize donduren bir method olusturun.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir pozitif tamsayi giriniz");
        int sayi = scanner.nextInt();

        pozitifBolenleriYazdir(sayi);

        pozitifBolenleriYazdir(640);

        // pozitifBolenleriYazdir("Sanane");
        // pozitifBolenleriYazdir(true);
        pozitifBolenleriYazdir('z');
        /*
        Method call'de kullanılan argument ile
        Method parametreleri uyumlu OLMALIDIR

         eger argument ve parametreler uyumlu olmazsa CTE olusur
         kod calismaz
         */


    }


    public static void pozitifBolenleriYazdir(int sayi){

        for (int i = 1; i <= sayi; i++) {

            if (sayi % i == 0 ){
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }
}
