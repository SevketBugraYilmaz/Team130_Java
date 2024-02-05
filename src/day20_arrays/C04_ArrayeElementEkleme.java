package day20_arrays;

import java.util.Arrays;

public class C04_ArrayeElementEkleme {

    public static void main(String[] args) {

      //  Soru 7- Verilen bir array’e istenen bir elemani ekleyip
        //  bize donduren bir method yazin, eski array’e yeni degeri atayin.



        int[] arr = {3,6,7,9};
        int eklenecekEleman = 1 ;

     //   arr[3] = eklenecekEleman; // ArrayIndexOutOfBoundsException

        // once 4 kisilik bir yeniArr olusturalim

        int[] yeniArr = new int[arr.length+1];

        // 

        for (int i = 0; i < arr.length; i++) {

            yeniArr[i] = arr[i];
            
        }

        yeniArr[yeniArr.length-1] = eklenecekEleman;

        arr = yeniArr;

        System.out.println(Arrays.toString(arr)); // [3, 6, 7, 9, 1]

        // array'e yeni eleman olarak 5,7  ve 3 ekleyelim

        arr = arrayElementEkle(arr , 5);
        arr = arrayElementEkle(arr , 7);
        arr = arrayElementEkle(arr , 3 );

        System.out.println(Arrays.toString(arr));
    }

    public static int[] arrayElementEkle(int[] arr , int eklenecekSayi ){

        int[] yeniArray = new int [arr.length +1 ];

        for (int i = 0; i < arr.length; i++) {

            yeniArray[i] = arr[i];

            yeniArray[arr.length ] = eklenecekSayi;

        }
            return yeniArray;


    }
}
