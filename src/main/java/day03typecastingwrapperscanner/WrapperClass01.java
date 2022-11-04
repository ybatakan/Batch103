package day03typecastingwrapperscanner;

public class WrapperClass01 {

    public static void main(String[] args) {

        /*
        java primitivlere method ekleyerek yeni structre olusturdu. bu yapilara "wrapper class" denir.

            byte ==> Byte
            short ==> Short
            **int ==>Integer
            long ==> Long
            float ==> Float
            double ==> Double
            boolean ==> Boolean
            **char ==> Character

         */


        byte primitiveByte =12;

        // primitiveByte yazip nokta kolununca method gostermez cunku primitiveler method icermez sadece deger icerir.

        Byte wrapperByte =12;  // yazip nokta koyunca bircok method gosterir cunku wrapperlar method icerir.

        // example 1 ; byte data typinin en buyuk ve en kucuk degerlerini ekrana yazdir.

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        // example2 : short, int, long data tiplerinin en buyuk en kucuk degerleri

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);



        //"primitiveler nasil Wrapperlara cevrilir (Autoboxing)

        float f1= 13.99F;

        Float wrapperF1= f1;

        // wrapper lar primitivelere nasil cevrilir ( Unboxing )

        Character w1='s';

        char primitivew1= w1;

        // autoboxing and unboxing automotive yapilir kod yazmaya gerek yoktur.



    }

}
