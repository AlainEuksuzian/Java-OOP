
import java.util.Scanner;

/*
 * PROGRAMMING PROBLEM: 
 
 * Write a program that calculates the average of N integers. The program should 
prompt the user to enter the value for N and then afterward must enter all N
numbers. If the user enters a nonpositive value for N, then an exception should be 
thrown (and caught) with the message “N must be positive.” If there is any exception as the user is entering the N numbers, an error message should be displayed, 
and the user prompted to enter the number again.
 */

public class AverageCalculator{
    public static void main(String[] args) {

        Scanner query = new Scanner(System.in);
        int sampleSize = 0;
        int counter = 0;
        int sum = 0;
        int numberInput = 0;

        // try block to make sure sample size entered is bigger than 0
        try {
            System.out.print("enter the sample size: ");
            sampleSize = query.nextInt();
            if (sampleSize < 0){
                throw new Exception("sample size cannot be negative, try again: ");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            sampleSize = query.nextInt();
        }
 
        // iterate enough time to reach sample size (sum / n)
        while(counter < sampleSize){
            try {
                System.out.print("enter values to compute (cannot be negative) : ");
                numberInput = query.nextInt();
                if (numberInput < 0){
                    throw new Exception("input cannot be negative");
                }
                // if Scanner input positive, increment counter iteration and add input to sum
                else {
                    sum += numberInput;
                    counter++;
                }
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        double average = sum /(double) sampleSize;  // computes average and converts to double data type

        System.out.printf("the mean of inputs is: %.2f", average); // works. prints average
        
    }
}