package day03_scanner_dataCasting;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {
        //Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen cemberin yaricapini giriniz");

        double yaricap = scanner.nextDouble();

        System.out.println("Cemberin alani : " + (3.14 * yaricap * yaricap));

        System.out.println("Cemberin cevresi : " + (3.14 * 2 * yaricap));
    }
}
