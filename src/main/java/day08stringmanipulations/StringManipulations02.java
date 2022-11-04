package day08stringmanipulations;

public class StringManipulations02 {

    public static void main(String[] args) {

        //example 1  bir string de space haric kac karakter kukllanildigini gosteren kodu yaz

        String str= "Ali okula gitti.";

       int num =  str.replace(" ","").length();

        System.out.println(num);

        //example 2 bir string de ki tum a harflerini 'A' ya cevir

        String str2 = " Ankaranin tasina gozlerimin yasina bak";

        String newStr2 =  str2.replace("a","A");
        System.out.println(newStr2);

        //ex3 bir string deki tum kara kelimesinin yerine * koy

        String t= " Kara kara dusunme ankara";

        String yenit =t.replace("kara","*");
        System.out.println(yenit);

        //examle 4 bir string deki tum sayilari * a cevir.

        String z= "sg4wg8 wer54g8 we45g8 w454f845";

        String yeniZ= z.replaceAll("[0-9]","*");
        System.out.println(yeniZ);

        /*
    Bir grup data'yı ifade eden kodlara "Regex" denir.
    "Regex" Regular Expressions'in kısaltılmış halidir.

    1)Tüm rakamlar ==> [0-9]
    2)Tüm küçük harfler ==> [a-z]
    3)Tüm büyük harfler ==> [A-Z]
    4)Tüm harfler ==> [a-zA-Z]
    5)Sesli hardler ==> [aeiouAEIOU]
    6)Space ==> [ ]
    7)Tüm rakamlar ve tüm harfler ==>[0-9a-zA-Z]
    8)Tum noktalama isaretleri ==> \\p{Punct}

    1)rakamlar haric tum karakterler ==> [^0-9]
    5)space haric ==> [^ ]
 */

        //Example 5: Verilen bir String de kullanilan noktalama isareti ve rakamlar ve space karakteri haric
//           tum karakterlerin sayisini bulan kodu yaziniz
        String u = "Ali 13 yasinda, dersem inanma!...";

        int sonuc = u.
                replaceAll("[0-9]", "").
                replace(" ", "").
                replaceAll("\\p{Punct}", "").
                length();
        System.out.println(sonuc);


        // example 6  bir passwordun gecerli olup olmadigini kontrol edern kodu yaz
        // space haric en az 8 karakter  .. en az 1 sembol ... en az bir rakam ... en az bir buyuk harf..en az 1 kucuk harf


        String pwd= "1938YA!b";

       boolean first = pwd.replace(" ","").length()>7; //space haric 7 karakter
       boolean second= pwd.replaceAll("[0-9a-zA-Z ]","").length()>0;
       boolean third=  pwd.replaceAll("[^0-9]","").length()>0;
       boolean forth=  pwd.replaceAll("[^A-Z]","").length()>0;
       boolean fifth=  pwd.replaceAll("[^a-z]","").length()>0;

       boolean gecerli = first && second && third && forth && fifth;
       if(gecerli){
           System.out.println("passwordunuz gecerli"+" "+ pwd);
       }else{
           System.out.println("yeni bir sifre giriniz");
       }

       // example 7 noktalama isaretleri haric kac karakter wardir

        String yeterArtik= "sen yapmazsan, ben ?...";
      int yeter= yeterArtik.replaceAll("[^\\p{Punct}]", "").length();
        System.out.println(yeter);

        //example 8 verilen bir string "Al ile basliyor ve x" ile bitiyorsa ekrana harika yazdir
        // aksi halde normal yazdir

        String v = "Alex";

        boolean baslangic = v.startsWith("Al");
        boolean bitis = v.endsWith("x");

       String result= baslangic && bitis ? "harika" : " degil" ;
        System.out.println(result);


    }
}
