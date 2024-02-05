package day29_immutableClasses;

public class C04_Immutable_Atamaislemi {

    public static void main(String[] args) {

        String isim = "Bugra";

        isim = isim.concat("YILMAZ");

        System.out.println(isim); // Bugra YILMAZ

        isim = isim.toUpperCase();

        // 18. satirdan itibaren , 26. satira kadar
        // Java kac tane obje olusturur ?

        String str = "a";


        for (int i = 0; i <100; i++) {

            str += "a";
            
        }

        System.out.println(str);
    }
}
