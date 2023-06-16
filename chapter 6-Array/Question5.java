
/*
* PROGRAMMING PROBLEM: 

 * Compute the alternating sum of all elements in an array. For example, if your program reads the input
1 4 9 16 9 7 4 9 11
then it computes
1 – 4 + 9 – 16 + 9 – 7 + 4 – 9 + 11 = –2
 */


public class Question5 {
    public static void main(String[] args) {

        int[] array = {1,4,9,16,9,7,4,9,11};
        int alternateSum = 0;
        String visual = "";

        //approach: if index even = add value. if index odd = subtract element

        for (int i = 0; i < array.length; i++){
            if (i % 2 == 0){
                alternateSum += array[i];
                visual += "+"+ array[i];
            }
            else {
                alternateSum -= array[i];
                visual +="-" + array[i];
            }

        }

        System.out.println(alternateSum +" = "+ visual);
    }
}
