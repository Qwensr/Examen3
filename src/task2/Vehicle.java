package task2;

public abstract class Vehicle {
   String make;
   int year;

    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
    }
    abstract void start();
    abstract void stop();

}


