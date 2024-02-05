package day12_StringManipulation;

public class C01_replace {
    public static void main(String[] args) {

        String str = "Hava Candir";

        str.replace("H" , "J");

        System.out.println(str.replace("H", "J"));

        System.out.println(str);

        str = str.replace("Hava" , "Java").replace(".", "");

        System.out.println(str); // Java Candir

        str.replaceFirst("a", "A"); // JAva Candir
        System.out.println(str.replace('a', 'A')); // JAvA CAndir

        // boslugu yok edelim
        System.out.println(str.replace(" " , ""));

        str = "Ali uzunkavaklaraltindayataruyumazoglu";

        System.out.println(str.replace('u' , 'Y'));

        str.replace("l", "XYZ");

    }
}
