import java.util.Scanner;
import java.lang.NumberFormatException;
/*
 * PROGRAMMING PROBLEM:
 * 
 * Write a program that can serve as a simple calculator. This calculator keeps track of 
a single number (of type double) that is called result and that starts out as 0.0. 
Each cycle allows the user to repeatedly add, subtract, multiply, or divide by a second 
number. The result of one of these operations becomes the new value of result. 
The calculation ends when the user enters the letter R for “result” (either in upper- or 
lowercase). The user is allowed to do another calculation from the beginning as often 
as desired.
 The input format is shown in the following sample dialogue. If the user enters any 
operator symbol other than +, −, *, or /, then an UnknownOperatorException 
is thrown and the user is asked to reenter that line of input. Defining the class 
UnknownOperatorException is part of this project.

Calculator is on.
 result = 0.0
 +5
 result + 5.0 = 5.0
 new result = 5.0
* 2.2
 result * 2.2 = 11.0
 updated result = 11.0
 % 10
 % is an unknown operation.
 Reenter, your last line:
 * 0.1
 result * 0.1 = 1.1
 updated result = 1.1
 r
 Final result = 1.1
 Again? (y/n)
yes
 result = 0.0
 +10
 result + 10.0 = 10.0
 new result = 10.0
 /2
 result / 2.0 = 5.0
 updated result = 5.0
 r
 Final result = 5.0
 Again? (y/n)
 N
 End of Program
 */



public class Calculator{
    public static void main(String[] args) {
       
        Scanner query = new Scanner(System.in);

        double result = 0;

        String input = null;  // string to capture user input
        boolean keepCalculating = true; // stays true unless the user enters "r"
        String operator = null; // stores the value of the operator after parsing input
        double numberParsed = 0; // stores numeric double value after parsing input 

        //keeps looping as long as the user does not enter "r"or "R"
        while(keepCalculating){
            System.out.print("enter your equation and number all in one line: ");
            input = query.next();

            // seperate operator and number to compute
            try {
                operator = input.substring(0, 1);
                numberParsed = Double.parseDouble(input.substring(1, input.length()));
            }
            catch (NumberFormatException e){
                if (input.equalsIgnoreCase("r")){
                    keepCalculating = false;
                }
                // prints error if user did not enter format: operator number
                else {
                    System.out.println(e.getMessage());
                }
            }
            // try doing the computation (+,-,/,*) anything else: exception gets throwed
            try {
                if (operator.equalsIgnoreCase("+")){
                    result += numberParsed;
                    displayResult(input, result);
                }
                else if (operator.equalsIgnoreCase("-")){
                    result -= numberParsed;
                    displayResult(input, result);
                }
                else if (operator.equalsIgnoreCase("*")){
                    result *= numberParsed;
                    displayResult(input, result);
                }
                else if (operator.equalsIgnoreCase("/")){
                    result /= numberParsed;
                    displayResult(input, result);
                }
                else {
                    throw new UnknownOperatorException();
                }
            }
            catch (UnknownOperatorException e){
               if (operator.equalsIgnoreCase("r")){
                
                System.out.println(result + " is the final result, do you want to restart: (y/n)");
                String reset = query.next();

                if (reset.equalsIgnoreCase("n") || reset.equalsIgnoreCase("no")){
                    keepCalculating = false;
                }
                else if (reset.equalsIgnoreCase("y") || reset.equalsIgnoreCase("yes")){
                    result = 0;
                    keepCalculating = true;
                }
               }
               else {
                System.out.println(e.getMessage());
               }
            }
        }

        System.out.println("end of calculator" + "the final result is: " + result);


    }
    /**
     * subrouting to display the result to avoid multiple sysout 
     * @param input of type string for original user input
     * @param result after computation depending on the operator and value parsed
     */
    private static void displayResult(String input, double result) {
        System.out.println(input + " to the result gives: " + result);
    }
}