
/*
 * PROGRAMMING PROBLEM: 
 * 
 * Write a method
public static boolean equals(int[] a, int[] b)
that checks whether two arrays have the same elements in the same order.
 */

public class Question6 {
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};
        int[] b = {1,2,3,4,5};
        int[] c = {4,5,6,7,8};


        System.out.println(equals(a, b)); // works, prints true
        System.out.println(equals(c, b)); // works, prints false
        
    }

    /**
     * 
     * @param a of type array integer
     * @param b of type array integer
     * @return boolean (true if a[i] == b[i])
     */
    public static boolean equals(int[] a, int[] b){

        boolean isEqual = true;

        for (int i = 0; i < a.length; i++){
            if (a[i] == b[i]){
                isEqual = true;
            }
            else {
               return isEqual = false;
                
            }
        }
        return isEqual;
    }
}
