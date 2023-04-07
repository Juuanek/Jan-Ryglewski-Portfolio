import javax.xml.namespace.QName;
import java.sql.PseudoColumnUsage;

abstract class Item {

    private String type;
    private double price;
    private String size;
    private String description;




    public void salesPrice(double price,String size){
        if (size.equalsIgnoreCase("SMALL")){
            double actualPrice = 2 * price;
            System.out.println("Items' price: " + actualPrice);
        } else if (size.equalsIgnoreCase("MEDIUM")){
            double actualPrice = 4 * price;
            System.out.println("Items' price: " + actualPrice);
        } else if (size.equalsIgnoreCase("LARGE")){
            double actualPrice = 8 * price;
            System.out.println("Items' price: " + actualPrice);
        }
    }


    public void showDescription(){
        System.out.println("Name: " + this.type + " " + "Price: " + this.price);
        System.out.println("Size: " + this.size + " " + "Description: " + this.description);
    }

    @Override
    public String toString() {
        return "Item{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
