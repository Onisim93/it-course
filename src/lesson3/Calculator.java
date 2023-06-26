package lesson3;

public class Calculator {

    public double sum(double number1, double number2) {
        double result = number1 + number2;
        return result;
    }

    public double subtraction(double number1, double number2) {
        double result = number1 - number2;
        return result;
    }

    public double divide(double number1, double number2) {
        return number1 / number2;
    }

    public double multiply(double number1, double number2) {
        return number1 * number2;
    }

    public int degree(int number, int grade) { // number == 3 grade == 3
        int result = number;

        while (grade > 1) {
            result = result * number;
            grade = grade - 1;
        }

        return result;
    }






}
