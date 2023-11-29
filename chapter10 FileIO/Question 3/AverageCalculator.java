
/*Write a program that takes its input from a text file of strings representing numbers 
of type double and outputs the average of the numbers in the file to the screen. The 
file contains nothing but strings representing numbers of type double, one per line.

Write a program that takes its input from a text file of strings representing numbers 
of type double. The program outputs to the screen the average and standard deviation of the numbers in the file. The file contains nothing but strings representing 
numbers of type double, one per line. The standard deviation of a list of numbers 
n1, n2, n3, and so forth is defined as the square root of the average of the following 
numbers:
(n1 - a)
2, (n2 - a)
2, (n3 - a)
2, and so forth.
 The number a is the average of the numbers n1, n2, n3, and so forth. Hint: Write 
your program so that it first reads the entire file and computes the average of all the 
numbers, then closes the file, and then reopens the file and computes the standard 
deviation. You will find it helpful to first do Programming Project 10.3 and then 
modify that program in order to obtain the program for this project.*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AverageCalculator{
    public static void main(String[] args) {

        Scanner inputStream = null;
        Scanner inputStreamTwo = null;

        // try to connect to data.txt file
        try {
            inputStream = new Scanner(new FileInputStream("data.txt"));
            inputStreamTwo = new Scanner(new FileInputStream("data.txt"));
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }

        int sum = 0;
        int count = 0;

        // count the sample size and the sum of the dataset for (sum/n)
        while(inputStream.hasNextDouble()){
            sum += inputStream.nextDouble();
            count++;
        }

        double average = sum / (double) count;

        double stdSum = 0;

        // compute first part : standard deviation: (data - average) ^ 2
        while(inputStreamTwo.hasNextDouble()){
            stdSum += Math.pow(inputStreamTwo.nextDouble() - average, 2);
        }

        // compute second part of standard dev: squareRoot(first part / sampleSize - 1 )
        double standardDev = Math.sqrt(stdSum / count-1);

        System.out.printf("the standard deviation of the dataset is: %.2f \nthe average is: %.2f", standardDev, average);

    }
}