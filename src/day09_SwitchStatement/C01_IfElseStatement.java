package day09_SwitchStatement;

import java.util.Scanner;

public class C01_IfElseStatement {
    public static void main(String[] args) {

        // Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin ve
        // girilen harfin karsiligini yazdirin.
        // I : International S : Software T : Testing Q : Qualifications B: Board

            Scanner scanner =  new Scanner(System.in);
        System.out.println("Anlamini ögrenmek istediginiz harfi giriniz");

        char harf =  scanner.next().toUpperCase().charAt(0);

        if (harf == 'I'){
            System.out.println("International");
        } else if (harf == 'S'){
            System.out.println("Software");
        } else if (harf == 'T'){
            System.out.println("Tester");
        } else if (harf == 'Q'){
            System.out.println("Qualifications");
        } else if (harf == 'B'){
            System.out.println("Board");
        }else{
            System.out.println("Kisaltmada olan harflerden birini tercih  edin");
        }

    }
}
