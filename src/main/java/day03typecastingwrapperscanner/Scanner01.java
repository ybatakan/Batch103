package day03typecastingwrapperscanner;


import java.util.Scanner;

public class Scanner01 {

    //kullanicidan data almaya yarar. Scanner kullanici ile etkilesim kurmamizi saglar.
    //scanner bir java classidir. bu class i import etmek gerekir.



    public static void main(String[] args) {

        // kullanicidan data almak icin;
        //1 Scanner classindan obje olustur

        Scanner input= new Scanner(System.in);

        //2 kullaniciya ne yapacagini soyle
        System.out.println("hey kullanici yasini gir");

        //3 kullanicidan alinan datayi variable in icine koy
        byte age = input.nextByte();

        System.out.println("senin yasin "+ age);

    }
}
