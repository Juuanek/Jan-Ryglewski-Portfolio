public class Main {
    public static void main(String[] args) {


        System.out.println(sumFirstAndLastDigit(-5));


    }
    public static int sumFirstAndLastDigit(int number){

        int firstDigit = 0;
        int lastDigit = 0;
        int originalNumber = number;

        while (number !=0){
            firstDigit = number % 10;
            number = number / 10;
            lastDigit = originalNumber % 10;

        }
        if (originalNumber >=0 ){
            return firstDigit + lastDigit;
        } else {
            return -1;
        }
    }}