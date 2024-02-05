package day22_multiDimensionalArrays_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_ArraydenTekrarEdenleriSilme {

    public static void main(String[] args) {

        // verilen bir array'de tekrar eden elementleri silip
        // array'i her elementin sadece 1 kere kullanildigi hale getirin

        int[] arr  =  { 3,6,1,4,7,3,9,4,2,3,6,1,4,3};

        List<Integer> tekrarsizList = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++ ) {

            if (!tekrarsizList.contains(arr[i])){

                tekrarsizList.add(arr[i]);
            }


        }

        System.out.println(tekrarsizList);

        // tekrarsiz hale gelen array DEGIL , bizim olusturdugumuz liste
        // array'e yeni bir array degeri atayip , listedeki elementleri yeni array'e tasimaliyiz


        int[] yeniArr = new int[tekrarsizList.size()]; // [0,0,0,0,0,0,0]

        for (int i = 0; i <yeniArr.length; i++) {


            yeniArr[i] = tekrarsizList.get(i);
            
        }

        System.out.println("Array'in son hali : " + Arrays.toString(arr));




    }
}
