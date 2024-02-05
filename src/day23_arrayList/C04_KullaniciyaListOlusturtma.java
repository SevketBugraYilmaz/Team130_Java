package day23_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_KullaniciyaListOlusturtma {

    public static void main(String[] args) {
        List<String> isimListesi = isimleriAl();
        System.out.println("Girilen isimler: " + isimListesi);
    }

    public static List<String> isimleriAl() {
        List<String> isimListesi = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Bir isim girin (Çıkmak için 'Q' tuşuna basın): ");
            String isim = scanner.nextLine();

            if (isim.equalsIgnoreCase("Q")) {
                break;
            }

            isimListesi.add(isim);
        }

        scanner.close();
        return isimListesi;
    }
}







