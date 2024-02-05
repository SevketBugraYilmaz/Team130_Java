package day41_exceptions_collections;

public class C01_Exceptions {

    public static void main(String[] args) {

        int sayi = 10;
        // eger sayi negatif negatifse sadece 1. satir calissin, sonra
        // 5. satirdan sonra normal calismaya devam etsin
        // sayi cift ise 1. 2. satir calissin sonra
        // diger durumlarda 5 satirda calissin


        try {
            System.out.println("satir1");
            if(sayi<0) throw new IllegalAccessException();
            System.out.println("satir2");
            if (sayi % 2 == 0) throw new RuntimeException();
            System.out.println("satir3");
            System.out.println("satir4");
            System.out.println("satir5");
        } catch (IllegalAccessException e) {

        }catch (RuntimeException e){

        }
        System.out.println("Buradan itibaren calismaya devam ");


    }


    }

