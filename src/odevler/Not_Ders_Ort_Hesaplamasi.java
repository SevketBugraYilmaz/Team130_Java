package odevler;

import java.util.Scanner;

public class Not_Ders_Ort_Hesaplamasi {
    public static void main(String[] args) {
        // derslere katilima gore ortalamasini aliniz

        Scanner scanner = new Scanner(System.in);

        int Turkce, Matematik, Fizik, Kimya, Biyoloji, sinavSayisi = 2;

        double ortalama = 0, ortalama2 = 0;



        for (int i = 1; i <= sinavSayisi; i++) {

            System.out.println(i + " Turkce : ");
            Turkce = scanner.nextInt();

            System.out.println(i + " Matematik : ");
            Matematik = scanner.nextInt();

            System.out.println(i + " Fizik : ");
            Fizik = scanner.nextInt();

            System.out.println(i + " Kimya : ");
            Kimya = scanner.nextInt();

            System.out.println(i + " Biyoloji : ");
            Biyoloji = scanner.nextInt();

            ortalama = (Turkce + Matematik + Fizik + Kimya + Biyoloji) / 5;

            ortalama2 = (ortalama + ortalama2);

            System.out.println(ortalama);

        }

        System.out.println(ortalama2 / sinavSayisi);


    }
}
