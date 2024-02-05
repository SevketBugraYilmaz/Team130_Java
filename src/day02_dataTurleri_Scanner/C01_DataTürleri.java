package day02_dataTurleri_Scanner;

public class C01_DataTürleri {

    public static void main(String[] args) {

        int sayı1 =23; // hafızada 32 bit

        byte sayı2 = 23; // hafızada 8 bit

        short sayı3 = 23; // hafızada 16 bit

        long sayı4 = 23; // hafızada 64 bit

        char ch1 ='4';
        char ch2 =' '; // space de #,%,& gibi bir karakterdir
        //char ch3 ='4 '; char data türü sadece 1 karakter kabul eder

        String str1 = "Java Candır";
        String telefonNo = "5552344567";
        //int tel = 5552344567; telefon no matematiksel işlemlerlerde kullanılmadığından ve int  değerlerinden büyük
        // olduğundan string olarak tutulabilir

        System.out.println("str1"); // str1
        System.out.println(str1); // Java  Candır

        int x = 23;
        int y = 13;

        // iki sayının toplamını yazdırın


        System.out.println("Verilen iki sayının toplamı :"+ (x+y) ); // 36
        // verilen iki sayının toplamı : 36


        x=15;

        System.out.println("x: "+ x); // x : 15

        x= 3 * x +1 ;

        System.out.println("x'in yeni değeri :  "+ x); // x'in yeni değeri : 46

        Float fl1 = 20F;
        Float fl2 = 6F;

        System.out.println(fl1/ fl2 ); // 3.3333333

        double dbl1 = 20;
        double dbl2 = 6;

        System.out.println(dbl1/dbl2 ); // 3.3333333333333335



    }
}
