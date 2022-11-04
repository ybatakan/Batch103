package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

//example1 sayilari kullanicidan alan ve toplama isi yapan kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("ilk sayiyi gir");
        double sayi1= input.nextDouble();
        System.out.println("ikinci sayiyi gir");
        double sayi2 = input.nextDouble();

        System.out.println(sayi1+sayi2);



    }

}
