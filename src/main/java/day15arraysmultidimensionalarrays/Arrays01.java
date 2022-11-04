package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        int arr []= {12,31,43,14};
        int sayi=43;

        Arrays.sort(arr);
        int idx1= Arrays.binarySearch(arr,sayi);   // 12 14 31 43
        System.out.println(idx1); //3 oldugu icin index

        int sayi2=58;
        int sonuc= Arrays.binarySearch(arr,sayi2);
        System.out.println(sonuc); //-5  olmadigi icin - ve olsaydi kacinci sira ... index degil



    }
}
