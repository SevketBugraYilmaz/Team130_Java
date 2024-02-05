package day08_NestedIfElse_Statement;

public class C06_Ternary {
    public static void main(String[] args) {

        /*
        Ternary if-else'in alternatifi değildir
        Sadece basit islemlerde if-else'in yerine tercih edilebilir

        ternary bir sonuç  üretir
        Java tek  basina ternary'nin sonucunu ne yapacağını bilemez
        YAZDIRMA veya ATAMA yapmalisiniz

        EGER boolean şart true olduğunda elde edilen sonuç ile
        false olduğunda elde edilen sonuç farklı data   turlerine
         */

        int  input = 24;

        // iki basamaklı mı ?
        // iki basamakli ise sayiyi 2 katına çıkarın
        // iki basamakli değilse "iki basamaklı değil" yazdırın

        // String sonuc = input>=10 && input<=99 ? input*2 : "iki basamaklı değil"
       String sonuc = (input>=10 && input>=99 ? String.valueOf(input = input*2) :  "iki basamaklı değil") ;

        System.out.println("input'un son hali " + input);

    }
}
