package day27exceptions;

public class Exceptions01 {
    public static void main(String[] args) {

        String a="14775675666756567567567";
        String b="485257565";
        double d1= compare(a,b);
        System.out.println(d1);

    }

    public static double compare (String s, String t){
        return s.length()/t.length();
    }

}
