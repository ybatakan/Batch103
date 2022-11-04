package day02methodcreation;

import java.sql.SQLOutput;

public class MethodCreation {

// main method icinde kullanacagimiz hersey static olmalidir.
    public static void main(String[] args) {

        System.out.println(toplamaYap(1.2,5));

        System.out.println(ucSayiyiCarp(1.5,8,12));

        System.out.println(toplamaCarpmaYap(12,8,1.5));

        //ekrana yazirmak icin 2 kod war 1)system.out.println() 2)system.out.print()



    }

    //example1 : toplama islemi yapan bir method olusturunuz.

    public static double toplamaYap(double a, double b){

        return a+b;
    }

    //example2 : 3 sayiyi birbiri ile carpan bir method olusturunu

    public static double ucSayiyiCarp(double a, double b, double c){

        return a*b*c;
    }

    //example3 uc sayidan ilk 2 sini topla 3. ile carpan method olusturup yazdirin.

    public static double toplamaCarpmaYap(double a, double b, double c){

        return (a+b)*c;
    }


}
