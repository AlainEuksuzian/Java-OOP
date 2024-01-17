

/*
write a recursive algorithm implementation of binary search  so that the 
search method works on any array of type Comparable[]. Test the implementation with arrays of different types to see if it works. */


public class BinarySearch {
    public static void main(String[] args) {
        

        Integer[] array = {1,3,5,7,9,11,50,100};
        String[] arrayTwo = {"alain", "bill", "cat", "mint", "zoo"};

       System.out.println( binarySerchMethod(array, 0, array.length - 1, 100)); // works prints 7 for index of 100
       System.out.println(binarySerchMethod(arrayTwo, 0, arrayTwo.length, "mint")); // works, prints 3 for index of mint


    }

    /**
     *  recursive method to find value index in an array
     * @param arr  array of type Comparable
     * @param first int for 0
     * @param last int for array.length-1
     * @param value Comparable type value to search in method
     * @return the index of element searched
     */
    public static int binarySerchMethod(Comparable[] arr, int first, int last, Comparable value){

        int output = 0;

        if (first > last){
            return output = -1;
        }
        else {
            int mid = (first + last) / 2;
            if (arr[mid].compareTo(value) == 0){
                return output = mid;
            }
            // search first half
            else if (arr[mid].compareTo(value) > 0){
                return output = binarySerchMethod(arr, first, mid - 1, value);
            }
            // search second half
            else  {
                return output = binarySerchMethod(arr, mid + 1, last, value);
            }
        }

    }
}