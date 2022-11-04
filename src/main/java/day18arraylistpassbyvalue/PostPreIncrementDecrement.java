package day18arraylistpassbyvalue;

public class PostPreIncrementDecrement {
    public static void main(String[] args) {

        //post increment
        int a =5;
        int  b = a++;
        System.out.println(b); //5
        System.out.println(a);  //6

        //pre increment
        int c=10;
        int d= ++c;
        System.out.println(d);
        System.out.println(c);

        // post decrement
        int e=20;
        int f= e--;
        System.out.println(f);
        System.out.println(e);

        //pre decrement
         int h=30;
         int i=--h;
        System.out.println(h);
        System.out.println(i);

    }
}
