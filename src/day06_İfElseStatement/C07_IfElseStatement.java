package day06_İfElseStatement;

import java.util.Scanner;

public class C07_IfElseStatement
{
    public static void main(String[] args)
    { //Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar
      // “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Üçgenin kenar uzunluklarını giriniz");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if (kenar1 == kenar2 && kenar1 == kenar3 &&  kenar1 > 0 ){
            System.out.println("Eşkenar Üçgen");

        }  else {
            System.out.println("Eşkenar Üçgen değil");
        }

    }
}
