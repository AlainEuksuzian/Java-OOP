import java.util.Scanner;

/*
 * PROGRAMMING PROBLEM:
 * 
    (This is a version of an exercise from Chapter 5) Programming Project 5.2 from 
    Chapter 5 asked you to create a class named Fraction. This class is used to 
    represent a ratio of two integers. It should include mutator functions that allow 
    the user to set the numerator and the denominator along with a method that 
    displays the fraction on the screen as a ratio (e.g., 5/9). Modify the class so that 
    it throws the exception DenominatorIsZeroException if the denominator is set 
    to zero. Do not forget to account for the constructors! You will have to create the
    DenominatorIsZeroException class and it should be derived from Exception.
    Write a main method that tests the new Fraction class, attempts to set the 
    denominator to zero, and catches the DenominatorIsZeroException exception

    */

public class Main{
    public static void main(String[] args) {
        
        Fractions fractionOne = new Fractions();
        Fractions fractionTwo = new Fractions(10,20);
        Scanner query = new Scanner(System.in);
        boolean correctInput = true;


        fractionOne.setNumerator(1);

        // while loop repeats and asks user for denominator input as long as user continues entering 0
        while(correctInput){
            try {
                System.out.print("set denominator: ");
                int denomSet = query.nextInt();
                fractionOne.setDenominator(denomSet);

                correctInput = false; // user did NOT enter 0, code continues
                System.out.println(fractionOne.equals(fractionTwo)); // returns true. works
             }
             catch (DenominatorIsZeroException e){
                 System.out.println(e.getMessage());
             }
        }
       
        query.close();


    }
}