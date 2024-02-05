package odevler;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SatrancOyunu {

    ArrayList<Tas> beyazlar;
    ArrayList<Tas> siyahlar;

    public void main(String[] args) {

    Tahta tahta = new Tahta();
        tahta.tahtayiBaslat();


    Scanner scanner = new Scanner(System.in);

        while(!tahta.oyunBittiMi()) {

        tahta.tahtayiGoster();

        System.out.println("Lutfen oynayacagınız kareyi giriniz");
        String hareket = scanner.nextLine();

        if (Tahta.gecerliHareket(hareket)) {
            tahta.hareketYap(hareket);
        } else {
            System.out.println("Girdiginiz hamle gecersiz");
        }
    }
        tahta.tahtayiGoster();
        System.out.println("Oyun Bitti"+tahta.kazanan()+"kazandi");
}

class Tas {
    int x, y;

    public Tas(int x, int y) {
        this.x = x;
        this.y = y;
    }

}

class Tahta {
    private String[][] tahta;

    public void tahtayiBaslat() {
        tahta = new String[][]

                {
                        {"r", "n", "b", "q", "k", "b", "n", "r"},
                        {"p", "p", "p", "p", "p", "p", "p", "p"},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", " ", " ", " ", " ", " ", " "},
                        {"P", "P", "P", "P", "P", "P", "P", "P"},
                        {"R", "N", "B", "Q", "K", "B", "N", "R"}


                };


    }


    public void tahtayiGoster() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.println(tahta[i][j] + "");
            }
            System.out.println();
        }

    }

    public static boolean gecerliHareket(String hareket) {


        return true;


    }

    public void hareketYap(String hareket) {

    }

    public boolean oyunBittiMi() {


        return false;
    }

    public String kazanan() {

    return "Beyaz";
    }

}
}






