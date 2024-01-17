
/*Consider a frame of bowling pins shown below, where each * represents a pin:
 *
 * *
 * * *
* * * *
* * * * *
There are 5 rows and a total of 15 pins.
If we had only the top 4 rows, then there would be a total of 10 pins.
If we had only the top three rows, then there would be a total of six pins.
If we had only the top two rows, then there would be a total of three pins.
If we had only the top row, then there would be a total of one pin
Write a recursive function that takes as input the number of rows n and outputs 
the total number of pins that would exist in a pyramid with n rows. Your program 
should allow for values of n that are larger than 5. */


public class QuestionThree {
 public static void main(String[] args) {

    System.out.println(pinCounter(5)); // works, prints 15
 }  
 
 /**
  * uses recursion to calculate pin frame
  * @param pins
  * @return recursive call parameter - 1
  */
 public static int pinCounter(int pins){

    if (pins == 1){
        return 1;
    }
    else {
        return pinCounter(pins - 1) + pins;
    }
 }
}
