import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class main {
    public static void main(String[] args) {

        ArrayList<Item> productList = new ArrayList<>(500);

        Ball ball = new Ball("ball", 5.5, "MEDIUM", "Handball - hand size 3 - red");
        ball.showDescription();
        ball.salesPrice(5.5, "MEDIUM");

        System.out.println("--------");

        Car car = new Car("car", 1000.00, "LARGE", "Mercedes w123 - 2003 - blue");
        car.showDescription();
        car.salesPrice(1000.00, "LARGE");

        System.out.println("--------");

        Monitor monitor = new Monitor("monitor", 225.25, "SMALL", "BLACK - 144Hz - LED");
        monitor.showDescription();
        monitor.salesPrice(225.25, "SMALL");

        System.out.println("--------");


        addItem(productList,ball);
        addItem(productList,car);
        addItem(productList,monitor);

        System.out.println("--------");

        displayDetails(productList);

        System.out.println("--------");




    }



    public static void displayDetails(ArrayList<Item> productList){
        System.out.println(Arrays.toString(productList.toArray()));
    }
    public static void addItem(ArrayList<Item> productList,Item item){
        productList.add(item);
        System.out.println(Arrays.toString(productList.toArray()));
    }


}