package day04;

import java.util.Scanner;

public class P01_IfStatement_DogumGunuKiyaslama {
    public static void main(String[] args) {

        Scanner elma = new Scanner(System.in);

        System.out.println("Kiyaslamak istediginiz dogum tarihlerinden ilkini YYYY/AA/GG formatinda giriniz : ");

        String dogumTarihi1 = elma.nextLine();   // 2004/04/14

        System.out.println("Kiyaslamak istediginiz dogum tarihlerinden ikincisini YYYY/AA/GG formatinda giriniz : ");

        String dogumTarihi2 = elma.nextLine();   //  2007/09/22

        int yil1 = Integer.parseInt(dogumTarihi1.replaceAll(" ", "").substring(0, 4));// String donduruyor
        int ay1 = Integer.parseInt(dogumTarihi1.replaceAll(" ", "").substring(5, 7));// String donduruyor,
        int gun1 = Integer.parseInt(dogumTarihi1.replaceAll(" ", "").substring(8));

        int yil2 = Integer.parseInt(dogumTarihi2.replaceAll(" ", "").substring(0, 4)); // String donduruyor,
        int ay2 = Integer.parseInt(dogumTarihi2.replaceAll(" ", "").substring(5, 7)); // String donduruyor
        int gun2 = Integer.parseInt(dogumTarihi2.replaceAll(" ", "").substring(8));  // String donduruyor

        if (yil1 > yil2) System.out.println("Ikinci girilen dogum tarihinin sahibi daha yaslidir!!!");
        else if (yil1 < yil2) System.out.println("Ilk girilen dogum tarihinin sahibi daha yaslidir!!!");
        else {    // Burada iki dogum yilinin da esit oldugu durum islenmeye baslar!!!

            if (ay1 > ay2) System.out.println("Ikinci girilen dogum tarihinin sahibi daha moruktur!!!");
            else if (ay1 < ay2) System.out.println("Ilk girilen dogum tarihinin sahibi daha moruktur!!!");
            else {       // Burada iki dogum ayinin da esit oldugu durum islenmeye baslar!!!

                if (gun1 > gun2)
                    System.out.println("Ikinci girilen dogum tarihinin sahibi daha ayagi cukura daha yakindir!!!");
                else if (gun1 < gun2)
                    System.out.println("Ilk girilen dogum tarihinin sahibi daha ayagi cukura daha yakindir!!!");
                else {       // Burada iki dogum gunu da esit oldugu durum islenmeye baslar!!!
                    System.out.println("Siz ikizsiniz!!!!");
                }
            }

        }
    }

    }