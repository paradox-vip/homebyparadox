package ua.paradox.hometask1.ua.paradox.ooop;

public class Program {
    public static void main(String[] args) {
        Cat cst = new Cat();
        Dog dog = new Dog();
        Bird bird = new Bird();
        Pet[]pets=new Pet[]{cst,bird};
        for (Pet myLovePet: pets){
            myLovePet.move();
        }
    }
}
