package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays02 {
    public static void main(String[] args) {

        char arr[][]={{'a','b'},{'C','D','E'},{'?'}};
        System.out.println(Arrays.deepToString(arr));

        // icinde a olan elemanlari consola yazdir
        String brr[][] = { {"learn", "java", "it"}, {"is", "easy"} };
        int counter=0;
        for(String[] w: brr){

            for(String k: w ){

                if(k.contains("a")){
                    counter++;
                    System.out.print(k+" ");
                }
            }
        }
        System.out.println(counter);
    }
}
