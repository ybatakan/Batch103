package day11loops;

public class ForLoop02 {
    public static void main(String[] args) {
        //bir string de ki m harfi haric tum karakterleri yazin.

        String str="madam";

        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(ch!='m'){
                System.out.print(ch);
            }
        }

        String yeni= str.replace("m","" );
        System.out.println(yeni);

        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(ch=='m'){
                continue;               // boswer demek
            }
            System.out.println(ch);

            }

        // 1 den 100 e kadar tum tam sayilari yazdiriz. 6 ile bolunenler haric

        for(int i=1; i<=101; i++){

            if(i%6==0){
                continue;
            }
            System.out.print(i+" ");
        }

        System.out.println("  ");


        // m den onceki karakterleri yazdir

        String s= "luxemburg";

        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);

            if(c=='m'){
                break;
            }
            System.out.print(c);
        }

    }
}
