package day06nestedifswitch;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {

        // kullanicidan gun sayisini al ekrana yazdir  1=pazar 2=pazartesi .....
        Scanner input = new Scanner(System.in);
        System.out.println("gun no gir");
        byte gunNo = input.nextByte();

        //if ile cozunuz

        if (gunNo == 1) {
            System.out.println("pazar");
        } else if (gunNo == 2) {
            System.out.println("pazartesi");
        } else if (gunNo == 3) {
            System.out.println("salı");
        } else if (gunNo == 4) {
            System.out.println("Carşamba");
        } else if (gunNo == 5) {
            System.out.println("perşembe");
        } else if (gunNo == 6) {
            System.out.println("cuma");
        } else if (gunNo == 7) {
            System.out.println("cumartesi");
        } else {
            System.out.println("gecerli gun gir");
        }

        // switch ile coz !!

        switch (gunNo){

            case 1:
                System.out.println("pazar");
                break;
            case 2:
                System.out.println("pazartesi");
                break;
            case 3:
                System.out.println("sali");

            case 4:
                System.out.println("carsamba");

            case 5:
                System.out.println("persembe");
                break;
            case 6:
                System.out.println("cuma");
                break;
            case 7:
                System.out.println("cumartesi");
                break;
            default:
                System.out.println("gecerli gun saysi gir");

        }
    }
}