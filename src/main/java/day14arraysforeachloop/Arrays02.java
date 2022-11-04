package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays02 {
    public static void main(String[] args) {


        //ex [0, 2 ,3 ,0 12, 0 ] sifilari sona koy

    int original[]={0,2,3,0,12,0};
    int yeni []= new int[original.length];

    int idx=0;

    for( int i=0; i< original.length; i++){

        if(original[i] !=0){
            yeni[idx]=original[i];
            idx++;
        }

    }
        System.out.println(Arrays.toString(yeni));

        // arrayin icinde eleman war mi yok mu kontrol et kac kere tekrarlandigini gostert

        int arr[]= {2,1,2,-3,2};

        int eleman=2;
        int counter=0;

        for(int w: arr) {

            if (w == eleman) {
                counter++;
            }
        }

        if(counter>0){
            System.out.println(eleman + " arrayda"+ counter + "defa war");
        }


        //en uzun kelimeyi bul

        String str="java kolaydir calisana, ne kolay ki calismayana.";
        str=str.replaceAll("\\p{Punct}","");
        System.out.println(str);
        String word [] = str.split(" ");
        System.out.println(Arrays.toString(word));
        Arrays.sort(word, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(word));

        System.out.println(word[word.length-1]);
    }
}
