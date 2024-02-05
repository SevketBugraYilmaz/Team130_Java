package day07_IfElseStatement;

import java.util.Scanner;

public class C04_Bolunebilme {

    public static void main(String[] args) {

        // kullanicidan pozitif bir tamsayi alin
        // 3 ile bolunebiliyorsa "3"'un kati
        // 5 ile bolunebiliyorsa "5"'in kati
        // hem 3 hem de 5 ile bolunebiliyorsa super sayi yazdirin

        /*
        Eger sartlar birbiri ile ilgili ise
        en önce en secici olani yazmaliyiz

        - Eger ifade else ile bitmezse
        if else statement tum degerleri KAPSAMIYOR
        yani bazi degerleri girdigimizde
        kod calisir ama hic bir sonuc uretmez
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Pozitif bir tamsayi giriniz");

        int sayi  = scanner.nextInt();

        if (sayi % 3 == 0 && sayi % 5 == 0) {
            System.out.println("Süper sayi");
        } else if (sayi % 3 == 0) {
            System.out.println("3'ün kati");
        } else if (sayi % 5 == 0 ) {
            System.out.println("5'in katı");
            
        }
    }
}
