package day08stringmanipulations;


import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {

        // kullanicidan isim al ilk son harf yazdir

        Scanner input = new Scanner(System.in);
//        System.out.println("isim gir");
//        String isim= input.next();
//
//        char ilkHarf = isim.charAt(0);
//
//        char sonHarf = isim.charAt(isim.length()-1);  // dynamic code her durumda calisan code . hard code iyi olmayan code
//
//
//        System.out.println(""+ilkHarf+sonHarf);
//
//        //2. yol
//
//        String newIsim = isim.toUpperCase();
//
//        String ilk =newIsim.substring(0,1);
//        String son =newIsim.substring(isim.length()-1);
//
//        System.out.println(ilk+son);
//
//
//
//        // verilen stringdeki tum hayvan isimlerini ekrana yazdiriniz
//        // ben kedi sen tavuk fettah sever essek
//
//        String str="ben kedi, esim tavuk, oglum sever inek";
//
//        String kedi = str.substring(4,8);
//        String tavuk= str.substring(15,20);
//        String inek= str.substring(34);               // (34, 38); de olur
//
//        System.out.println(kedi+tavuk+inek);
//
//        //1)substring(baslangic indexi, bitis indexi) String'in ortasindan bir parca almaya yarar
//        //2)substring(baslangic indexi) String'in verilen index'ten sonuna kadar almaya yarar
//
//
//        // example 3 ilk isim ve soy isim iceren isimlerden ilk ve soy isimlerin bas harflerini ekrana yazdir

        System.out.println(" ilk soy isim gir");

        String tamIsim= input.nextLine();

        String onAd =  tamIsim.substring(0,1);

        String ortaAd =tamIsim.split(" ")[1].substring(0,1);

        String sonAd= tamIsim.split(" ")[2].substring(0,1);

        System.out.println(onAd+ortaAd+sonAd);






    } // main method

}  // class
