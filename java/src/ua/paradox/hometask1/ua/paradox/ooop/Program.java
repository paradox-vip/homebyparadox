package ua.paradox.hometask1.ua.paradox.ooop;

public class Program {
    public static void main(String[] args) {
        Cat catBoris=new Cat();
        System.out.println(catBoris.age);
        System.out.println(catBoris.name);
        System.out.println(catBoris.sex);
        catBoris.move();
        catBoris.voice();
    }
}
