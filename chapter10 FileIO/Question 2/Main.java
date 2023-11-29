

/*Write a program that will count the total occurrences of the number ‘10’ in a text 
file of strings representing numbers of type int and will show the value of the 
count on the screen once the whole file is read. The file contains the following 
numbers separated by space.
10 4 7 8 10 34 11 10 15 6 10 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        Scanner inputStream = null;
        int tenCounter = 0;

        try {
            inputStream = new Scanner(new FileInputStream("data.txt"));
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }

        while(inputStream.hasNext()){
            if (inputStream.next().equals("10")){
                tenCounter++;
            }
        }

        System.out.println("the text file has :" + tenCounter + " occurances of the number 10");
    }
}