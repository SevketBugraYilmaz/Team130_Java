package day42_listIterators_Collections;

import java.util.LinkedList;
import java.util.List;

public class C02_Queue {

    public static void main(String[] args) {

        List<Integer> sayilar = new LinkedList<>();


        sayilar.add(2,44);

        System.out.println(sayilar);


        List<Integer> digerList = new LinkedList<>();


        digerList.add(44);
        digerList.add(23);
        digerList.add(10);

        System.out.println(digerList);

        sayilar.retainAll(digerList);

        System.out.println(sayilar);

        System.out.println(sayilar.hashCode());
    }
}
