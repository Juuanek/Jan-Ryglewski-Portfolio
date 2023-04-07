public class Monitor extends Item{

    private String type; //= "monitor";
    private double price; //= 225.25;
    private String size;// = "SMALL";
    private String description; //= "BLACK - 144Hz - LED";

    public Monitor(String type, double price, String size, String description) {
        this.type = type;
        this.price = price;
        this.size = size;
        this.description = description;
    }

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
