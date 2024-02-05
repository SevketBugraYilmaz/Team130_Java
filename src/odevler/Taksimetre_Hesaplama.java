package odevler;

import java.util.Scanner;

public class Taksimetre_Hesaplama {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Gidilen Mesafeyi KiloMetre Olarak Giriniz");

        double mesafe = scanner.nextDouble();

        double acilisUcret = 10.0;

         double KmBasinaUcret = 2.20;

        double taksimetreTutar = acilisUcret + ( mesafe * KmBasinaUcret);

        if (taksimetreTutar < 20.0) {
            taksimetreTutar = 20.0;
        }

             System.out.println("Taksimetre Tutarı : " + taksimetreTutar + "TL");


    }
}
