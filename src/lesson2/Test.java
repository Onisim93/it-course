package lesson2;

public class Test {
    public static void main(String[] args) {
        Human alexei = new Human();
        alexei.name = "Alexei";
        alexei.age = 35;
        alexei.sex = 0;

        Cat vaska = new Cat();
        vaska.nickname = "Vaska";
        vaska.color = "Brown";
        vaska.age = 2;

        alexei.toPet(vaska);

    }
}
