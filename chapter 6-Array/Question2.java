public class Question2 {

    /*
    PROGRAMMING PROBLEM: 

    Write array methods that carry out the following tasks for an array of integers. For 
    each method, provide a test program. 

    a. Swap the first and last elements in the array.
    b. Shift all elements by one to the right and move the last element into the first 
    position. For example, 1 4 9 16 25 would be transformed into 25 1 4 9 16.
    c. Replace all even elements with 0.
    d. Replace each element except the first and last by the larger of its two neighbors. 
    e. Remove the middle element if the array length is odd, or the middle two 
    elements if the length is even.
    f. Move all even elements to the front, otherwise preserving the order of the 
    elements.
    g. Return the second-largest element in the array.
    h. Return true if the array is currently sorted in increasing order.
    i. Return true if the array contains two adjacent duplicate elements.
    j. Return true if the array contains duplicate elements (which need not be 
    adjacent).*/

    public static void main(String[] args) {
        
        int[] array = {1,2,3,4,5,6,7,8,9,10};


        System.out.println(containsAnyDuplicates(array));

    }

    /**
     * Switches first and last element of array
     * @param arr
     */

    public static void swapFirstAndLast(int[] arr){
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[0] = temp;
    }

    /**
     * moves all elements by 1 to the right and puts last element in first place of an array
     * @param arr
     * @return outputArray after being rearranged
     */
    public static int[] moveAllElements(int[] arr){

        int[] outputArr = new int[10];

        int last = arr[arr.length - 1];

        for (int i = arr.length-1; i >0; i--){
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
        outputArr = arr;

        return outputArr;

    }

    /**
     * replaces all even elements by 0
     * @param arr
     * @return outputArray 
     */
    public static int[] replaceEvenElements(int[] arr){

        int[] outputArr = new int[10];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                arr[i] = 0;
            }
        }
        outputArr = arr;
        return outputArr;
    }

    /**
     * replaces array element with biggest of 2 neighbors 
     * @param array
     * @return outputArray after rearranging
     */
    public static int[] replaceByLargestNeighbor(int[] array){

        int[] outputArray = new int[10];

        for (int i = 1; i < array.length - 1; i++) {
            int larger = array[i - 1];

            if (larger < array[i + 1]) {
                larger = array[i + 1];
            }

            array[i] = larger;
        }
        outputArray = array;
        return outputArray;
    }

    /**
     * removes middle if array length is odd or removes middle 2 if array length is even
     * @param arr
     * @return outputarrEvent array after being rearranged
     */
    public static int[] removeMiddle(int[] arr){

        int length = arr.length;
        int[] outputarrEvent = new int[length - 2];

        if (length % 2 == 0){
           for (int i = arr.length /2 - 1 ; i < length - 2; i++){
                arr[i] = arr[i + 2];
            }
            for(int i =0; i < length - 2 ; i++){
                outputarrEvent[i] = arr[i];
            }
        }
        else {
            for (int i = arr.length/2; i< length - 1; i++){
                arr[i] = arr[i + 1];
                outputarrEvent[i] = arr[i];

            }
        }
        outputarrEvent = new int[length - 1];
        for (int i = 0; i < length - 1 ; i++){
            outputarrEvent[i] = arr[i];
        }
       
        return outputarrEvent;
    }

    /**
     * moves all even elements to the front of array while preserving original order
     * @param arr
     * @return arr (array) after being rearranged
     */
    public static int[] moveEvenElementsFront(int[] arr){

        int counter = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                int temp = arr[counter];
                arr[counter] = arr[i];
                arr[i] = temp;
                counter++;
            }
        }
        return arr;
    }

    /**
     * loops through array and returns second largest
     * @param arr
     * @return second largest value of array
     */
    public static int secondLargest(int[] arr){
        int largest = arr[0];
        int second = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > largest){
                second = largest;
                largest = arr[i];
            }
        }
        return second;
    }

    /**
     * checks if array is sorted in ascending order
     * @param arr
     * @return boolean (true if array is sorted. false elsewhise)
     */

    public static boolean isSortedArray(int[] arr){
        boolean issorted = true;
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] < arr[i + 1]){
                issorted = true;
            }
            else {
                issorted =  false;
                break;
            }
        }
        return issorted;
    }

    /**
     * checks if array contains adjacent duplicates
     * @param arr
     * @return boolean (true if adjascnet duplicate, false elsewhise)
     */
    public static boolean containsAdjDuplicate(int[] arr){

        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] == arr[i+1]){
                return true;
            }      
        }
        return false;
    }
    

    /**
     * checks if array contains any duplicates in any order
     * @param arr
     * @return boolean (true if same element exists twice, false elsewhise)
     */
    public static boolean containsAnyDuplicates(int[] arr){

        for (int i = 0; i < arr.length; i++){

            for (int k = 0; k < arr.length; k++){

                if (i != k && arr[i] == arr[k]){
                    return true;
                }
            }

        }
        return false;
    }
}
