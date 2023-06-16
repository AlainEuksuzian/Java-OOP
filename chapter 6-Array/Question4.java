
/*
 * PROGRAMMING PROBLEM: 
 * Write a method public static void removeMin that removes the minimum value from a 
partially filled array without calling other methods. 
 */

public class Question4 {
    public static void main(String[] args) {
        
        int[] array = {1,2,3,4,0,6,7,8,9};
        int smallest = array[0];

        // locates the index of the smallest value
        for (int i = 0; i < array.length; i++){
            if (array[i] < smallest){
                smallest = i;
            }
        }

        // removes smallest value from array
        for (int i = smallest; i <array.length - 1; i++){
            array[i] = array[i + 1];
        }

        int[] finalArray = new int[array.length - 1]; // new array for output

        // adds value of old array to new array
        for(int i = 0; i < array.length - 1; i++){
            finalArray[i] = array[i];
        }
        for (int x: finalArray){
            System.out.println(x);
        }
    }
}
