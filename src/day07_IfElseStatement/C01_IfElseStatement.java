package day07_IfElseStatement;

import java.util.Scanner;

public class C01_IfElseStatement
{
    public static void main(String[] args)
    {
        //  Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");

        char karakter = scanner.next().charAt(0);

        if (karakter > 'A' && karakter<= 'Z') {
            System.out.println("Girilen karakter büyük harf");
        }else{
            System.out.println("Girilen karakter büyük harf değil");
        }
    }
}
