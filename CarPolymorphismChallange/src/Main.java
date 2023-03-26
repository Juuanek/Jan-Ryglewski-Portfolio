public class Main {
    public static void main(String[] args) {

        Car car = new GasPoweredCar("golf",6.0,4);
        car.drive();
        car.runEngine();
        car.startEngine();

        var newCar = new GasPoweredCar("golf", 5.0, 4);
        newCar.runEngine();

    }
}