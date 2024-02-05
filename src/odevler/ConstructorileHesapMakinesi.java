package odevler;

import java.util.Scanner;

public class ConstructorileHesapMakinesi {

    private  double sayi1;
    private double sayi2;


    public ConstructorileHesapMakinesi(double sayi1 , double sayi2){
            this.sayi1 = sayi1;
            this.sayi2 = sayi2;
    }

    public void toplama() {
        double sonuc = sayi1 + sayi2;
        System.out.println("Toplam" + sonuc);
    }

    public void cıkarma() {
        double sonuc = sayi1 - sayi2;
        System.out.println("Cıkarma" + sonuc);
    }

    public void carpma() {
        double sonuc = sayi1 * sayi2;
        System.out.println("Carpma" + sonuc);
    }

    public void bolme() {
     if (sayi2!= 0) {
         double sonuc = sayi1 / sayi2;
         System.out.println("Bolme" + sonuc);
     }else{
         System.out.println(" Selcuk duzgun bolsene bolen 0 mı olur aq !!! ");
     }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("İki sayi giriniz");
        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();

        ConstructorileHesapMakinesi constructorileHesapMakinesi =  new ConstructorileHesapMakinesi(sayi1, sayi2);

        System.out.println("Selcuk ile yapmak istediginiz islemi seciniz aradıgınız cevap burada yok ");
        System.out.println("1.Toplama");
        System.out.println("2.Cıkarma");
        System.out.println("3. Carpma");
        System.out.println("4. Bolme");

        int secim = scanner.nextInt();

        switch (secim){
            case 1:
                constructorileHesapMakinesi.toplama();
                break;
            case 2:
                constructorileHesapMakinesi.cıkarma();
                break;
            case 3:
                constructorileHesapMakinesi.carpma();
            break;
            case 4:
                constructorileHesapMakinesi.bolme();
                break;
            default:
                System.out.println("Selcuk gotunden element uydurmus kendin yapsana islemi it");

        }
    }
}
