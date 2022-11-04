package day05ifstatement;

import java.util.Scanner;

public class IfStatement03 {

    // 2 tane String in birbinine esit olup olmadigini anlamak icin ".equals" kullaniriz
    // eger buyuk harf kucuk harf onemsemesini istemiyorsan ".equalsIgnoreCase" Pazar ve PaZAr aynidir.

    public static void main(String[] args) {

        //example1 kullanicidan gun isimlerini a, o gunu hafta sonu mu hafta icimi oldugunu kullaniciya soyle


        //1.yol

        Scanner input = new Scanner(System.in);
        System.out.println("gun ismi gir");
        String gun = input.next();


        if (gun.equalsIgnoreCase("Pazar")) {
            System.out.println("hafta sonu");
        } else if (gun.equalsIgnoreCase("pazartesi")) {
            System.out.println("haftaici");
        } else if (gun.equalsIgnoreCase("sali")) {
            System.out.println("haftaici");
        } else if (gun.equalsIgnoreCase("Carsamba")) {
            System.out.println("haftaici");
        } else if (gun.equalsIgnoreCase("persembe")) {
            System.out.println("haftaici");
        } else if (gun.equalsIgnoreCase("Cuma")) {
            System.out.println("haftaici");
        } else if (gun.equalsIgnoreCase("Cumartesi")) {
            System.out.println("hafta sonu");
        } else {
            System.out.println("gecerli gun gir");
        }


        //2.yol

        if (gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi")) {
        } else if (gun.equalsIgnoreCase("pazartesi") ||
                gun.equalsIgnoreCase("sali") ||
                gun.equalsIgnoreCase("carsamba") ||
                gun.equalsIgnoreCase("persember") ||
                gun.equalsIgnoreCase("cuma")) {
            System.out.println("hafta ici");
        } else {
            System.out.println("gecerli gun gir");
        }

        // 3.yol
        boolean haftasonu = gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi");

        boolean haftaici = gun.equalsIgnoreCase("pazartesi") ||
                           gun.equalsIgnoreCase("sali") ||
                           gun.equalsIgnoreCase("carsamba") ||
                           gun.equalsIgnoreCase("persember") ||
                           gun.equalsIgnoreCase("cuma");

        if (haftasonu) {
            System.out.println("hafta sonu");
        } else if (haftaici){
            System.out.println("hafta ici");
        } else {
            System.out.println("gecerli gun gir");
        }
    }
}
