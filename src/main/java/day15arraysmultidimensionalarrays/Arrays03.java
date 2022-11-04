package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        // stringde ki sesli harflerin sayisini bulan kodu yazin
        String str= "java ogrenince para kazanmak kolay, ogrenmeyince ne kolay ki";
        String str1= str.toUpperCase();
        String harfler[]= str1.split("");
        System.out.println(Arrays.toString(harfler));
        int counter=0;

        for(String w: harfler){

        switch (w){

            case"A": case"E": case"I": case"U": case"O":
                counter++;

        }
        }
        System.out.println(counter);
    }
}
