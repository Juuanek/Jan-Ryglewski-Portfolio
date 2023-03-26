public class Main {
    public static void main(String[] args) {

        SmartKitchen smartKitchen =  new SmartKitchen();

        smartKitchen.getCofeMaker().setHasWorkToDo(true);
        smartKitchen.getFridge().setHasWorkToDo(true);
        smartKitchen.getWasher().setHasWorkToDo(true);

        smartKitchen.getCofeMaker().brewCoffee();
        smartKitchen.getWasher().doDishes();
        smartKitchen.getFridge().orderFood();

        System.out.println("-------");

        smartKitchen.setKitchenState(true,false,true);
        smartKitchen.doKitchenStuff();

        System.out.println("-------");

        smartKitchen.addWater();
        smartKitchen.pourMilk();
        smartKitchen.loadDishwasher();

        smartKitchen.getFridge().orderFood();
        smartKitchen.getWasher().doDishes();
        smartKitchen.getCofeMaker().brewCoffee();




    }
}

