public class Main {
    public static void main(String[] args) {


        System.out.println(hasSameLastDigit(90,99,999));





    }


    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber){

        if (isValid(firstNumber) && isValid(secondNumber) && isValid(thirdNumber)){

            int rightDigitOfFirstNumber = 0;
            int rightDigithOfSecondNumber = 0;
            int rightDigitOfThirdNumber = 0;
            do {
                rightDigitOfFirstNumber = firstNumber % 10;
                rightDigithOfSecondNumber = secondNumber % 10;
                rightDigitOfThirdNumber = thirdNumber % 10;
                thirdNumber = thirdNumber /10;
                System.out.println(rightDigitOfFirstNumber);
                System.out.println(rightDigithOfSecondNumber);
                System.out.println(rightDigitOfThirdNumber);

            } while (thirdNumber == 0);

            if (rightDigithOfSecondNumber == rightDigitOfFirstNumber || rightDigithOfSecondNumber == rightDigitOfThirdNumber){
                return true;
            } else if (rightDigitOfThirdNumber == rightDigitOfFirstNumber){
                return true;
            } else {
                return false;
            }
        } else {
            return false;

        }



    }

    public static boolean isValid(int number){
        if (number >= 10 && number <= 1000){
            return true;
        } else {
            return false;
        }
    }
}



