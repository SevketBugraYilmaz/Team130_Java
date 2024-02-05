package day23_arrayList;


import java.util.ArrayList;
import java.util.List;

public class C02_Remove {

    public static void main(String[] args) {


        String[] harfler = {"J" , "a" , "v" , "l" ,"b" , "b" , "a"};


        List<String> harfListesi = new ArrayList<>();


        for (int i = 0; i <harfler.length; i++) {

            harfListesi.add(harfler[i]);
            
        }

        System.out.println(harfListesi); // [J, a, v, l, b, b, a]


        // harfler listesinden a'yi silin

        System.out.println(harfListesi.remove("a")); // true

        System.out.println(harfListesi); // [J, v, l, b, b, a]

        /*

        Eger parametre olarak bir obje yazarsak
        gidip o objeye uyan elementlerden ilk buldugunu siler
        delil olarak da silip silmedigini anlamamiz icin
        true/false dondurur

         */

       // System.out.println(harfListesi.remove(20)); // IndexOutOfBoundsException

        System.out.println(harfListesi.remove(2)); // l

        System.out.println(harfListesi); // [J, v, b, b, a]

        harfListesi.remove("b");

        System.out.println(harfListesi); // [J, v, b, a]

    }
}
