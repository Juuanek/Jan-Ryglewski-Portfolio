import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import static java.util.Arrays.*;
import static java.util.Collections.reverse;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int[] FirstArray = new int[10];
        for (int i=0; i<10;i++){
            FirstArray[i] =random.nextInt(100);;

        }
        System.out.println("Not sorted: " +Arrays.toString(FirstArray));
        sort(FirstArray);
        System.out.println(" Ascending sort: " +Arrays.toString(FirstArray));



        reverse(FirstArray);
        System.out.println("Descending sort: " + Arrays.toString(FirstArray));





    }

    public static void reverse(int[] array)
    {

        // Length of the array

        // Swapping the first half elements with last half
        // elements
        for (int i = 0; i < array.length /2 ; i++) {

            // Storing the first half elements temporarily
            int temp = array[i];

            // Assigning the first half to the last half
            array[i] = array[array.length - i - 1];

            // Assigning the last half to the first half
            array[array.length - i -1 ] = temp;
            System.out.println(Arrays.toString(array));
        }
    }
}