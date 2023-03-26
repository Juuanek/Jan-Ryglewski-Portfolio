public class Main {
    public static void main(String[] args) {


        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        car.accelerate();
        car.brake();

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        mitsubishi.accelerate();
        mitsubishi.brake();

        Ford ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        ford.accelerate();
        ford.brake();

        Holden holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        holden.accelerate();
        holden.brake();

    }

}