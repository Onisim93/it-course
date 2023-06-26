package lesson5;

public class Test {
    public static void main(String[] args) {
        User roman = new User("Roman", "Roman22@gmail.com", "123456");


        System.out.println(roman);

        roman.setPassword("99999999");
        roman.setEmail("NewEmail@gmail.com");
        roman.setName("Romanium");

        System.out.println(roman);

    }
}
