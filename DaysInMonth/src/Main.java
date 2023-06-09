public class Main {
    public static void main(String[] args){



        System.out.println(getDaysInMonth(8,2020));
         System.out.println(getDaysInMonth(2,2020));
         System.out.println(getDaysInMonth(2,2018));
         System.out.println(getDaysInMonth(-1,2020));
         System.out.println(getDaysInMonth(1,-2020));
    }

    public static boolean isLeapYear(int year){  // 1=true    2=false
        if (year <=0 || year > 9999){
            return false;
        } else {
            if (year % 4 == 0 && year % 100 != 0){
                return true;
            } else if (year % 400 == 0){
                return true;
            } else {
                return false;
            }

        }
    }
    public static int getDaysInMonth(int month, int year) {



        if (isLeapYear(year)){
            if (month >= 1 && month <= 12 && year >= 1 && year <= 9999) {
                switch (month) {
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        return 31;

                    case 2:
                        return 29;

                    case 4: case 6: case 9: case 11:
                        return 30;

                }
            } else {
                return -1;
            }
        } else if (!isLeapYear(year))
            if (month >= 1 && month <= 12 && year >= 1 && year <= 9999) {
                switch (month) {
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        return 31;

                    case 2:
                        return 28;

                    case 4: case 6: case 9: case 11:
                        return 30;

                }
            } else {
                return -1;
            } return -1;
    }
}





















     /*   if (isLeapYear(year)) {
            if (month >= 1 && month <= 12 && year >= 1 && year <= 9999) {
                switch (month) {
                    case 1: case 3: case 5: case 7: case 10: case 12:
                        System.out.println("31");
                        break;
                    case 2:
                        System.out.println("29");
                        break;
                    case 4: case 6: case 8: case 9: case 11:
                        System.out.println("30");
                        break;
                }
            } else {

            }
        } else {
            System.out.println("-1");
        }

        if (!isLeapYear(year)) {
            if (month >= 1 && month <= 12 && year >= 1 && year <= 9999) {
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 10:
                    case 12:
                        System.out.println("31");
                        break;
                    case 2:
                        System.out.println("28");
                        break;
                    case 4:
                    case 6:
                    case 8:
                    case 9:
                    case 11:
                        System.out.println("30");
                        break;
                }
            } else {
                System.out.println("-1");
            }
        } else {
            System.out.println("-1");
        }
   */// }}
