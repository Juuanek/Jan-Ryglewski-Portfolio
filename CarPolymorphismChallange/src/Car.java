public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("engine has started");
    }

    public void drive(){
        System.out.println("the"+ getClass().getSimpleName() + "starts to run Engine");
        runEngine();
    }

    protected void runEngine(){
        System.out.println("the engine is running");
    }

}
