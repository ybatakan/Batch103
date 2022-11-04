package day02methodcreation;

public class Car {

    public String marka= "Honda";
    public int fiyat= 20000;

    /*

    note: class==> variable ==>object ==> kullanicaz
                        method


     */

    public void hareketEt(){
        System.out.println("honda guzel hareket eder");
    }

    public void dur(){
        System.out.println("honda guvenli durur");
    }

    public static void main(String[] args) {

        //object nasil olusturulur?
        //1)class ismini yaz 2)objeye isim ver  3)=   4)new keywordunu kullan   5)CLass ismi parantezle yaz
                Car             myHonda          =              new                 Car();
        System.out.println(myHonda.fiyat);//20000
        System.out.println(myHonda.marka);//Honda

        myHonda.hareketEt();
        myHonda.dur();

// baska classdan obj olusturabiliriz

        MethodCreation obj= new MethodCreation();
        System.out.println(obj.toplamaYap(3,5));

    }


}
