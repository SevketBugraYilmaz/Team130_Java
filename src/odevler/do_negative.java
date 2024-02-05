package odevler;

import java.util.Scanner;

public class do_negative {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("Bir sayi giriniz: ");
                int sayi = scanner.nextInt(), sayi1 = sayi * -1;
                if (sayi < 0) {
                    System.out.println("===-> " + sayi);
                } else if (sayi > 0) {
                    System.out.println(sayi + " <=-=> " + sayi1 * -1);
                } else {
                    System.out.println("\nÇıkış yapılıyor...");
                    break;
                }
            }

        }

    }





