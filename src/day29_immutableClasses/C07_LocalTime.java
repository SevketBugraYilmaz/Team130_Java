package day29_immutableClasses;

import java.time.LocalTime;

public class C07_LocalTime {

    public static void main(String[] args) {

        LocalTime saat = LocalTime.now();


        System.out.println(saat);


        // bir for loop ile 1 milyon islem yaptirip
        // sureyi hesaplayalim

        int toplam = 0;

        for (int i = 0; i <1000000; i++) {

            toplam += i % 10;
            
        }

        System.out.println(toplam);

        LocalTime bitis = LocalTime.now();
        long nanoBitis = saat.getNano();


    }
}
