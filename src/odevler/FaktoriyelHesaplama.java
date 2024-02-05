package odevler;

import java.util.Scanner;

public class FaktoriyelHesaplama {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen Faktoriyelini almak istediginiz sayiyi giriniz");
        int sayi = scanner.nextInt();

        long faktoriyel = hesaplaFaktoriyel(sayi);


        System.out.println(sayi + "! =" + faktoriyel);

        scanner.close();
    }

    private static long hesaplaFaktoriyel(int  a) {
        if ( a == 0 || a == 1) {
            return 1;
        }else{
            return a * hesaplaFaktoriyel(a - 1);
        }

    }

}
