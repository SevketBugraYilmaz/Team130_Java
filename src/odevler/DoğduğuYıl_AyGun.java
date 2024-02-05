package odevler;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class DoğduğuYıl_AyGun {

    //Kullanıcıdan doğduğu yıl, ay ve gün bilgisini alarak kullanıcıya doğduğu
    // gün haftanın hangi günü olduğunu söyleyen programı yazınız.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen dogdugunuz Yılı giriniz. ");
        int yil = scanner.nextInt();

        System.out.println("Lutfen dogdugunuz Ayı giriniz");
        int ay = scanner.nextInt();

        System.out.println("Lutfen dogdugunuz gunu giriniz");
        int gun = scanner.nextInt();

        LocalDate dogumTarihi = LocalDate.of(yil,ay,gun);

        DayOfWeek haftaninGunu = dogumTarihi.getDayOfWeek();

        System.out.println("Dogdunuz gun haftanin " + haftaninGunu + "gunudur");

    }
}
