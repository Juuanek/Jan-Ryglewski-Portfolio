public class Main {
    public static void main(String[] args) {
        getBucketCount(0.75,0.75,0.5,0);



    }

    public static int getBucketCount(double width, double height,double areaPerBucket, int extraBuckets){
        if (width <= 0 || height <=0 || areaPerBucket <=0 || extraBuckets <0){
            return -1;
        }

        double areaOfRectangle = width * height;
        double countOfBuckets = areaOfRectangle / areaPerBucket;
        double countOfBucketsWithBobsBuckets = countOfBuckets - extraBuckets;
        int finalCountOfBuckets = (int) Math.ceil(countOfBucketsWithBobsBuckets);
        return finalCountOfBuckets;
    }


    public static int getBucketCount(double width, double height,double areaPerBucket){
        if (width <= 0 || height <=0 || areaPerBucket <=0){
            return -1;
        }
        double areaOfRectangle = width * height;
        double countOfBuckets = areaOfRectangle / areaPerBucket;
        int finalCountOfBuckets = (int) Math.ceil(countOfBuckets);
        return finalCountOfBuckets;
    }

    public static int getBucketCount(double area,double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }

        double countOfBuckets = area / areaPerBucket;
        int finalCountOfBuckets =(int) Math.ceil(countOfBuckets);
        return finalCountOfBuckets;
    }
}