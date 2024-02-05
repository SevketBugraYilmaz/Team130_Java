package day35_inheritanceDataTypeKullanimi;

public class C03_AvciKuslar extends  C02_Kuslar{

    String hareket = "ucarlar";
    String beslenme = "et yerler";
    String pence = "pencelidir";
    String gaga = "sivri gagali";


    public static void main(String[] args) {

        C03_AvciKuslar avciKus1 = new C03_AvciKuslar();

        System.out.println(avciKus1.hareket); // ucarlar
        System.out.println(avciKus1.solunum); // akciger K
        System.out.println(avciKus1.beslenme); // et yerler
        System.out.println(avciKus1.cogalma); // yumurtayla cogalirlar K
        System.out.println(avciKus1.omur); // yasar ve olurler H
        System.out.println(avciKus1.kanat); // kanatlidir K
        System.out.println(avciKus1.gaga); // sivri gagalidir AVK
        System.out.println(avciKus1.pence); // pencelidir AVK
    }
}
