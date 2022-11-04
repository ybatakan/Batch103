package day10StringManipulations;

public class ForLoop01 {
    public static void main(String[] args) {

        //ekrana 5 kere hi yazdir

        // tekrar li isler icin loop kullaniriz. 1 for  2-while   3-do while   4-for each

//        for( int i= 1; i<6 ; i= i+1 ){
//            System.out.println("hi");
//        }
//
//
//        for (int a=4; a<18; a+=1){   // i=i+3  i+=3
//            System.out.print(a);
//        }
//        for (int a=4; a<10545158; a*=3){
//            System.out.println(a);


        for (int a = 15; a > 5; a -= 1) {
            if (a % 2 == 0) {
                System.out.println(a);
            }

        }
        for (int a = 28; a < 158; a += 1) {
            if (a % 2 != 0) {
                System.out.println(a);
            }

            System.out.println("  ");
            //java yi j*a*v*a ya ceviren kotu yaz


            }
//        String str="java";
//        for (int i=0; i<str.length();i++){
//            System.out.print(str.charAt(i)+"*");
//        }

        //tekrarsiz karakterleri ekrana yazdir

        String y= "hellooooo ali";

        for(int i=0; i<y.length(); i++){

            char c= y.charAt(i);

            if(y.indexOf(c)== y.lastIndexOf(c)){
                System.out.print(c);
            }
        }


    }

}

