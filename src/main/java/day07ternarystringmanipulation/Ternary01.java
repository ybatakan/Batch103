package day07ternarystringmanipulation;

public class Ternary01 {
    public static void main(String[] args) {

        //example1; bir sayinin pozitif oliup olmadigini oldugunu ekrana yazdiran kodu yaziniz

        int a= 0;
        if(a>0){
            System.out.println("pozitif");
        } else if (a<0){
            System.out.println("pozitif degil");
        }else {
            System.out.println("sayi sifir");
        }

        //2 yol. ternary

       String sonuc =  a>0 ? "pozitif" : "pozitif degil";
        System.out.println(sonuc);


        //example 2 iki sayidan kucuk olani secen kodu yaz'

        int b= 12;
        int c= 23;

            int kucukSayi = b<c ? b : c;
        System.out.println(kucukSayi);

        //example 3 verilen bir sayinin  mutlak degerini hesaplayan kodu yaziniz

        int d= -45;
        int mutlakd = Math.abs(d);  //
        System.out.println(mutlakd);  //

       int abs = d<0 ? -1*d : d;
        System.out.println(abs);

        // example 4 iki sayi ayni isaretli ise sayilari carp farkli isaretli ise "islem yapamam mesaji ver"

        int e=12;
        int f=-10;

       Object islem = (e>0 && f>0) || (e<0 && f<0) ? e*f : "islem yapamam";      // e*f>0 yaparsak ne olur ?
        System.out.println(islem);

        // turnery farkli data tiplerinde sonuc return ederse sonucun data tipini object yapiniz
        // javada her classin bi atasi wardir object class haric.
    }
}
