package task2;

public class Car extends  Vehicle{
    public Car(String name, int year) {
        super(name, year);
    }

    @Override
    void start() {
        System.out.println("Я еду на  " + make + "Марка машины " + year);
    }

    @Override
    void stop() {
        System.out.println("Я остановился " );

    }
}
