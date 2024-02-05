package day43_Maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class C01_MapOlusturmaElementEkleme {

    public static void main(String[] args) {


        Map<Integer , String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-10-K-MF");
        // bu ogrenci icin key : 101
        //           value: "Ali-Can-10-K-MF"
        // value String olmak zorunda degil list, array, Integer ,Map , Queue


        String value101 = ogrenciMap.get(101);

        System.out.println("101!in tum bilgisi :" + value101); // Ali-Can-10-K-MF


        // 101 numarali ogrencinin soyismini yazdirin

        String[] ogrenci101BilgilerArr = value101.split("_");

        System.out.println(Arrays.toString(ogrenci101BilgilerArr));


        

    }
}
