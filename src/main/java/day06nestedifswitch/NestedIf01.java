package day06nestedifswitch;

public class NestedIf01 {
    public static void main(String[] args) {

        /*
        password un ilk harfi buyuk harf ise
        'A' olursa gecerli , aksi halde gecersiz
        passwordun ilk harfi kucuk harf ise
        'z' olursa gecerli pass work aksi halde gecersiz
         */

        // java nested kodlari yazarken cok zaman harcar . mumkunse kullanma


        String pwd = "1xy12!";

        char ilkHarf = pwd.charAt(0);

        if (ilkHarf >= 'A' && ilkHarf <= 'Z') {


            if (pwd.charAt(0) == 'A') {
                System.out.println("gecerli password");
            } else {
                System.out.println("gecersiz password");
            }
        } else if (ilkHarf >= 'a' && ilkHarf <= 'z') {


            if (ilkHarf == 'z') {
                System.out.println("gecerli password");
            } else {
                System.out.println("gecersiz password");
            }
        } else {
            System.out.println("ilk karakter harf olmalidir");

        }

    }
}