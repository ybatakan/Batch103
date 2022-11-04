package day04ifstatement;

import java.util.Scanner;

public class Scanner02 {

    /*char variabla matematik islemlerin de kullanirsaniz java onlari ASCII degerkeri kullarnir.
    basina "" + koymak gerekir

    javada + sembolunun iki anlami war. 1 taplama islemi 2 birlestirme (concatination)
        java once toplama yapar ' yapamazsa birlestirme yapar.
     */

    public static void main(String[] args) {

        // EXAMPLE 1:kullanicidan ilk ve soy ismini al , ilk ve soy isminin ilk harflerini ekrana yansitiniz



      Scanner input = new Scanner(System.in);

        //1.yol
//
//        System.out.println("ilk ismini gir");
//        char ilk = input.next().charAt(0); //Y
//
//        System.out.println("soy ismini gir");
//        char son = input.next().charAt(0); //A
//
//        System.out.println("" +ilk+son);

            //2.yol


        System.out.println("tam ismini gir");
        String tamIsim= input.nextLine();

        char ilkHarf =tamIsim.charAt(0);
        System.out.print(ilkHarf);

        char soyIsimIlkHarfi= tamIsim.split(" ")[1].charAt(0);
        System.out.println(soyIsimIlkHarfi);
    }
}
