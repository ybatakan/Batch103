package day07ternarystringmanipulation;

public class StringManipulations01 {

    public static void main(String[] args) {


        // string class methodlari
    /*

                                        String Class Methodlari

1)equals(): i)Iki tane String'in ayni olup olmadigini anlamamiza yarar.
            ii)equals() method'u "boolean" return eder.

2)equalsIgnoreCase(): i) Iki tane String'in ayni olup olmadigini buyuk harf kucuk harfe dikkat etmeden anlamamiza yarar.
                      ii) equalsIgnoreCase() method'u "boolean" return eder.

3)toLowerCase(): i)Bir String'deki tum harfleri kucuk harfe cevirmek icin kullanilir.
                 ii) toLowerCase() method'u "String" return eder

4)toUpperCase(): i)Bir String'deki tum harfleri buyuk harfe cevirmek icin kullanilir.
                 ii) toUpperCase() method'u "String" return eder

5)charAt(): i) Bir String'den belli bir index'deki characteri almak icin kullanilir.
             ii) charAt() method'u "char" return eder.

6)length(): i) Bir String'de kac tane character kullanildigini ogrenmek icin kullanilir
            ii) length() method'u "int" return eder.

7)contains(): i)Bir String'de belli bir characterin veya characterlerin var olup olmadigini anlamak icin kullanilir
              ii) contains() method'u "boolean" return eder.

8)split(): i)Bir String'i istedigimiz character'den parcalamaya yarar
           ii)split() method'u "Array" return eder.

     */



  /*
   bir passwordun gecerli olup olmadigini assagidaki kurallara gore kontrol eden kodu yaz
   min 8 karakter
   space karakter icermemeli
   ilk harfi  "m veya M'" olmali
   son karakteri ? olmali

   */

        String sifre= "manisa12?";

        boolean first = sifre.length()>7;  // min 8 karakter mi?  true !

        boolean second =! sifre.contains(" ");

        boolean third = sifre.charAt(0)=='M' || sifre.charAt(0)=='m';

        boolean forth=  sifre.charAt(sifre.length()-1)=='?';

        System.out.println(first && second && third && forth);




    }

}
