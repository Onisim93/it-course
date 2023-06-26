package lesson6;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[] array = new int[15];
        String[] stringArray = new String[10];


        Random random = new Random();

        for (int i=0; i<array.length; i++) {
            array[i] = random.nextInt(20);
        }

        game(array);

    }


    public static void game(int[] array) {
        System.out.println("Я сгенерировал 15 чисел, попробуй угадать хотя бы одно," +
                " числа находятся в диапазоне от 0 до 100");
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<3;i++) {
            int number = scanner.nextInt();
            if (checkNumber(number, array)) {
                System.out.println("Вы угадали, поздравляем!");
                break;
            }
            else {
                System.out.println("Вы не угадали, кол-во попыток осталось - " + (2 - i));
            }
            if (i == 2) {
                System.out.println("Вы проиграли, попыток больше нет!");
            }
        }

        System.out.println("Игра закончена!");
    }

    public static boolean checkNumber(int number, int[] array) {
        boolean isAlmostGuess = false;
        for (int i=0;i<array.length; i++) {
            if (array[i] == number) {
                return true;
            }
            isAlmostGuess = array[i] - number == 1 || array[i] - number == -1;
        }

        if (isAlmostGuess) {
            System.out.println("Вы были близки!");
        }

        return false;
    }
}
