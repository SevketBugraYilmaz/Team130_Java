package day44_maps;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class C05_FarkliDataTurlerindekiElementleriKullanma {

    public static void main(String[] args) {

        List<String> things = new ArrayList<>();

        things.add("Gul");

       // things.add(10);
       // things.add(false);
       // things.add('k');

        int[] arr = {4,5,6};

       // things.add(arr);



        // ben farkli data turundeki her turlu seyi bir listeye eklemek istersem

        List<Object> seyler = new ArrayList<>();

        seyler.add("Bugra");
        seyler.add(10);
        seyler.add(false);
        seyler.add('k');
        seyler.add(arr);

        System.out.println(seyler); // [Bugra, 10, false, k, [I@3feba861]

        // 1. index'de bulunan sayinin 2 katini yazdirin

        System.out.println(  (Integer)seyler.get(1) * 2  ); // Operator '*' cannot be applied to 'java.lang.Object', 'int'

        // 0.index'deki ismi buyuk harfler ile yazdirin

        System.out.println(  ((String) seyler.get(0)).toUpperCase()  );

        // 4. index'deki Array'i yazdirin

        System.out.println(Arrays.toString((int[])seyler.get(4))); // [4, 5, 6]
    }
}
