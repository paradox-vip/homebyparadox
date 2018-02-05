public class HomeTask1 {
    public static void main(String[] args) {
        double addition = add(5.5, 10.1);
        System.out.println(" Addition " + addition);
        double subtraction = sub(15.8, 8.8);
        System.out.println(" Subtraction " + subtraction);
        double division = dib(subtraction, 4.3);
        System.out.println(" Division " + division);
        double multiplaction = mull(9.8, 5);
        System.out.println(" Multiplaction " + multiplaction);
        double module = mode(10.1, 5.8);
        System.out.println(" Module " + module);
        double avg = avg(8.3, 15);
        System.out.println(" Avg " + avg);
        double pow = pow(2);
        System.out.println(" Pow " + pow);
        double percent = percent(100, 25);
        System.out.println(" Percent " + percent);


    }

    public static double add(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }

    public static double sub(double num1, double num2) {
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

    public static double avg(double num1, double num2) {
        double result = (num1 + num2) / 2;
        return result;
    }

    public static double pow(double num1) {
        double result = num1 * num1;
        return result;
    }

    public static double percent(double num1, double percent) {
        double result = num1 * percent/100;
        return result;
    }
}
