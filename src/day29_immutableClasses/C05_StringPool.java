package day29_immutableClasses;

public class C05_StringPool {

    public static void main(String[] args) {

        /*
        Java String icin her seferinde yeniden obje olusturmamak icin
        basit bir mekanizma uretmistir

        Bune String Pool diyoruz
         */

        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        String str4 = "Ja" + "va";
        String s = "Ja";
        String t = "va";
        String str5 = s.concat(t);

        System.out.println(str1 = str2);
        System.out.println(str1 = str3);
        System.out.println(str1 = str4);
        System.out.println(str1 = str5);
        System.out.println(str1 = "Java");

        System.out.println("=====================");
        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // true
        System.out.println(str1.equals(str4)); // true
        System.out.println(str1.equals(str5)); // true
        System.out.println(str1.equals("Java")); // true

    }
}
