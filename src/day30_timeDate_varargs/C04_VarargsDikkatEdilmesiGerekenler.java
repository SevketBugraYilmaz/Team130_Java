package day30_timeDate_varargs;

public class C04_VarargsDikkatEdilmesiGerekenler {

    // argument olarak verilen sayilardan
    // ilki haric geriye kalanlari toplayip
    // bulunan toplami ilk sayi ile carpip
    // sonucu yazdiran bir method olusturun

    // input = 0,2,3,4,1   output ==> 0*10 = 0
    // input = 1,2,3       output ==> 1* 5 = 5


    public static void main(String[] args) {

        islemYap(0,2,3,4,1);
        islemYap(1,2,3);
        islemYap(2,3,4,5,6,7,8,9);
        islemYap(5); // 0
        // varargs  cok elemanli sorun etmedigi gibi hic eleman verilmemesi
    }

    public  static void islemYap(int ilkSayi , int... geriyeKalanlar){

        int toplam = 0;

        for (int each: geriyeKalanlar
        ) {
            toplam += each;
        }

        System.out.println(toplam*ilkSayi);
    }
}
