public class Place {

    private String name;
    private int distanceFromSydney;

    public Place(String name, int distance) {
        this.name = name;
        this.distanceFromSydney = distance;
    }

    @Override
    public String toString() {
        return "Place{" +
                "name='" + name + '\'' +
                ", distanceFromSydney=" + distanceFromSydney +
                '}';
    }
}
