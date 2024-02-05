package day10_StringManipulation;

public class C02_equals {
    public static void main(String[] args) {

        String str1 = "Ahmet";
        String str2 = "AHMET";
        String str3 = "ahmet";
        String str4 = "AhMet";
        String str5 = "Ahmet";
        String str6 = new String("Ahmet");
        String str7 = "Ah";
        String str8 = "met";
        String str9 = str7 + str8 ; // Ahmet

        // 1- String case sensivite'dir
        // str1,str2,str3 ve str4' un degerleri birbirinden farklıdır
        // str1,str5,str6 ve str9' un degerleri ise aynidir

        // String'de karsilastirma icin == kullanirsaniz
        // metni ayni olan Stringlerde bile false dönebilir
        //  == hem metin degerine hem de referansa baktigi icin
        // metni ayni degerine hem de  referansa baktigi icin
        // metni ayni olan farkli Stringler icin farkli sonuclar verebilir

        System.out.println(str1 == str5);
        System.out.println(str1 == str6);
        System.out.println(str1 == "Ahmet");
        System.out.println(str1 == str9);

        //  Iki String'in Metin olarak ayni olup olmadigini kontrol etmek icin
        // SIMDILIK == kullanmaycagiz
        // String'lerde metin olarak ayni olmayi kontrol icin
        // equals() kullanilir

        // equals() ayni metinler icin true doner
        System.out.println(str1.equals(str5)); // Ahmet == Ahmet true
        System.out.println(str1.equals(str6));  // Ahmet == Ahmet true
        System.out.println(str1.equals("Ahmet")); // Ahmet == Ahmet true
        System.out.println(str1.equals(str9));  // Ahmet == Ahmet true


        // equals() ayni metnin farkli yazimlari icin
        System.out.println(str1.equals(str2)); // Ahmet == AHMET false
        System.out.println(str1.equals(str3)); // Ahmet == ahmet false
        System.out.println(str1.equals(str4)); // Ahhmet == AhMet false


        System.out.println(str1.equalsIgnoreCase(str2)); // Ahmet == AHMET false
        System.out.println(str1.equalsIgnoreCase(str3)); // Ahmet == ahmet false
        System.out.println(str1.equalsIgnoreCase(str4)); // Ahhmet == AhMet false


        // benim sifrem 1453.Istanbul

    }
}
