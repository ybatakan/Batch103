package day13loopsarrays;

import java.util.Arrays;
import java.util.Collection;

public class Array01 {
    public static void main(String[] args) {

        //array nasil yaziliir
        int stdAges[]=new int[7];

        //array nasil yazdirilir butun array
        System.out.println(Arrays.toString(stdAges));

        //arraya nasil eleman eklenir
        stdAges[1]=11;
        stdAges[0]=12;
        stdAges[2]=13;
        stdAges[3]=14;
        stdAges[4]=10;
        stdAges[5]=12;
        stdAges[6]=12;

        //arrayda ki spesifik eleman nasil cagrilir
        System.out.println(stdAges[4]);

        //EXAMPLE ARRAYDAKI EN KUCUK VE EN BUYUK ELEMANI CAGIRAN KODU YAZ
        Arrays.sort(stdAges);
        System.out.println(Arrays.toString(stdAges));

        // lenght stringlerde () arraylarda parantezsiz kullanilir
        int ilk= stdAges[0];
        int son=stdAges[stdAges.length-1];
        System.out.println(ilk+son);


        //1,yol for loop
        int sum=0;
        for(int i=0; i<stdAges.length; i++)
        {
            sum = sum + stdAges[i];
        }
        System.out.println(sum);

        //2.yol while loop

        int i=0;
        int toplam=0;
        while(i<stdAges.length){
            toplam=toplam+stdAges[i];
            i++;
        }
        System.out.println(toplam);

        //3.yol
        int k=0;
        int s=0;
        do {
            s=s+stdAges[k];
            k++;
        }while (k<stdAges.length);
        System.out.println(s);

        //4.yol FOR EACH LOOP Arraylerda ve collectionslarda kullanilir

        int t=0;
        for(int w: stdAges){
            t=t+w;
        }
        System.out.println(t);

        //Example 3: String bir array olusturunuz
        //           Bu Array'e 5 tane isim yerlestiriniz
        //           Bu isimlerdeki karakter sayilarinin toplamini ekrana yazdiriniz
        String stdNames[] = new String[5];
        stdNames[0] = "Ali";
        stdNames[1] = "Tom";
        stdNames[2] = "Veli";
        stdNames[3] = "Kemal";
        stdNames[4] = "Cem";

        int karakterSayilariToplami=0;

        for(String w: stdNames){
           karakterSayilariToplami= karakterSayilariToplami+w.length();
        }
        System.out.println(karakterSayilariToplami);

        //example 4 char bir array olusturunuz  arraya 5 elaman ekle arrayde ki buyuk harfleri ekrana yazdir

        char ch[]={ 'A', 'c', 'D', 'k', 'M'};

        for(char w: ch){
            if(w>='A' && w<='Z'){
                System.out.println(w);
            }
        }

    }
}
