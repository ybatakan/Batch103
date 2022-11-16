package day26exceptions;

public class Exceptions01 {
    public static void main(String[] args) {

        String str = "123";
        int result = convertStringtoInteger(str);
        System.out.println(result + 5);

        String st = "1a2b";
        int result2 = convertStringtoInteger(st);
        System.out.println(result2 + 10);

    }

    public static int convertStringtoInteger(String str) {
        int i = 0;
        try {
            i = Integer.valueOf(str);
        } catch (NumberFormatException e) {
            System.out.println("yanlis giris");

        }

        return i;
    }
}