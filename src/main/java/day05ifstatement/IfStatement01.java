package day05ifstatement;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {

        // kullanicidan alinan sayinin tek mi cift mi oldugunu yaz

        Scanner input= new Scanner(System.in);
        System.out.println("sayi gir");
        int s = input.nextInt();

       // 1.yol
        if(s%2==0){
            System.out.println("cift sayi");
        }

        // == esittir != esit degil
        if(s%2!=0){
            System.out.println("tek sayi");
        }

        //2.yol

        if(s%2==0){
            System.out.println("cift sayi");
        }else{
            System.out.println("tek sayi");
        }


        //example 2  bir sayinin negatif pozitif veya notr oldugunu soyleyen kodu yaziniz
        System.out.println("sayi gir");
         double d = input.nextDouble();
         if(d>0){
             System.out.println("pozitif");
         }else if(d==0){
             System.out.println("notr");
         }else{
             System.out.println("negativ");
         }

    }
}
