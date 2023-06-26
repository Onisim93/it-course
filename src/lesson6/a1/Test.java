package lesson6.a1;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[] array = new int[15];


        Random random = new Random();

        for (int i=0;i<array.length; i++) {
            int rnd = random.nextInt(100);
            array[i] = rnd;
        }

        game(array);
    }

    public static void game(int[] array) {
        System.out.println("Введите число:");

        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<3;i++) {
            int number = scanner.nextInt();
            if (checkNumber(number, array)) {
                System.out.println("Вы угадали, поздравляем!");
                break;
            }
            else {
                System.out.println("Вы не угадали, количество попыток - " + (i+1) + "/3");
            }
        }

        System.out.println("Игра закончена!");


    }

    private static boolean checkNumber(int number, int[] array) {
        boolean result = false;

        for (int i=0;i<array.length;i++) {
            if (array[i] == number) {
                result = true;
            }
        }

        return result;
    }



}
