package ua.paradox.hometask1.ua.paradox.lessontask6;

public class CyclesElementary {
    public static void main(String... args) {
        for (int i = 1; i < 10; i++) {
            for (int k = 1; k < 10; k++) {
                System.out.print(k * i + "  ");
            }
            System.out.println("");
        }
    }
}