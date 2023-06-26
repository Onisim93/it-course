package lesson4;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Введенное число положительное.");
        }
        else if (number == 0) {
            System.out.println("Введенное число равно нулю.");
        }
        else {
            System.out.println("Введенное число отрицательное.");
        }

        /*while (number > 0) {
            System.out.println(number);
            number = number - 1;
        }*/

        for (int i = 0; i < 100; i = i + 4) {
            System.out.println(i);
        }

        /*int x = 1;
        x = x + 1;
        x--;*/

        for (int i = 0; i < 13; i++) {
            System.out.println("Привет!");
        }

    }
}
