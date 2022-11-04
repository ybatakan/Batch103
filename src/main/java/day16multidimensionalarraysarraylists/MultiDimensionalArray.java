package day16multidimensionalarraysarraylists;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        // multi dimensanl earray olustur
        // butun sayilari topla

        int arr [][] = {{2,5,1},{32,75},{13,21,43,56}};
        int sum=0;

        for(int[] w: arr){
            for (int k: w){
                sum=sum+k;
            }
        }
        System.out.println(sum);

        // multi dimensional arrayi normal arraya cewir
        //{{2,5,1},{32,75}}==>{ 2 ,5, 1, 32, 75}
        //1) multi dimensional arrayda ki elaman sayisini bulmak lazim cunku

        int brr [][]={{2,5,1},{32,75}};
        int toplam=0;

        for(int[] w: brr){
            toplam= toplam + w.length;
        }

        int crr[]= new int[toplam];

        int idx=0;

        for(int[] w: brr){
            for(int k: w){

            crr[idx]=k;
            idx++;
            }
        }

        System.out.println(Arrays.toString(crr));



    }

}

