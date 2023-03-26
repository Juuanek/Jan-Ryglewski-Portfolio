import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

import static java.util.Arrays.*;
import static java.util.Collections.reverse;

public class Main {
    public static void main(String[] args) {
        int[] FirstArray = new int[10];
        readIntegers(FirstArray);
        findMin(FirstArray);
        reverse(FirstArray);

    }

    public static void readIntegers(int[] FirstArray) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            FirstArray[i] = scanner.nextInt();
        }
        System.out.println("Array is: " + Arrays.toString(FirstArray));
    }
    public static void findMin(int[] FirstArray){
        Arrays.sort(FirstArray);
        System.out.println("Sorted array: " + Arrays.toString(FirstArray));
        System.out.println("Minimum value is: " + FirstArray[0]);
    }
    public static void reverse(int[] FirstArray){

        for(int i =0;i<FirstArray.length /2;i++){
            int temp = FirstArray[i];
            FirstArray[i] = FirstArray[FirstArray.length - i- 1];
            FirstArray[FirstArray.length - i - 1] = temp;
        }
        System.out.println("reversed array : " + Arrays.toString(FirstArray));


    }
}