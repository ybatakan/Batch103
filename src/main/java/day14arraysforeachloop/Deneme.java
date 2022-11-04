package day14arraysforeachloop;

import java.util.Arrays;

public class Deneme {
    public static void main(String[] args) {

        //2 0 7 5 7 0 8 0  sifirlar sona gitsin

        int arr []={2,0,7,5,7,0,8,0};
        int yeni[]= new int[arr.length];

            int idx=0;

        for(int i =0; i< arr.length; i++){

            if(arr[i] !=0){

                yeni[idx]=arr[i];
                idx++;

            }



        }

        System.out.println(Arrays.toString(yeni));
        System.out.println(Arrays.toString(arr));

    }
}
