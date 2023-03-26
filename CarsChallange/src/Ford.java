public class Ford extends Car{

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " --> Engine is starting";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " --> is accelerating";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " --> is breaking";

    }
}
