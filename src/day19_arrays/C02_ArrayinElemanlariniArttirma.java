package day19_arrays;

import java.util.Arrays;

public class C02_ArrayinElemanlariniArttirma {

    public static void main(String[] args) {



       // Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method olusturun.
        // Eski array’i yeni haliyle kaydedin.


        int[] arr = {5,1,7,9,2};

        // eger Array'in tum elemanlarini gozden gecirmeniz gerekiyorsa
        // for loop kullaniriz

        for (int i = 0; i <arr.length; i++) {

         arr[i] = arr[i] + 2 ;


        }

        System.out.println(Arrays.toString(arr)); // [7,3,9,11,4]



    }

    public static int[] elemanlariArtir(int[] arr , int artisMiktari){

        for (int i = 0; i < arr.length; i++) {

            arr[i] = arr[i] + artisMiktari ;
        }
        return arr;

    }
}
