package lesson1;

public class Lesson1 {

    public static void main(String[] args) {

        // byte может хранить в себе от -128 до 127
        byte number3 = 127;

        // short -32768 до 32767
        short number4 = 31500;

        // int -2147483648 до 2147483647
        int number = 10;

        number = number + 100;

        // long - самый большой контейнер для целых чисел
        long number2 = 1000000000000L;

        // double используется по умолчанию для вещественных чисел.
        double number5 = 15.6;

        // float самый большой тип для хранения вещественных чисел.
        float number6 = 17.7f;

        // boolean хранит в себе два значения true либо false.
        boolean isAlive = true;

        // все символы в char должны быть заключены в одинарные кавычки
        char symbol = 'Ц';

        // все строки должны быть заключены в двойные кавычки.
        String str = "Добро пожаловать!";

        System.out.println(number);


        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.model = "M5";
        bmw.color = "Black";
        bmw.power = 360;




        System.out.println(number3 + number5);



        Car bmwx5 = new Car();
        bmwx5.model = "BMW X5M";
        bmwx5.color = "BLACK";
        bmwx5.power = 250;




    }
}
