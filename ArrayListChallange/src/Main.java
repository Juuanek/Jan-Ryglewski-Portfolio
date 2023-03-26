import java.util.*;

import static java.util.Arrays.*;
import static java.util.Collections.reverse;

public class Main {
    public static void main(String[] args) {
        boolean working = true;
        ArrayList<String> originalArray = new ArrayList<>();
        while(working) {

            System.out.println("""
                ----------
                Available actions:
                0 - to shoutdown
                1 - to add items(s) (comma delimited list)
                2 - to remove any item(s) (comma delimited list)
                Enter a number for which action you want to do:
                -----------""");

            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            scanner.nextLine();

            boolean stillWorkingOnIt = true;

            switch (input) {
                case 0 -> {
                    System.out.println("quiting program");
                    working = false;
                }

                case 1 -> {
                    while (stillWorkingOnIt){
                        System.out.println("Type what you want to add to list:(to stop adding write quit)");
                        String arrayInputAdd = scanner.nextLine();
                        if (arrayInputAdd.equals("quit")) {
                            stillWorkingOnIt = false;
                        } else {
                            if (originalArray.contains(arrayInputAdd)){
                                System.out.println("You can't add the same product");
                                continue;
                            } else {
                                String[] items = arrayInputAdd.split(",");
                                for(String i: items){
                                    String trimmed = i.trim();
                                    if(originalArray.indexOf(trimmed) < 0) {
                                        originalArray.add(trimmed);
                                    }
                                }
                            }
                        }
                        originalArray.sort(Comparator.naturalOrder());
                        showOutput(originalArray);
                    }
                }
                case 2 -> {
                    System.out.println("Your list: " + originalArray);
                    while(stillWorkingOnIt){
                        System.out.println("Type what you want to remove from list:(to stop removing write quit)");
                        String arrayInputRemove = scanner.nextLine();
                        if(arrayInputRemove.equals("quit")){
                            stillWorkingOnIt = false;
                        } else {
                            String[] splits = arrayInputRemove.split(",");
                            int[] values = new int[splits.length];
                            originalArray.remove(arrayInputRemove);
                        }
                        showOutput(originalArray);
                    }
                }

            }
        }
    }
    public static void showOutput(ArrayList<String> originalArray){
        System.out.println("Your list: " + originalArray);
        System.out.println("Your lists' length: " +originalArray.size());
    }
}
