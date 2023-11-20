package task2;

public class Bike extends Vehicle {
    public Bike(String name, int year) {
        super(name, year);
    }

    @Override
    void start() {
        System.out.println("Я катаюсь на  " + make + "Марка велосипеда " + year);
    }

    @Override
    void stop() {
        System.out.println("Я остановился ");
    }
}