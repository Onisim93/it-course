package lesson8;

public class Car {
    private String brand;
    private String model;
    private int power;
    private String color;
    private String typeBody;

    private double fuel;

    private double serviceInterval;

    private boolean isTOPass;

    private double distanceTraveled;

    private int fuelConsume;


    public Car(String brand, String model, int power, String color, String typeBody, int fuelConsume) {
        this.brand = brand;
        this.model = model;
        this.power = power;
        this.color = color;
        this.typeBody = typeBody;
        this.fuel = 60.0;
        this.fuelConsume = fuelConsume;
        this.serviceInterval = 100;
        this.distanceTraveled = 0;
        this.isTOPass = true;
    }

    public void go(double dist) {
        if (fuel <= 0) {
            System.out.println("Машина никуда не едет. Нет топлива! Заправьте!");
        }
        else {
            double distanceTraveled = 0;

            if (this.distanceTraveled >= serviceInterval) {
                isTOPass = true;
                System.out.println("Вы должны срочно явиться на ТО в сервис!");
            }

            while (dist > 0) {
                double fuelOnKm = fuelConsume/100.0;

                if (fuel < fuelOnKm) {
                    System.out.println("Топливо закончилось. Осталось до точки назначения - " + dist + "км.");
                    break;
                }
                try {
                    Thread.sleep(10);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                fuel = fuel - fuelOnKm;
                dist--;
                distanceTraveled++;
                this.distanceTraveled++;

                System.out.println("машина проехала - " + distanceTraveled + " км.");
            }

            if (dist <= 0) {
                System.out.println("Мы успешно достигли точки назначения.");
                System.out.println("Топлива осталось - " + (int)fuel + " л.");
            }
        }
    }

    public void stop() {
        System.out.println("машина останавливается");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public String getColor() {
        return color;
    }

    public String getTypeBody() {
        return typeBody;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
}
