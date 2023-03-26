import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = 1;
        int totaledNumber = 0;



        while (number <= 5) {
            System.out.println("Enter number #" + number);
            String enteredNumber = scanner.nextLine();
            try {
                int nextNumber = Integer.parseInt(enteredNumber);
                number++;
                totaledNumber = totaledNumber + nextNumber;
            } catch (NumberFormatException notInt) {
                System.out.println("enter valid int");
            }

        }
        System.out.println("Sum of 5 number in total: " +totaledNumber);
    }}

