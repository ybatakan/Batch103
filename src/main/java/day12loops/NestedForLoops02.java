package day12loops;

import java.util.Scanner;

public class NestedForLoops02 {
    public static void main(String[] args) {
        //Asagidaki sekli ekrana yazdiran kodu yazinin
        // ****
        // ****
        // ****
        Scanner input = new Scanner(System.in);

        System.out.println("satir sayisi gir");
        int satir = input.nextInt();

        System.out.println("sutun sayisi gir");
        int sutun = input.nextInt();

        System.out.println("karakter sec");
        char ch = input.next().charAt(0);

        for (int i = 1; i <= satir; i++) {
            for (int a = 1; a <= sutun; a++) {
                System.out.print(ch);
            }
            System.out.println();  // alt alta yazdirabilmek icin yaptik.
        }


        /*
    Example 2: Aşağıdaki şekli çizen kodu yazınız.
               1
               1 2
               1 2 3
               1 2 3 4
               1 2 3 4 5
 */


        for (int i = 1; i < 6; i++)
        {
            for (int k = 1; k <= i; k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }

        /*
        Example 3: Asagidaki sekil cizen kodu yaziniz

                    * * * *
                    * * *
                    * *
                    *
            */

        int row=4;

        for(int i=1; i<=5; i++)
        {
          for(int a=5; a>=i; a--){
              System.out.print("a");
          }
            System.out.println();
        }
    }
}