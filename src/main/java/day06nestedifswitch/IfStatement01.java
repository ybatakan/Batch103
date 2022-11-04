package day06nestedifswitch;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {

        //Type a code, get age from user and decide which stage on it
        //0 - 4 => baby
        //5 - 12 => child
        //13 - 20 => teenager
        //21 - 30 => adult
        //else (not expected age)

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen yas giriniz");
        byte yas = input.nextByte();

        if (yas < 0) {
            System.out.println("gecerli yas giriniz");
        } else if (yas <5) {
            System.out.println("bebek");
        } else if (yas <13) {
            System.out.println("cocuk");
        } else if (yas <= 20) {                         //java dogruyu bulduktan sonra devamini okumuyor.
            System.out.println("genc");
        } else if (yas <= 30) {
            System.out.println("yetiskin");
        } else {
            System.out.println("tanimlanmamis evre...");
        }
    }

}
