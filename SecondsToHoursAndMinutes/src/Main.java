public class Main {
    public static void main(String[] args){

        getDurationString(-65,45);
        getDurationString(65,145);
        getDurationString(-3945);

//  1min=60sec    1hour=60min     1hour=3600sec
    }
    public static void getDurationString(int seconds){
        if (seconds >=0 ){
            int hours = seconds / 3600;
            int hours1 = seconds % 3600;



            int minutes = hours1 / 60;
            int minutes1 = hours1 % 60;


            int seconds1 = minutes1;

            System.out.println(hours+"h "+ minutes + "m " + seconds1 + "s");

        } else {
            System.out.println("Wrong input");
        }


    }
    public static void getDurationString(int minutes,int seconds){
        if ( minutes >= 0 && seconds >=0 && seconds <=59){
            seconds = (minutes*60) + seconds;
            getDurationString(seconds);

        } else {
            System.out.println("Wrong input");
        }

    }

}