package odevler;

import java.util.Scanner;

public class Methodlarla_AsalSayiKontrolu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen bir sayi giriniz");
        int sayi = scanner.nextInt();

        if (asal(sayi)) {
            System.out.println(sayi + " asal sayidir.");
        } else {
            System.out.println(sayi + " asal sayi degildir.");
        }

    }
    static boolean asal(int sayi) {
        if (sayi <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) {
                return false;
            }
        }

        return true;
    }
}
