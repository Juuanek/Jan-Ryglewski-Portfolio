import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LinkedList<Place> townsSortedByDistance = new LinkedList<>();

        createList(townsSortedByDistance);

        chooseAction(townsSortedByDistance);

    }

    private static void printMenu(){
        System.out.println("""
                Available actions (select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit""");
    }
    public static void createList(LinkedList<Place> townsSortedByDistance){

        townsSortedByDistance.addFirst(new Place("Sydney",0));
        townsSortedByDistance.add(new Place("Melbourne",877));
        townsSortedByDistance.add(new Place("Brisbane",917));
        townsSortedByDistance.add(new Place("Adelaide",1374));
        townsSortedByDistance.add(new Place("Alice Springs",2771));
        townsSortedByDistance.add(new Place("Perth",3923));
        townsSortedByDistance.add(new Place("Darwin",3972));

    }

    public static void chooseAction(LinkedList<Place> townsSortedByDistance){
        boolean stillWorking = true;

        while(stillWorking) {
            boolean stillWorkingOnIt = true;
            printMenu();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

            switch (input){
                case "f","b" -> {
                    System.out.println("Type F or B to go (F)orward and (B)ackwards or (Q) to go back to menu");
                    var iterator = townsSortedByDistance.listIterator();
                    while (stillWorkingOnIt) {
                        String secondInput = scanner.nextLine();
                        if (secondInput.equals("f")) {
                            if(iterator.hasNext()) {

                                System.out.println(iterator.next());

                            }
                        } else if (secondInput.equals("b")){
                            if(iterator.hasPrevious()) {

                                System.out.println(iterator.previous());
                            }

                        } else if (secondInput.equals("q")){
                            stillWorkingOnIt = false;
                        }
                    }
                }

                case "l" -> System.out.print(townsSortedByDistance.toString());
                case "m" -> System.out.println("-----");
                case "q" -> stillWorking = false;
        }

        }
    }
}

