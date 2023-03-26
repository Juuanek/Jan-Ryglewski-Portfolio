public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1991));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(1111));
        System.out.println(isPalindrome(1294));

    }
    public static boolean isPalindrome( int number){

        int reminder = 0;
        int reverse = 0;
        int originalNumber = number;

        while (number !=0){
            reminder = number % 10;
            reverse =(reverse * 10) + reminder;
            number = number/10;
        }
        System.out.print("Reversed number: " +reverse);
        System.out.print("\t" + "OriginalNumber: " +originalNumber + " Is Palindrome?: ");
        if (reverse == originalNumber) {
            return true;
        } else {
            return false;
        }
    }
}



