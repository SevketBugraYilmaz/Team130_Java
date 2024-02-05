package odevler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class YemekSirketiOtomasyonu {

    static int secim;
    static List<String> sepet = new ArrayList<>();
    static List<Integer> fiyatsepeti = new ArrayList<>();
    static int fiyat = 0;
    static String pizzasecim;
    static Scanner scanner = new Scanner(System.in);
    static String burgerSecim;
    static String tatliSecim;
    static String icecekSecim;
    public static void main(String[] args) {
        boolean bool = true;
        while (bool) {
            System.out.println("\t\t\t\t :) Selcugun Cehennem Marketine Hosgeldidiniz :)\n" +
                    "1 Pizza Seçenekleri\n" +
                    "2 Burger Seçenekleri\n" +
                    "3 Tatlı Seçenekleri\n" +
                    "4 İçecek Seçenekleri\n" +
                    "5 Sepeti görüntüle");
            secim = scanner.nextInt();
            switch (secim) {
                case 1:
                    boolean bool1 = true;
                    while (bool1) {
                        System.out.println("\t\t\t Pizza Türleri\n" +
                                "Sosisli Pizza     75₺\n" +
                                "Peynirli Pizza    65₺\n" +
                                "Ananaslı Pizza    80₺");
                        Scanner scanner2 = new Scanner(System.in);
                        pizzasecim = scanner2.nextLine();
                        if (pizzasecim.equalsIgnoreCase("sosisli pizza")) {
                            fiyat = 75;
                            fiyatsepeti.add(fiyat);
                            sepet.add(pizzasecim);
                            bool1 = false;
                        } else if (pizzasecim.equalsIgnoreCase("Peynirli pizza")) {
                            fiyat = 65;
                            fiyatsepeti.add(fiyat);
                            sepet.add(pizzasecim);
                            bool1 = false;
                        } else if (pizzasecim.equalsIgnoreCase("Ananaslı pizza")) {
                            fiyat = 80;
                            fiyatsepeti.add(fiyat);
                            sepet.add(pizzasecim);
                            bool1 = false;
                        } else {
                            System.out.println("Hatalı pizza seçimi");
                        }
                    }
                    break;
                case 2:
                    boolean bool2 = true;
                    while (bool2) {
                        System.out.println("\t\t\t Burger Türleri\n" +
                                "King Beef  65₺\n" +
                                "Whooper    35₺\n" +
                                "Big King   45₺");
                        Scanner scanner1 = new Scanner(System.in);
                        burgerSecim = scanner1.nextLine();
                        if (burgerSecim.equalsIgnoreCase("King Beef")) {
                            fiyat = 65;
                            fiyatsepeti.add(fiyat);
                            sepet.add(burgerSecim);
                            bool2 = false;
                        } else if (burgerSecim.equalsIgnoreCase("Whooper")) {
                            fiyat = 35;
                            fiyatsepeti.add(fiyat);
                            sepet.add(burgerSecim);
                            bool2 = false;
                        } else if (burgerSecim.equalsIgnoreCase("Big Kİng")) {
                            fiyat = 45;
                            fiyatsepeti.add(fiyat);
                            sepet.add(burgerSecim);
                            bool2 = false;
                        } else {
                            System.out.println("Hatalı burger seçimi");
                        }
                    }
                    break;
                case 3:
                    boolean bool3 = true;
                    while (bool3) {
                        System.out.println("\t\t\t Tatlı Seçenekleri\n" +
                                "Sufle 50₺\n" +
                                "Donut 40₺\n" +
                                "Cokie  25₺");
                        tatliSecim = scanner.next();
                        if (tatliSecim.equalsIgnoreCase("Sufle")) {
                            fiyat = 20;
                            fiyatsepeti.add(fiyat);
                            sepet.add(tatliSecim);
                            bool3 = false;
                        } else if (tatliSecim.equalsIgnoreCase("Donut")) {
                            fiyat = 10;
                            fiyatsepeti.add(fiyat);
                            sepet.add(tatliSecim);
                            bool3 = false;
                        } else if (tatliSecim.equalsIgnoreCase("Cokie")) {
                            fiyat = 5;
                            fiyatsepeti.add(fiyat);
                            sepet.add(tatliSecim);
                            bool3 = false;
                        } else {
                            System.out.println("Hatalı tatlı seçimi");
                        }
                    }
                    break;
                case 4:
                    boolean bool4 = true;
                    while (bool4) {
                        System.out.println("\t\t\t İçecek Seçenekleri\n" +
                                "Kola   9₺\n" +
                                "Fanta  5₺\n" +
                                "Sprite 5₺");
                        icecekSecim = scanner.next();
                        if (icecekSecim.equalsIgnoreCase("kola")) {
                            fiyat = 3;
                            fiyatsepeti.add(fiyat);
                            sepet.add(icecekSecim);
                            bool4 = false;
                        } else if (icecekSecim.equalsIgnoreCase("fanta")) {
                            fiyat = 2;
                            fiyatsepeti.add(fiyat);
                            sepet.add(icecekSecim);
                            bool4 = false;
                        } else if (icecekSecim.equalsIgnoreCase("sprite")) {
                            fiyat = 2;
                            fiyatsepeti.add(fiyat);
                            sepet.add(icecekSecim);
                            bool4 = false;
                        } else {
                            System.out.println("Hatalı içecek seçimi");
                        }
                    }
                    break;
                case 5:
                    int toplam =0;
                    for (Integer integer : fiyatsepeti) {
                        toplam += integer;
                    }
                    System.out.println("Seçtiğiniz ürünler : " + sepet + " Seçilen ürününlerin toplam tutarı : " + toplam + "₺");
                    bool = false;
                    break;
            }
        }
    }
}
