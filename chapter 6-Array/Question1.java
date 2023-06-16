import java.util.Random;

public class Question1{


    /*
    PROGRAMMING PROJECT: 

    Write a program that initializes an array with ten random integers and then prints 
    four lines of output, containing
    • Every element at an even index.
    • Every even element.
    • All elements in reverse order.
    • Only the first and last element. */
    
    public static void main(String[] args) {

        Random randNums = new Random();
        int[] array = new int[10];
        
        // fill array with random integer values
        for (int i = 0; i < array.length; i++){
            array[i] = randNums.nextInt(10);

        }
       
        String arrayEvenIndex = evenIndexElements(array);  //stores result as string for output
        String arrayEvenElements = evenElement(array);     //stores result as string for output
        int[] reversedArray = reverseArray(array);         // initialize new array to store result value of reverseArray() method

        int firstElement = array[0];
        int lastElement = array[array.length -1];

        String firstAndLastElement = firstElement + "" + lastElement;


        System.out.println(arrayEvenIndex);
        System.out.println(arrayEvenElements);


        for (int x: reversedArray){
            System.out.print(x);
        }

        System.out.println(firstAndLastElement);
       
    }

    /**
     * takes an array parameter, and loops to to save the even index elements
     * @param arr
     * @return String containing all even index elements
     */
    public static String evenIndexElements(int[] arr){
        String evenOutput = "";
        
        for (int i = 0; i < arr.length; i++){
            if (i % 2 == 0){
                evenOutput += arr[i];
            }
        }
        return evenOutput;
    }

    /**
     * stores even elements of an array to a String 
     * @param arr
     * @return String that contains even elements
     */
    public static String evenElement(int[] arr){
        String evenOutputElements = "";

        for (int i =0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                evenOutputElements += arr[i];
            }
        }
        return evenOutputElements;
    }

    /**
     * reverses an array and saves the result in a new array that gets retured
     * @param arr
     * @return new array containing the values of the original array in reverse
     */
    public static int[] reverseArray(int[] arr){

        int[] outputArray = new int[10];
        int counter = 0;

        for (int i = arr.length - 1; i >= 0; i--){
            outputArray[counter] = arr[i];
            counter++;
        }
        return outputArray;
    }
}