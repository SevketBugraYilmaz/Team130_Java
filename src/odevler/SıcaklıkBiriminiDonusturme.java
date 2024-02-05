package odevler;

import java.util.Scanner;

public class SıcaklıkBiriminiDonusturme {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen Sıcaklık degerini giriniz");
        double sicaklik = scanner.nextDouble();

        System.out.println("Lutfen sıcaklık birimini giriniz ");
        char birim = scanner.next().charAt(0);

        double donusturulmusSicaklikBirimi;
        if (birim ==  'C' || birim == 'c') {
            donusturulmusSicaklikBirimi = celsiusuFahrenheitaDonusturme(sicaklik);
            System.out.println(sicaklik  + "Celsius =" + donusturulmusSicaklikBirimi + "Fahrenheit" );
        } else if (birim == 'F' || birim == 'f') {
            donusturulmusSicaklikBirimi = fahrenheitiCelciusaDonusturme(sicaklik);
            System.out.println(sicaklik + "Fahrenheit = " + donusturulmusSicaklikBirimi + "Celsius");
        }else{
            System.out.println("Gecersiz Birim Lütfen Celsius veya Fahrenheit giriniz ");
        }


    }

    private static double fahrenheitiCelciusaDonusturme(double fahrenheit) {
            return ( fahrenheit - 32) * 5 / 9;

    }

    private static double celsiusuFahrenheitaDonusturme(double celsius) {
            return (celsius * 9 / 5 ) + 32;

    }

}
