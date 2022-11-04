package day04ifstatement;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

//        System.out.println("ilk ismi gir");
//        String ilkisim = input.next();// next methodu kullanicidan String datasi almak icin kullanilir.
//
//        System.out.println("ikinci ismi gir");
//        String ortaIsim = input.next();
//
//        System.out.println("soy ismi gir");
//        String soyIsim= input.next();
//
//        System.out.println("kimlik numarasini gir");
//        String kimlikNo= input.next();
//
//
//        System.out.println(ilkisim +" " + ortaIsim + " " + soyIsim);
//        System.out.println(kimlikNo);

        //2.yol

        System.out.println("butun isimleri  ve tcno gir");
        String ilk = input.next();
        String orta = input.next();
        String soy = input.next();
        String tc = input.next();
        System.out.println(ilk+" " + orta + " " + soy);
        System.out.println(tc);


        /*
        next() methodu kullanicidan gelein ilk kelimeyi alir
        nextline() tamamini alir
         */

        //3. yol

        System.out.println("ilk orta soy ismi gir");
        String tamIsim = input.nextLine();

        System.out.println(tamIsim);

        System.out.println("kimlik gir");

        String kimlik= input.next();
        System.out.println(tamIsim);
        System.out.println(kimlik);


    }
}
