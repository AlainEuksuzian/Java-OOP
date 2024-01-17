/*
 * PROGRAMMING PROBLEM:
    * In Display 13.5, we described a sorting method to sort an array of type Comparable[]. 
    In Display 12.8, we described a sorting method that used the quick sort 
    algorithm to sort an array of type double[] into increasing order. Redo the 
    method in Display 12.8 so it applies to an array of type Comparable[]. Also, 
    do a suitable test program.
 */
public class Main{
    public static void main(String[] args) {

        Integer[] array = {10,9,8,7,6,5,4,3,2,1};

        sortArray(array); // sorts in ascending

        // test: works
        for (Integer x: array){
            System.out.println(x);
        }
        
    }

    /**
     * sorts the array in ascending order
     * @param arr
     */
    public static void sortArray(Comparable[] arr){

        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j].compareTo(arr[i]) < 0){
                    Comparable temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp;
                }
            }
        }
    }
}
