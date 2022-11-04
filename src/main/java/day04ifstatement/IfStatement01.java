package day04ifstatement;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {

        //example 1; sayi pozitif ise ekrana yazdorin

        int s=-12;

        if(s>0){
            System.out.println("pozitif");
        }

        //example 2; verilen karakter buyuk harf ise  "buyuk harf yazin

        char ch= 'B';

        if(ch>='A' && ch<='Z'){
            System.out.println("buyuk harf");

        }


        System.out.println("sayi gir");
        Scanner input= new Scanner(System.in);
        int a= input.nextInt();
        if (a>=100 && a<=1000)
             {
                System.out.println("uc basamakli");
            }

        /*
        && islemi boolean ile kullanilir
        sadece true + true = true
         */


            int n= -24;

            n=Math.abs(n);

            if(n>99 && n<1000){

                System.out.println("3 basamak ");
            }


            //cift sayi

        int p=18;

            if(p%2==0){
                System.out.println("cift sayi");
            }

    }
}
