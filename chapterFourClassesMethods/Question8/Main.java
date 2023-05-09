package chapterFourClassesMethods.Question8;
import java.util.Scanner;
/*
 * PROGRAMMING PROBLEM: 
 * 
 *Define a class called Fraction. This class is used to represent a ratio of two integers. Include mutator methods that allow the user to set the numerator and the 
denominator. Also include a method that displays the fraction on the screen as a 
ratio (e.g., 5>9). This method does not need to reduce the fraction to lowest terms.
 Include an additional method, equals, that takes as input another Fraction and 
returns true if the two fractions are identical and false if they are not. This 
method should treat the fractions reduced to lowest terms; that is, if one fraction 
is 20>60 and the other is 1>3, then the method should return true.
 Embed your class in a test program that allows the user to create a fraction. Then 
the program should loop repeatedly until the user decides to quit. Inside the body 
of the loop, the program should allow the user to enter a target fraction into an 
 object and learn whether the fractions are identical.
 */

public class Main {

    public static void main(String[] args) {

        Scanner query = new Scanner(System.in);

        Fractions fractionOne = null;
        Fractions fractionTwo = null;
        int numerator = 0, denominator = 0;
        System.out.println("fractions comparision (press Q to quit)");

        // stopping case is if a letter is inputted (catch statement breaks the loop)
        while (true){
            
            try{

            // input 2 values to be assigned to instaces of fractionOne    
            System.out.println("enter value of numerator for fraction one: ");
            numerator = query.nextInt();
            System.out.println("enter value of denominator for fraction one: ");
            denominator = query.nextInt();

            fractionOne = new Fractions(numerator, denominator);

            // input 2 values to be assigned to instaces of fractionTwo 
            System.out.println("enter value of numerator for fraction Two: ");
            numerator = query.nextInt();
            System.out.println("enter value of denominator for fraction Two: ");
            denominator = query.nextInt();

            fractionTwo = new Fractions(numerator, denominator);

           if (fractionOne.equals(fractionTwo)){
            System.out.println("the fractions are the same ");
           }
           else {
            System.out.println("the fractions are not the same");
           }
            }
            catch (Exception e){
               break;
            }
            
        }
        
        query.close();
        System.out.println("end of program");


        
    }
    
}
