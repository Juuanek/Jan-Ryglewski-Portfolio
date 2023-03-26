public class Main {
    public static void main(String[] args){
        printYearsAndDays(561600 );


    }
    public static void printYearsAndDays(long minutes){
        if (minutes < 0 ){
            System.out.println("Invalid value");
        } else {
            long years = minutes / 525_600;
            long years1 = minutes % 525_600;
            long days = years1 / 1440;
            System.out.println(minutes+" min = "+years+" y and "+days+" d");
        }
    }

}
