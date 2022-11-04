package day03typecastingwrapperscanner;

public class TypeCasting01 {

    // Type Casting; bir numeric data tipini baska bir data tipine cevirmektir.
    // byte<short<int<long<float<double
    // Auto widening; buyukten kucuge, Explicit narrowing; buyukten kucuge

    public static void main(String[] args) {


        //auto widening
        byte age=23;

        int newAge = age;


        // explicit narrowing
        long population=1234;
        int newPopulation= (int)population;



        short numberOfhouse= 798;
        double newNumberofHouse= numberOfhouse;

        float cell= 12.9f;
        byte newcell= (byte) cell;

        System.out.println(newcell); //12gosterir


        int number= 515;
        byte newNumber=(byte) number;

        System.out.println(newNumber); //3 ?  -128...127=> 256, 515/256 kalan 3dur.

        int num= 510;
        byte newNum=(byte) num;

        System.out.println(newNum);  //-2 ?  510/256 kalan 254 byte icinde olmadigi icin kalan -2




    }

}
