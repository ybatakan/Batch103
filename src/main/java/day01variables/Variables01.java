package day01variables;

public class Variables01 {

    //variable nasil olusturulur?

  //  1)Access Modifier, 2)data type, 3)variable ismi, 4)=, 5)deger 6);
    // java da noktali virgul ingilizce de ki nokta gibidir
    // ingilizce de cumle deriz javada statement deriz

    // "=" sembolu assigment operator olarak adlandirilir
    // "=" sagdaki degeri soldaki variable in icine atar.

    public int age = 13;

    public int height = 183;

                            //java da data tipleri

    /*

                                    Primitive Data Types

    1) int: tam sayi   (32bit kullanir)
            javada tam sayilarin basi ve sonu wardir en kucuk int = -2147483648
                                                      en buyuk int = 2147483647
          sebebi memory de cok yer kaplamasin.

    2) byte : tam sayilar icin kullanilir  (8 bit kullanir)
               en kucuk byte= -128
               en buyuk byte= 127
         eger byte yeterliyse int kullanmaya gerek yok , daha az alan kaplariz.

    3) short : tam sayilar icin   (16 bit kullanir)
                en kucuk short = -32768
                en buyuk short = 32767

    4) long  : tam sayilar icin. "int" in yetmedigi durumlarda kullanilir. (64 bit kullanir)

    5) float:   onladikli sayilar icin  (32bit)
                virgulden sonra 7 basamak icerir
                " float degerlerinde sona kucuk f yada F koymak gerekior.

    6) double:  ondalikli sayilar icin  (64 bit )
                virgulden sonra 16 basamak icerir.
                genelde double kullanacaz


    7) boolean: true veya false degerleri icin kullanilir. (1 bit )

    8) char: tek karakterler icin kullanilir (16 bit)
              A,c,2,?,_,.....
              *note; charlara deger verirken degeri tek tirnak arasina koy yoksa hata verir.





    note:  numeric data  types : byte<short<int<long<float<double
            numeric olmayan : boolen-char


            Non-Primitive Data Types

  1) String: isim, adress , kimlik numarasi vs 1 yada fazla karakter iceren degerlede kullanilir.
             mutlaka cift tirnak arasina konulmali ""
             String olusturdugumuzda java bir suru method verir.
             iclerinde methodlar barindirir





             Primitive ve non primitive arasinda ki farklar ( interview sorusu )
             1) non-primitive data tiplerinde degerin yaninda  methodlar vardir.
                primitivelerde ise sadece deger wardir. method yoktur.
             2) primitive data tipleri java tarafindan olusturulmustur toplam 8tanedir, extradan olusturamayiz.
                non-primitiveler java tarafindan olusturulmustur ama bizde olusturabiliriz. sayilamayacak kadar coktur.
                her developer non-p olurturabilir
             3) primitive data tipleri kucuk harflerle baslar. non-p buyuk harfle baslar.
             4) primitive data tipleri memoride farkli buyuklukte yerler kullanir
                non-p ayni buyuklukte yer kaplar












     */


    public byte price = 127;
    public short population = 25000;

    public float priceofshirt = 13.99F;
    public double weight = 0.005487198;


    public long worldpopulation = 70000000000L;
    // long dedik ama int kabul etti o yuzden sonuna L koymak gerek. int araliginin disindaysa L koy

    public long x = 1234;
    // burada L koymadigimiz halde problem yok cunku 1234 int araliginda

    public boolean isOld= true;
    public boolean isRich= false;

    public char initial = 'S';




    // main method arabanin motoru gibidir main methodsuz program olmaz hicbirsey calismaz
    public static void main(String[] args) {
        String name = "Tom Hanks";
    name.length();

    }








}
