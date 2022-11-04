package day12loops;

import java.util.Scanner;

public class WhileLoops01 {
    public static void main(String[] args) {

        //3 den 10 kadar sayilari yani satirda yaz

        for(int i=3; i<11; i++){
            System.out.print(i+" ");
        }

        System.out.println();

        int i=3;
    while(i<11){
        System.out.print(i+" ");
        i++;

        System.out.println();
    }

        //Example 2: 17 den 4 e kadar tum cift sayilari ekrana ayni satirda yazdiran kodu yaziniz
         int k=17;
        while(k>3){
        if(k%2==0){
            System.out.print(k+" ");
        }
        k--;

    }

        System.out.println();

        int s=12;
        int sum=0;
        while(s<68)
        {
            sum=sum+s;
            s++;
        }
        System.out.println(sum);


        System.out.println();

        int p=385;
        int toplam=0;
        while(p>0)
        {
            toplam=toplam+p%10;
            p/=10;
        }
        System.out.println(toplam);


        System.out.println();


        Scanner input= new Scanner(System.in);
        System.out.println("sayi gir");
        int m= input.nextInt();

        int y=1;

        while(y<11)
        {
            System.out.println(m+"*"+y+"="+m*y+" ");
            y++;
        }

    }
}
