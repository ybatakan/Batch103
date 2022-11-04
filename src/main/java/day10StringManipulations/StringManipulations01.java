package day10StringManipulations;

import java.util.SortedMap;

public class StringManipulations01 {

    public static void main(String[] args) {

        String a="java kolaydir";

        //.startsWith("kola",5) ilk 5 karakterden sonra stringe bakar kola ile basliyorsa true ...
        boolean b =a.startsWith("va",2);
        System.out.println(b);

       String c= a.replaceFirst("a","*");
        //sadece ilk a yi * yapacak
        System.out.println(c);

        String d= a.concat(" anladin mi?");
        System.out.println(d);

        String e= "     yusuf atakan    ";
        System.out.println(e);
        String f=e.trim();
        System.out.println(f);
        // sadece basta ve sonra olan spaceleri siler .... orda dakilere dokunmaz

        String h= "jbvahttreer";
        String i= "yava";

        int k =h.compareTo(i);
        System.out.println(k);

        String n = a.repeat(-5); // a stringini yanyana 3 kere yazar.
        System.out.println(n);
    }






}
