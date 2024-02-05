package odevler;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Burc_Hesaplama {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Lutfen Dogdunuz Ayi Giriniz");
        int ay = scanner.nextInt();
        System.out.println(" Lutfen Dogdunuz Gunu Giriniz");
        int gun = scanner.nextInt();

        String burc = "";


        if ((ay == 1 && gun >= 22) || (ay == 2 && gun < 20)) {
            burc = "Kova Burcu";
        } else if ((ay == 2 && gun >= 20) || (ay == 3 && gun < 21)) {
            burc = "Balık Burcu";
        } else if ((ay == 3 && gun >= 21) || (ay == 4 && gun < 21)) {
            burc = "Koc Burcu";
        } else if ((ay == 4 && gun >= 21) || (ay == 5 && gun < 22)) {
            burc = "Boga Burcu";
        } else if ((ay == 5 && gun >= 22) || (ay == 6 && gun < 23)) {
            burc = "İkizler Burcu";
        } else if ((ay == 6 && gun >= 23) || (ay == 7 && gun < 23)) {
            burc = "Yengec Burcu";
        } else if ((ay == 7 && gun >= 23) || (ay == 8 && gun < 23)) {
            burc = "Aslan Burcu";
        } else if ((ay == 8 && gun >= 23) || (ay == 9 && gun < 23)) {
            burc = " Basak Burcu";
        } else if ((ay == 9 && gun >= 23) || (ay == 10 && gun < 23)) {
            burc = " Terazi Burcu";
        } else if ((ay == 10 && gun >= 23) || (ay == 11 && gun < 22)) {
            burc = "Akrep Burcu";
        } else if ((ay == 11 && gun >= 22) || (ay == 12 && gun < 22)) {
            burc = " Yay Burcu";
        } else if ((ay == 12 && gun >= 22) || ( ay == 1 && gun < 22 )) {
            burc = "Oglak Burcu";
        } else {
            System.out.println("Geçerli Bir Tarih Giriniz");
        }
        System.out.println("Burcunuz : " + burc);

    }
}
