package day22inheritancepolymorphism;

public class Mammal extends Animal {

    public int a = 13;
    public int b = 34;

    public void eat() {
        System.out.println("mammal eat");

    }

    public void drink(){
        System.out.println("mamal drink");
    }

    public Mammal(){
        System.out.println("mammal");
    }
}