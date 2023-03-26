public class HybridCar extends Car{

    private double avgKmPerLitre;
    private int batterySize;

    public HybridCar(String description, double avgKmPerLitre, int batterySize) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("The electricity and gas is used to start the engine");
    }

    @Override
    public void drive() {
        runEngine();
        System.out.println("Hybrid Car starts moving");
    }

    @Override
    protected void runEngine() {
        super.runEngine();
    }
}
