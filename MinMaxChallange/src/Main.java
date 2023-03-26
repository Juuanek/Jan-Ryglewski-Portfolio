import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1;
        String input2;
        String exit = String.valueOf('q');
        int minNumber = 0;
        int maxNumber =0;
        int number1 = 0;
        int number2 = 0;

        do {

            System.out.println("Enter two numbers, or 'q' to quit");

            input1 = scanner.nextLine();

            input2 = scanner.nextLine();

            if (input1.equals(exit) || input2.equals(exit)){
                break;
            }

            try {

                if (Integer.parseInt(input1) > Integer.parseInt(input2)) {
                    maxNumber = Integer.parseInt(input1);
                    minNumber = Integer.parseInt(input2);
                } else {
                    maxNumber = Integer.parseInt(input2);
                    minNumber = Integer.parseInt(input1);
                }
            } catch (NumberFormatException nfe){
                System.out.println("Not valid data");
                break;
            }


            System.out.println("Actual minumum number: "+minNumber);
            System.out.println("Actual maximum number: "+maxNumber);

        } while (!input1.equals(exit) && !input2.equals(exit));
        System.out.println("quitting a loop");
        System.out.println("The minumum number equals: " + minNumber);
        System.out.println("The maximum number equals: " + maxNumber);
    }
}





