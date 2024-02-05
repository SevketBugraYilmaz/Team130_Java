package day14_forLoop;

import java.util.Scanner;

public class C08_NestedForLoop {
    public static void main(String[] args) {

        /*

        Kullanicidan satir ve sutun sayisini alip
        asagidaki sekilde tablo olusturun

        * * * * *
        * * * * *
        * * * * *
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz...");
        int satir = scanner.nextInt();

        System.out.println("Her satirda kac sayi olacagini giriniz");
        int sutun = scanner.nextInt();

        for (int i = 0; i <=satir ; i++) { // satirlari

            for (int j = 0; j <=sutun; j++) { // satirdaki sutunlari

                System.out.println("* ");
                
            }
            System.out.println("");
        }
    }
}
