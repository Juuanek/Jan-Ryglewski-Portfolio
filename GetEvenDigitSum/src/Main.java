public class Main {
    public static void main(String[] args) {


        System.out.println(getEvenDigitSum(0));


    }


    public static int getEvenDigitSum(int number) {

        int originalNumber = number;
        int reminder = 0;
        int sumOfEvenNumbers = 0;

        if (number >= 0) {
            while (number != 0) {
                reminder = number % 10;
                number = number / 10;
                if (reminder % 2 == 0) {
                    sumOfEvenNumbers += reminder;
                }
            }
        } else {
            return -1;
        }
        return sumOfEvenNumbers;
    }}
