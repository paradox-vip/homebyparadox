package ua.paradox.hometask1;

public class Main {
    public static void main(String[] args) {
int addition=add(5,10);
        System.out.println("addition"+addition);
int subtraction=sub(15,8);
        System.out.println(subtraction);
int division=dib(subtraction,4);
        System.out.println(division);
int multiplaction=mull(8,5);
        System.out.println(multiplaction);
int module=mode(2,3);
        System.out.println(module);

    }

    public static int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    public static int sub(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    public static int dib(int num1, int num2) {
        int result = num1 / num2;
        return result;
    }

    public static int mull(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    public static int mode(int num1, int num2) {
        int result = num1 % num2;
        return result;
    }
}
