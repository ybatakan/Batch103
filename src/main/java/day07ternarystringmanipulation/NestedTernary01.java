package day07ternarystringmanipulation;

public class NestedTernary01 {
    public static void main(String[] args) {

        // verilen yilin "leap year '" olup olmadigini kontrol eden kodu yaziniz (artik yil)
        // yil 100 e bolunurse 400 e de bolunmeli /// 100 yuze bolunmezde 4 e bolunmeli ( INTERVIEW SORUSU )


        int year = 2010;

      String leap = year%100==0 ? (year%400==0 ? "leap year" : "leap year degil") : (year%4==0 ? "leap year" : "leap year degil");
        System.out.println(leap);


        /*
        assagidaki kurallara gore passwordun gecerli olup olmadigini kontrol eden kodu yaziniz

        1) 8 veya karakterden fazla karakter warsa ilk harfi i olmali
        2) 8 karakterden az ise ilk harfi K olmalidir
         */

        String pwd = "i2a3ed54" ;

        char ilkHarf= pwd.charAt(0);

        String gecerli = pwd.length()<8 ? (ilkHarf=='K'? "gecerli" : "gecersiz") : (ilkHarf=='i' ? "gecerli" : " gecersiz");
        System.out.println(gecerli);





    }
}
