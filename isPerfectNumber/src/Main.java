public class Main {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(2000));
        System.out.println(isPerfectNumber(23));
        System.out.println(isPerfectNumber(2));
        System.out.println(isPerfectNumber(10));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(11));
        System.out.println(isPerfectNumber(6));

    }
    public static boolean isPerfectNumber(int number){
        if (number <1){
            return false;
        } else {
            int temp = 0;
            for(int i = 1; i<=number;i++){
                if (number % i == 0 && i != number){
                    // System.out.print(i + " ");
                    temp += i;
                }
            }
            if (temp == number){
                return true;
            } else {
                return false;
            }
        }}
}

