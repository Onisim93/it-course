package lesson8;

public class GasStation {
    private double fuelLeft;

    public GasStation(double fuelLeft) {
        this.fuelLeft = fuelLeft;
    }

    public void fillCar(Car car, double requiredFuel) {
        double fuel = 60.0 - car.getFuel();
        if (requiredFuel > fuelLeft) {
            System.out.println("К сожалению, на заправке недостаточно топлива!");
        }

        if (fuel < requiredFuel) {
            System.out.println("Невозможно залить в бензобак требуемое кол-во топлива.");
        }

        else {
            while (requiredFuel > 0) {
                try {
                    Thread.sleep(40);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }

                car.setFuel(car.getFuel() + 1.0);
                fuelLeft--;

                requiredFuel--;
                System.out.println("Текущее кол-во топлива в бензобаке - " + car.getFuel());
            }
            System.out.println("Машина заправлена, Вы можете ехать!");
        }

        System.out.println("Кол-во топлива на заправке - " + fuelLeft + " л");

    }
}
