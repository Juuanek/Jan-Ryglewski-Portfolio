public class Ball extends Item{

    private String type; //= "ball";
    private double price; //= 5.5;
    private String size; //= "MEDIUM";
    private String description;// = "Handball - hand size 3 - red";


    public Ball(String type, double price, String size, String description) {
        this.type = type;
        this.price = price;
        this.size = size;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    public String getDescription() {
        return description;
    }
    @Override
    public void showDescription(){
        System.out.println("Name: " + this.type + " " + "Price: " + this.price);
        System.out.println("Size: " + this.size + " " + "Description: " + this.description);
    }

    @Override
    public String toString() {
        return "Item{" +
                "type='" + this.type + '\'' +
                ", price=" + this.price +
                ", size='" + this.size + '\'' +
                ", description='" + this.description + '\'' +
                '}';
    }
}
