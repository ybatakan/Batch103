package day18arraylistpassbyvalue;

public class PassByValue01 {

    public static void main(String[] args) {

        /*
        1)Java, variable'ların orijinal değerlerini korumak ister.
        2)Variable metotlar içinde kullanıldığında, Java metodun içine
        orijinal değer koymaz, o değerin kopyasını üretir ve metoda o kopyayı yollar.
        Metot kopya üstünde değişiklik yapar, dolayısıyla variable'ın
        orijinal değer korunmuş olur. Bu sisteme PassByValoue denir.
        Bazi programlama dilleri orjinal degeri koruma altina almamistir.
        Bu isi developer lara birakmistir. Bu tarz diller "Pass By Reference " kullanir.
        */

        int x=5; //gomlek
        System.out.println(x); //5

        //static method olan psvm un icinde ki hersey statik olmalidir
        change(x); // ogrenci gomlegi

        System.out.println(x); // gomlek

        int ucret=100;
        ucret =indirim(ucret);


        System.out.println(ucret);//100


    }





    // void data uretmez sadece ekrara yazdiri


    public static void change(int a)
    {
        System.out.println(a*3);
    }

    // void disinda ki return typelarda method body si icinde return keyword kullanilmalidir
    public static int indirim(int gomlekUcreti)
    {
        return gomlekUcreti - 10 ;
    }





}
