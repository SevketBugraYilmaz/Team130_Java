package day33_inheritance;

public class C07_Vectra extends  C06_Opel{

    C07_Vectra(){
        super();
        System.out.println("Vectra constructor calisti");

    }

    String strChild = "Vectra class Child";

    String model = "Vectra";

    public static void main(String[] args) {

        /*
        Bir class'dan obje olusturup,
        o class'da var olan ozellikleri edinebilmek icin
        MUTLAKA bir CONSTRUCTOR calismalidir

        extends keyword kullanan bir class'da
        her constructor'in ilk satirinda
        MUTLAKA bir constructor call bulunur

        EGER gorunur bir constructor call yoksa
        Java default olarak super() constructor call koyar
        yani default olarak once parent'daki
        parametresiz constructor'da
         */

        C07_Vectra vectra = new C07_Vectra();

        System.out.println(vectra.strGP);
        System.out.println(vectra.strP);
        System.out.println(vectra.strChild);
        System.out.println(vectra.marka);
        System.out.println(vectra.model);
    }
}
