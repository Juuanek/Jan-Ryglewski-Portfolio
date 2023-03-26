public class Main {
    public static void main(String[] args) {

        int counter = 0;

        for(int i =1; i <=1000;i++){
            if (isPrime(i)){
                counter++;
                System.out.println("Number " + i +" is a Prime number and counter equals = "+ counter);
                if (counter == 20){
                    break;
                }
            }
        }
    }




    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}