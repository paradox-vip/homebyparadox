public class HomeTask1 {
    public static void main(String[] args) {
        double addition=add(5,10);
        System.out.println("addition"+addition);
        double subtraction=sub(15,8);
        System.out.println(subtraction);
        double division=dib(subtraction,4);
        System.out.println(division);
        double multiplaction=mull(8,5);
        System.out.println(multiplaction);
        double module=mode(2,3);
        System.out.println(module);

    }

    public static double add(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }

    public static double sub(int num1, int num2) {
        double result = num1 - num2;
        return result;
    }

    public static double dib(double num1, double num2) {
        double result = num1 / num2;
        return result;
    }

    public static double mull(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }

    public static double mode(double num1, double num2) {
        double result = num1 % num2;
        return result;
    }
}
