package lesson3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        greeting();

        Calculator calc = new Calculator();
        double d = calc.sum(10.67, 15.22);
        System.out.println(d);
        testCase(8);
    }

    public static void testCase(int number) { // number == 33
        int result = 0;
        while (number >= 0) {
            System.out.println(result);
            number = number - 1;
            result = result + 1;
        }
    }

    public static void greeting() {
        System.out.println("Введите Ваше имя:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Приветствуем, " + name + "!");
    }
}
