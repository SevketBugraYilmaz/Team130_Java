package odevler;

import java.util.Scanner;

public class Not_Hesaplama {
    public static void main(String[] args) {
     // Türkçe matematik ve fizik ders notlarını girdiğimiz ve bu notların ortalamasını kullanıcıya veren programı
     // yazınız

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen Türkçe Notunuzu Giriniz");
        int Türkçe = scanner.nextInt();

        System.out.println("Lütfen Matematik Notunuzu Giriniz");
        int Matematik = scanner.nextInt();

        System.out.println("Lütfen Fizik Notunuzu Giriniz");
        int Fizik = scanner.nextInt();

        System.out.println("Lütfen Bu Derslerin Ortalamasını Alınız");
        System.out.println("Fizik"+ Fizik);
        System.out.println("Matematik"+ Matematik);
        System.out.println("Türkçe"+Türkçe);

        double ortalama = ((Fizik+Türkçe+Matematik)/3);
        System.out.println("Derslerinizin Not Ortalaması"+ ortalama);





    }
}
