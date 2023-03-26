import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputThenPrintSumAndAvarage();

    }
    public static void inputThenPrintSumAndAvarage(){
        Scanner scanner = new Scanner(System.in);
        String input;
        int sum=0;
        double avg=0;
        long avarage = 0;
        int number;
        double countloop =0;


        do {
            input = scanner.nextLine();
            try{
                number = Integer.parseInt(input);

            } catch (NumberFormatException nfe){
                break;
            }
            sum += number;
            countloop++;
            avg = sum / countloop;
            avarage = Math.round(avg);



        } while (true);
        System.out.println("SUM = "+ sum + " AVG = "+ avarage);
    }
}