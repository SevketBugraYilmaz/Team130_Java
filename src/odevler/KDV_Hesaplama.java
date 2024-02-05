package odevler;

import java.util.Scanner;

public class KDV_Hesaplama {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double kdvOrani = 0.18;

        System.out.println("Para Miktarını Giriniz");

        double paraMiktari= scanner.nextDouble();

        double kdvliFiyat = paraMiktari + (paraMiktari * kdvOrani);

        double kdvTutari = paraMiktari * kdvOrani;

        System.out.println("KDV'siz Fiyat : " + paraMiktari);

        System.out.println("KDV'li Fiyat : " + kdvliFiyat);

        System.out.println("KDV Tutarı : " +  kdvTutari);

    }
}
