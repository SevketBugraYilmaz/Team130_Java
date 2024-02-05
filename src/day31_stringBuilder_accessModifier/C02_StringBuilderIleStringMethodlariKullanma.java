package day31_stringBuilder_accessModifier;

public class C02_StringBuilderIleStringMethodlariKullanma {

    public static void main(String[] args) {

        /*
            StringBuilder ile kullanilabilen method'lardan
            String , char gibi baska data turunden sonuc dondurenler
            StringBuilder'i kalici olarak degistirmezler
         */

        StringBuilder sb = new StringBuilder("Java Candir");

        // sb'yi buyuk harflerle yazdirin

        System.out.println(sb.toString().toUpperCase()); // JAVA CANDIR

        // StringBuilder'da olmayan String ozelliklerini kullanmak istersek
        // once toString() ile String'e cevirir , sonra istedigimiz String method'unu kullanabiliriz
        // Peki bu degisiklik kalici olur mu ?

        System.out.println(sb); // Java Candir

        // Peki atama yapsak kalici olur mu ?

        StringBuilder sb1 = new StringBuilder("Java");

        //  eger sb'nin degerini buyuk harf yapip,
        // kalici olarak degistirmek istiyorsak

        sb = new StringBuilder(sb.toString().toUpperCase());

        System.out.println(sb); // JAVA CANDİR

        System.out.println(sb.substring(5)); // CANDİR

        System.out.println(sb);

        System.out.println(sb.charAt(6));

        System.out.println(sb);

        System.out.println(sb.toString());


    }
}
