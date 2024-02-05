package day36_overriding;

public class C05_Child extends  C04_Parent{

    @Override
    public void method1() {}

    public void method(){


    }

    @Override
    public void method3() {
        //  overriding method olusturmak icin
        // @Override notasyonu kullanmak zorunlu degildir
        // ama override method'u intelliJ'e olusturursak
        // intelliJ otomatik olarak notasyonu koyar
        // @Override notasyonu parent class'daki
        // override method'u takip eder
        // silinir veya signature'i degistirirse
        // CTE verir
        // Notasyon kullanilmayan method'larda
        // parent class'daki method kontrol edilmez
        // silinmesi veya degistirilmesi durumunda
        // overriding ozelligi biter ama kod calismaya devam eder
    }

    public static void method4(){

    }

    //public final String method5(){
      // bir method'u final olarak isaretlerseniz
      // o method override EDILEMEZ


    private void method6(){
       //  private bir method'u override edemezsiniz
       // ayni signature'a sahip

    }

    protected void method7(){}

    protected void method8(){}

    public void method9(){
        // Overriden method'un return type'i
        // void veya primitive ise
        //  Overriding method'un return type'i da ayni OLMALIDIR


    }

    public Object method10(){

        return null;
    }

    }


