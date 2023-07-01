package lesson8;

public class Test {
    public static void main(String[] args) {
        Car ferrari = new Car("Ferrari", "Enzo", 600, "Red", "Sport Car", 15);
        ferrari.go(400.0);

        GasStation station = new GasStation(5000);

        station.fillCar(ferrari, 59);

        ferrari.go(400);
        station.fillCar(ferrari, 59);

        ferrari.go(400);
        station.fillCar(ferrari, 59);

        ferrari.go(400);


    }
}
