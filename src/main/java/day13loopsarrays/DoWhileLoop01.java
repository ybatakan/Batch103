package day13loopsarrays;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        // kullanicidan bir sayi al ,100den kucuk ise ekrana kazandin yazdiriniz

        Scanner input= new Scanner(System.in);



//       int sayi=0;
//
//        do{
//            System.out.println("bir sayi giriniz");
//             sayi= input.nextInt();
//
//            if(sayi<100)
//            {
//                System.out.println("kazandiniz");
//            }
//        }while(sayi<100);
//        System.out.println("kaybettiniz");
//
//
//        System.out.println();
//

        do {
            System.out.println("ismini gir");
            char ilkHarf = input.next().charAt(0);

            if (ilkHarf >= 'A' && ilkHarf <= 'Z') {
                System.out.println("duzgun girdin aferin");
            } else {
                System.out.println("yanlis girdin simini");

                break;
            }
        }while (true);





    }
}
