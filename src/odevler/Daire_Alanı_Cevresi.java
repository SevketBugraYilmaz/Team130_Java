package odevler;

import java.util.Scanner;

public class Daire_Alanı_Cevresi {
    public static void main(String[] args) {

        // Dairenin Alanını ve Çevresini Hesaplayan Program
        //Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen Dairenin yaricapini giriniz");

        double yaricap = scanner.nextDouble();

        // Alan Formülü : π * r * r; ,  Çevre Formülü : 2 * π * r;

        System.out.println("Dairenin alani : " + (3.14 * yaricap * yaricap));

        System.out.println("Dairenin çevresi :" + (2 * 3.14 * yaricap));
    }
}
