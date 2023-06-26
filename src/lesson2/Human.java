package lesson2;

public class Human {
    String name;
    int age;
    int sex;

    double energy = 100.0;

    public void toPet(Cat cat) {
        System.out.println("Человек по имени " + name + " гладит " + cat.nickname);
        cat.meow();
    }

    public void work() {
        System.out.println("Человек по имени " + name + " пошел работать");
        energy = energy - 50.0;
        System.out.println("Энергия равна - " + energy);
    }

    public void eat() {
        System.out.println("Человек по имени " + name + " кушает");
        energy = energy + 10.0;
        System.out.println("Энергия равна - " + energy);
    }

    public void sleep() {
        System.out.println("Человек по имени " + name + " пошел спать");
        energy = energy + 30.0;
        System.out.println("Энергия равна - " + energy);
    }
}
