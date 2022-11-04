package day09stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {
        String  str = "Java is easy";

        //indexOf methodu herzaman int verir.

        //indexOf() verlilen characterlerin ilk gorunumunun indexini verir.
        int idxA = str.indexOf("a");
        System.out.println(idxA);

        //lastIndexOf() iki parametre ile kullanilirsa ikinci parametrede verilen sayiyi
        //index olarak kabul edip en bastan bu indexe kadar olan karaktereleri kutu icine alir
        // ve son

        String m= "hello everyone!";
        int e =m.lastIndexOf("e",7);
        System.out.println(e);



        int idxA2= str.lastIndexOf("a");
        System.out.println(idxA2);


        String s = "Mississippi";
        int idxI =s.indexOf('i'); // indexOf() hem string hem char ile kullanilir
        System.out.println(idxI);
        int idxIss1=s.indexOf("iss");  // ilk gorunumun ilk karakterinin indexini verir
        System.out.println(idxIss1);

        int idxIss2=s.lastIndexOf("iss");   // son gorunum ilk karakterinin indexini verir
        System.out.println(idxIss2);

        //example 1 : bir string deki  tekrarli veya tekrarsiz olup olmadigini gosteren kodu yaziniz

        String t = "Helloooo";
        char c ='o';

        if(t.indexOf(c)==t.lastIndexOf('c')){
            System.out.println("tekrarsiz");
        }else{
            System.out.println("tekrarli");
        }

        String u= "Learn java earn money";

        // indexOf iki parametre ile kullanilirsa ikinci parametrede verilen sayi kadar karakteri gectikten sonra
        // istenen karakterin ilk gorunumunun indexini return eder.

         int sonuc= u.indexOf("e",4); // ilk 6 karaktere bakma
        System.out.println(sonuc);

        int sonuc2 =u.lastIndexOf("a",5);  //?
        System.out.println(sonuc2);

        String v= " ";

        //.isEmpty() bir stringin bos olup olmadigini kontrol eder. eger string de hic karakter yoksa
        // boolean return eder

        String x =" ";

        boolean x1= x.isBlank();
        System.out.println(x1);

        boolean bosMu= v.isEmpty();
        System.out.println(bosMu);

        //isBlank() bos ve space icin true alirsin
        //isEmpty () space icin false verir


        //example2 kullanicidan alinan isim mutlaka space den farkli en az 1 karakter icermelidir.

        Scanner input = new Scanner(System.in);
        System.out.println("ilk isim gir");
        String ilk= input.nextLine();

        if(ilk.isBlank()){
            System.out.println("sana ismini gir dedim at kafasi");
        }else{
            System.out.println(ilk+ ":)");
        }



    }

}
