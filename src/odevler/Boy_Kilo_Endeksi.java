package odevler;

import java.util.Scanner;

public class Boy_Kilo_Endeksi {
    public static void main(String[] args) {

        //  Kilo (kg) / Boy(m) * Boy(m)

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen Kilonuzu Kg Cinsinden Giriniz : ");

        double kilo = scanner.nextDouble();

        System.out.println("Lutfen Boyunuzu Metre Cinsinden  Giriniz");

       double boy = scanner.nextDouble()    ;

        double kitle = kilo/( boy * boy );

        System.out.println("Vucut Kitle İndeksiniz :" + kitle);



    }
}
