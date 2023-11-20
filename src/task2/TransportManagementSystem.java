package task2;

public class TransportManagementSystem {
    public static void main(String[] args) {
        Car car = new Car("Nissan GTR ", 2000);
        Bus bus = new Bus("Mercedes ", 2001 );
        Bike bike = new Bike("Bmx ", 2020);


        car.start();
        car.stop();

        bus.start();
        bus.stop();

        bike.start();
        bike.stop();
    }
}
