package day18arraylistpassbyvalue;

public class Varargs01 {
    public static void main(String[] args) {

        /*
        1)Farkli sayilardaki parametrelerle calisabilen bir method olusturmak isterseniz "varargs" kullanmalisiniz.

        2)"varargs" arka tarafta "Array" kullanir. Bu yuzden varargslarla calisirken,
          Arraylerle calisiyormus gibi davranabilirsiniz.

        3)"varargs" olusturmak icin "<data type>...<varargs ismi>"

        4)Bir method'da varargsin yanında baska bir parametre, varargs en sonda olmak sartıyla kullanilabilir.

        5)Bir methodda birden fazla varargs kullanilamaz.Cunku varargs en sonda olmak zorundadır.Birden fazla
          kullanildiginda en az bir varargs en sonda olmayacaktır. Bu da 4. madde ile celisir.
         */

        int r1 =add(2,3);
        System.out.println(r1);

        int r2 =add(2,3,4);
        System.out.println(r2);






    }

    // iki sayinin toplamini veren method olustur

   // public static int add(int a, int b){
   //    return a+b;
   // }

    // istedigimiz kadar sayinin toplamini veren metodu yaz

    public static int add(int... a){

        int sum=0;
        for(int w: a){
            sum=sum+w;
        }
            return sum;
    }

}
