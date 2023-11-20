package task2;

public class Bus extends Vehicle {
    public Bus(String name, int year) {
        super(name, year);
    }

    @Override
    void start() {
        System.out.println("Я еду в автобусе на  " + make + "Марка автобуса " + year);
    }

    @Override
    void stop() {
        System.out.println("Я остановился ");
    }
}