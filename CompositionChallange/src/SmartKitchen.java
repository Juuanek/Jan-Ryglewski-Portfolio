

public class SmartKitchen {

    private Refrigerator fridge;
    private DishWasher washer;
    private CoffeMaker cofeMaker;

    public SmartKitchen(){
        fridge = new Refrigerator();
        washer = new DishWasher();
        cofeMaker = new CoffeMaker();
    }

    public Refrigerator getFridge() {
        return fridge;
    }

    public DishWasher getWasher() {
        return washer;
    }

    public CoffeMaker getCofeMaker() {
        return cofeMaker;
    }

    public void setKitchenState(boolean fridgeFlag,boolean washerFlag, boolean cofeMakerFlag){
        fridge.setHasWorkToDo(fridgeFlag);
        washer.setHasWorkToDo(washerFlag);
        cofeMaker.setHasWorkToDo(cofeMakerFlag);
    }

    public void doKitchenStuff(){
        fridge.orderFood();
        washer.doDishes();
        cofeMaker.brewCoffee();
    }

    public void addWater(){
        cofeMaker.setHasWorkToDo(true);
    }

    public void pourMilk(){
        fridge.setHasWorkToDo(true);
    }

    public void loadDishwasher(){
        washer.setHasWorkToDo(true);
    }


}
