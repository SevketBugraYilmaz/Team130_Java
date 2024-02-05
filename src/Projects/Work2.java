package Projects;

import java.util.Scanner;

public class Work2 {

    public static void main(String[] args) {
        // Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri karti olup olmadigini sorun. /n
        // Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin, /n
        // Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen Ürün Adedi Giriniz");

        int urunAdedi = scanner.nextInt();

        System.out.println("Lütfen Ürünün liste fiyatını giriniz");

        double listeFiyati = scanner.nextDouble();

        System.out.println("Müşteri Kartınız Var mı ? \n EVET \t\t HAYIR ");
        String musteriKartiVarMi = scanner.next();

        double indirimOrani = 0.0;

        if (musteriKartiVarMi.equalsIgnoreCase("Evet")){
            if(urunAdedi > 10 ) {
                indirimOrani = 0.20;
            } else {
                indirimOrani = 0.15;
            }
        } else if (musteriKartiVarMi.equalsIgnoreCase("Hayır")){
            if (urunAdedi > 10 ) {
                indirimOrani = 0.15;
            } else {
                indirimOrani = 0.10;
            }
        }
        double indirimliFiyat = listeFiyati * urunAdedi * (1 - indirimOrani);

        System.out.println("Toplam Tutarınız " + indirimliFiyat);
    }
}
