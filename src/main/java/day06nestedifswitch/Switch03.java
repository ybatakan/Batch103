package day06nestedifswitch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        /*
        kullanicidan islem ve iki tane sayi alarak basit hesap makinasi yap
         */



        // switch de sadece int byte short char string data kullanilir
        // 3 den fazla durum warsa if yerine switch tercih edilebilir.


        Scanner input = new Scanner(System.in);
        System.out.println("islemi gir +,-,/,*,% ");
        char islem= input.next().charAt(0);

        System.out.println("ilk sayiyi gir");

        double ilk= input.nextDouble();
        double ikinci= input.nextDouble();

        switch (islem){
            case '+':
                System.out.println(ilk+ikinci);
                break;
            case '-':
                System.out.println(ilk-ikinci);
                break;
            case '*':
                System.out.println(ilk*ikinci);
                break;
            case '/':
                System.out.println(ilk/ikinci);
                break;
            case '%':
                System.out.println((ilk*ikinci)/100);
                break;
            default:
                System.out.println("bu islem tanimlanmamistir");
        }
    }
}
