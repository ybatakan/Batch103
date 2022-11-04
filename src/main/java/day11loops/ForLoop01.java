package day11loops;

import java.util.Scanner;

public class ForLoop01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("bi sayi gir");
        int sayi = input.nextInt();

        int faktoriyel = 1;

        for (int i = 1; i < sayi + 1; i++) {
            faktoriyel = faktoriyel * i;
        }
        System.out.println(faktoriyel);

        int carpma = 1;
        for (int i = 6; i > 2; i--) {
            carpma = carpma * i;
        }
        System.out.println(carpma);


        int num = 385;
        int sonuc1 = 0;
        for (int i = 385; i > 0; i /= 10) {
            sonuc1 = sonuc1 + i % 10;
        }
        System.out.println(sonuc1);


        //verilen stringi tersten okut

        String str = "Kaba";                         //toplamada 0,carpmada 1, string concatination da ""
        String ters = "";

        for (int i = str.length() - 1; i >= 0; i--) {       // onemli soru
            char c = str.charAt(i);
            ters = ters + c;
        }
        System.out.println(ters);
    }
}
