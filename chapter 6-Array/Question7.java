

public class Question7 {

    /*
     * PROGRAMMING PROJECT: 
     * 
     *  A run is a sequence of adjacent repeated values. Write a program that generates a 
        sequence of 20 random die tosses in an array and that prints the die values, marking 
        the runs by including them in parentheses, like this: 
        1 2 (5 5) 3 1 2 4 3 (2 2 2 2) 3 6 (5 5) 6 3 1   
     */
    public static void main(String[] args) {
        
        int[] array = {1, 2, 5, 5, 3, 1, 2, 4, 3, 2, 2, 2, 2, 3, 6, 5, 5, 6, 3, 1 };

        boolean inRun = false;

        for (int i = 0; i < array.length - 1; i++){
            if (inRun){
                if (array[i] != array[i - 1]){
                    System.out.print(") ");
                    inRun = false;
                }
            }
            else {
                if (array[i] == array[i + 1]){
                    System.out.print("( ");
                    inRun = true;
                }
            }
            System.out.print(array[i] + " ");
        }
        if (inRun){
            System.out.print(")");
        }
    }
}
