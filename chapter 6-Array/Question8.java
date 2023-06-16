
import java.util.Random;
import java.util.Arrays;


/*
 * PROGRAMMING PROBLEM: 
 * 
 * Write a program that generates a sequence of 20 random values between 0 and 99 in 
an array, prints the sequence, sorts it, and prints the sorted sequence. Use the sort
method from the standard Java library
 */

public class Question8 {
    public static void main(String[] args) {

        Random randNums = new Random();
        int[] array = new int[20];

        for (int i = 0; i < 20; i++){
            array[i] = randNums.nextInt(99);
        }

        Arrays.sort(array);                       // automatic sort
       int[] output = manualArraySorting(array); // manual sort

       // output array for verification
       for (int x: output){
        System.out.println(x);
       }

      
    }


    /**
     * sorts array in ascending form manually
     * @param arr
     * @return outputArray sorted
     */

    public static int[] manualArraySorting(int[] arr){

        for (int  i =0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        int[] outputArray = arr;
        return outputArray;
    }
}
