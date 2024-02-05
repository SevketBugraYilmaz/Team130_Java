package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_IstenmeyenIsimleriSilme {

    //Soru 3- Verilen String bir listede
    //        istenmeyen harf iceren elementleri silip,
    //        kalan kismini list olarak bize donduren bir method olusturun


    public static void main(String[] args) {
        List<String> isimler = new ArrayList<>();
        isimler.add("Meltem");
        isimler.add("Ramazan");
        isimler.add("Saido");
        isimler.add("Kaan");
        isimler.add("Kamil");
        isimler.add("Eren");

        String istenmeyenHarf = "e";

        List<String> esizListe = esiz(isimler, istenmeyenHarf);
        System.out.println("Filtrelenmiş Liste: " + esizListe);
    }

    public static List<String> esiz(List<String> liste, String istenmeyenHarf) {
        List<String> esizListe = new ArrayList<>();

        for (String kelime : liste) {
            if (!kelime.toLowerCase().contains(istenmeyenHarf.toLowerCase())) {
               esizListe.add(kelime);
            }
        }

        return esizListe;
    }
}
