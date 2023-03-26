public class GasPoweredCar extends Car{

    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Gas is used to start the engine");
    }

    @Override
    public void drive() {
        runEngine();
        System.out.println("GasPoweredCar starts moving");
    }

    @Override
    protected void runEngine() {
        super.runEngine();
    }


}
