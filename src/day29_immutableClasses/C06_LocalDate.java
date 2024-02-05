package day29_immutableClasses;

import java.time.LocalDate;

public class C06_LocalDate {

    public static void main(String[] args) {

        LocalDate tarih = LocalDate.now();

        LocalDate dogumtarihi = LocalDate.of(1990,10,5);

        System.out.println(tarih); // 2023-11-29

        System.out.println(tarih.plusWeeks(23)); // 2024-05-08

        // plus...() ile tarihte ileri gidebiliriz

        System.out.println(tarih.plusWeeks(3).plusYears(2).plusDays(5));
        // 2025-12-25


        // minus...() ile tarihte geri gidebiliriz


        tarih.minusYears(5).minusMonths(3).minusDays(8);
        // 2018-08-21

        // tarihin istedigimiz bir bolumu , istedigimiz deger ile degistirebiliriz


        System.out.println(tarih.withYear(2021)); //
        System.out.println(tarih.withDayOfYear(134)); // 2023-05-14


        System.out.println(tarih.getDayOfYear()); // 333
        System.out.println(tarih.getDayOfWeek()); // WEDNESDAY
        System.out.println(tarih.getEra()); // CE


        System.out.println(tarih.lengthOfYear()); // 365

        System.out.println(tarih.isLeapYear()); // false

        LocalDate leapyearKontrol = LocalDate.of(2040,1,1);

        System.out.println(leapyearKontrol.isLeapYear()); // true

        System.out.println(tarih.isBefore(leapyearKontrol)); // true

        System.out.println(tarih.isAfter(leapyearKontrol)); // false

        System.out.println(tarih.isEqual(leapyearKontrol)); // false

        System.out.println(tarih.compareTo(dogumtarihi)); // 33
        tarih.compareTo(leapyearKontrol);
    }
}
