package day12loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        //while-loop için loop body'si içindeki kodun hiç çalıştırılmama ihtimali vardır.
//do-while-loop'un body'si içindeki kod her halükarda en az bir kere çalışır.

        int i = 1;
        while (i < 1) {
            System.out.println("while loop");
            i++;
        }

        int k = 1;

        do {
            System.out.println("dowhile loop");
            k++;


        } while (k < 1);

        //Example 1: Bir ondalik sayinin ondalik kismindaki rakamlarinin toplamini bulunuz

        double num=24.5673;
        String str=String.valueOf(num);
        System.out.println(num);
        System.out.println(str);
        //String.valueOf() datanin tipini String yapar.
        String yeniStr= str.split("\\.")[1];          //regex noktodan keseceksek "\\." onu 2 ters slash koy
        System.out.println(yeniStr);
        int yeniNum= Integer.valueOf(yeniStr);
        System.out.println(yeniNum+2);

        int sum=0;
        do{

            sum= sum+ yeniNum%10;
            yeniNum= yeniNum/10;

        }while(yeniNum>0);
        System.out.println(sum);



    }
}
