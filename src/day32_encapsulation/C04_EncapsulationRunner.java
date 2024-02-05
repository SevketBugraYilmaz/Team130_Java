package day32_encapsulation;

import org.w3c.dom.ls.LSOutput;

public class C04_EncapsulationRunner {

    public static void main(String[] args) {

        // Access modifier ile bir variable'a erisim yetkimiz varsa
        // HEM onu yazdirabilir , HEM DE deger atayabiliriz
        //

        C03_Encapsulation obj = new C03_Encapsulation();

        //  obj.strPrivate = "Private";
       // System.out.println(obj.strPrivate);


        obj.strDefault = "Default";
        System.out.println(obj.strDefault);
        obj.strProtected = "protected";
        System.out.println(obj.strProtected);
        obj.strPublic = "Public";
        System.out.println(obj.strPublic);

        // PEKIII okuma yani degerini gorunteleme yetkisi ile
        // write yani deger atayabilme yetkisini ayirabilir misiniz ?

        /*
        ilgili variable'lari private yaptigimiz icin
        access modifier onlari kullanmamiza hicbir sekilde
        izin vermez
        obj.satisTutari = 20;
        System.out.println(obj.satisTutari);
        obj.toplamSatisTutari = 50;
        System.out.println(obj.toplamSatisTutari);

         */

        System.out.println(obj.getSatisTutari()); // 0

        obj.setSatisTutari(50);
        obj.setSatisTutari(100);
        obj.setSatisTutari(100);

        System.out.println(obj.getToplamSatisTutari());

        // satis tutari variable'inin degerini yazdirana
        // 100 euro veririz

       // System.out.println(obj.SatisTutari());

        // Toplam satis tutari variable'ina degere atayana da
        // 100 euro veririz

        // obj.toplamSatisTutari = 200;
    }
}
