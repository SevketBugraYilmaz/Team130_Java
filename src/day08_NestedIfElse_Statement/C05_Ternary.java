package day08_NestedIfElse_Statement;

public class C05_Ternary {
    public static void main(String[] args) {

        // input olarak verilen bir tamsayi için
        // pozitif veya pozitif değil yazdirin

        int input = 56;

        if (input>0){
            System.out.println("sayi pozitif");
        } else {
            System.out.println("Sayi pozitif değil");
        }

        System.out.println(input>0 ? "sayi pozitif" : "Sayi pozitif değil" );



        // input olarak verilen sayi
        // çift sayi ise 2 katina çıkarın
        // tek sayi ise değerini 5 arttırın

        input = input % 2 == 0 ? input*2 : input + 5 ;

        System.out.println(input);

        if (input % 2 == 0){
            input *= 2;
        } else {
            input +=5;
        }
    }
}
