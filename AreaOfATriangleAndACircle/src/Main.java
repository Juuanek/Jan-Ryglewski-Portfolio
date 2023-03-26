public class Main {
    public static void main(String[] args){

        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0,4.0));
        System.out.println(area(-1.0,4.0));
    }


    public static double area(double radius){   //area of a circle
        if (radius <=0){
            return -1;
        } else{
            double areaOfACircle = radius * radius * Math.PI;
            return areaOfACircle;
        }

    }
    public static double area(double x, double y){    // area of a triangle
        if (x <= 0 || y <=0){
            return -1;
        } else{
            double areaOfARectangle = x*y;
            return areaOfARectangle;
        }
    }
}
