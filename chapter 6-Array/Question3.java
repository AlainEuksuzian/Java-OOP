
/*
 * PROGRAMMING PROBLEM:
 * 
 * Write a method sumWithoutSmallest that computes the sum of an array of values, 
except for the smallest one, in a single loop. In the loop, update the sum and the 
smallest value. After the loop, return the difference.
 */

public class Question3 {

    
    public static void main(String[] args) {
        
        int[] array = {2,3,4,5,1,7,8,9,10};

        int smallest = array[0]; // temporary variable
        int sum = 0;

        // adds all element values except the smallest value
        for (int i = 0; i < array.length; i++){
            if (array[i] < smallest){
                continue; 
            }
            else {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
    
}
