package day20_arrays;

public class C05_CiftSayilariTopla {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,};

        int toplamCiftSayilar = toplamCiftSayilariHesapla(arr);

        System.out.println("Çift Sayıların Toplamı: " + toplamCiftSayilar);
    }

    public static int toplamCiftSayilariHesapla(int[] arr) {
        int toplam = 0;

        for (int sayi : arr) {
            if (sayi % 2 == 0) {
                toplam += sayi;
            }
        }

        return toplam;
    }
}







