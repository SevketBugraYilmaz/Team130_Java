package day14_forLoop;

import java.util.Scanner;

public class C04_AsalSayi {
    public static void main(String[] args) {

        //Kullanicidan pozitif bir tamsayi isteyip,
        // sayinin asal sayi olup olmadigini kontrol edin ve sonucu yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int sayi = scanner.nextInt();

        int flag = 10;

        for (int i = 2; i < sayi-1 ; i++) {


            if (sayi % i == 0){
                flag++;
                break;
            }
            
        }

        if (flag==10){
            System.out.println("girilen sayi asal");
        }else{
            System.out.println("girilen sayi asal degil");
        }

    }
}
