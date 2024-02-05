package day18_Scope;

public class C02_Scope_ClassVariables_staticKeyword {

    /*
            static keyword bir nevi statu belirtir
            static unvanini alan variable veya method'lar
            static olmayan class uyelerini kabul etmezler

            static uyeler ellerini kollarini sallayarak , her yere gidebilir
            ama kendi iclerine static olmayan uyeleri almazlar
     */

    /*
    Class level'daki variable'lar da
    static olarak veya static keyword kullanilmadan olusturulabilir


     */

    static String s;
    static int a;
    boolean bl;
    char chr;


    public static void main(String[] args) {
        staticMethod1();
        //staticOlmayanMethod2();
        // Non-static method 'staticOlmayanMethod2()' cannot be referanced from a static context

        s ="Java";
        a = 20;
        // bl = true;
    }


    public static void staticMethod1(){

        // staticOlmayanMethod2();
        s = "Hava";
        a = 30;



    }



    public void     staticOlmayanMethod2(){

        staticMethod1();
        System.out.println(s);
        System.out.println(a);
        System.out.println(bl);



    }

}
