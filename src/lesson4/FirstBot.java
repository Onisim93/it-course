package lesson4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class FirstBot {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Привет, я твой бот Амиго, а как зовут тебя?");
        String name = scanner.nextLine();
        System.out.println("Приятно познакомиться, " + name + ". Давай пообщаемся.\n");

        int command;

        while (true) {
            showMenu();
            command = scanner.nextInt();
            commandHandler(command);
        }

    }

    public static void showMenu() {
        System.out.println("Я могу выполнять следующие команды:");
        System.out.println("""
                1. Показать время.
                2. Показать дату.
                3. Показать день недели.
                4. Выход
                """);

        /*System.out.println("1. Показать время.\n" +
                "2. Показать дату.\n" +
                "3. Показать день недели.\n" +
                "4. Выход\n");*/
    }

    public static void commandHandler(int command) {
        if (command == 1) {
            System.out.println("Текущее время - " + LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        }
        else if (command == 2) {
            System.out.println("Текущая дата - " + LocalDate.now());
        }
        else if (command == 3) {
            System.out.println("Текущий день недели - " +  LocalDate.now().getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH));
        }
        else if (command == 4) {
            System.out.println("Пока! Я отключаюсь!");
            System.exit(1);
        }
        System.out.println("\n");
    }

}
