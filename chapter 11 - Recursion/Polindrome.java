import java.util.Scanner;

/* PROBLEM: 
a phrase is a palindrome if after converting all uppercase letter into lowercase letters and remove all non alphanumeric characters,
 it reads the same forward and backward. alphanumeric characters include letters and numbers. Given a string userInput, write a function that returns true 
 if it is a palindrome or false otherwise

pseudocode:
1) capute user input and store as string   (Scanner class) X
2) method that parses/clean user input (remove non alphanumeric) -> string return X
3) method that reverses user input (LIFO, recursion, stack) -> string return X
4) a method that compares step 2 and step 3 -> returns boolean
*/


public class Polindrome {
    private static Integer[] arr = {9,9,8,7,7,6,5,4,3,3,3,2,1};
    private static final Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {

        String userInput = getUserInput("enter the sentence to check: ");
        String parsedInput = parseUserInput(userInput);
        String reverseParsedInput = reverseAlphaString(parsedInput);
        
        System.out.println(equals(parsedInput, reverseParsedInput));


    }

    public static boolean equals(Object obj, String obj2) {

        if (obj instanceof String){
            String word = (String) obj;
            return word.equalsIgnoreCase(obj2);
        }
        return false;
    }


    public static String reverseAlphaString(String word){
        if (word == null || word.length() <= 1){
            return word;
        }
        else {
            char ch = word.charAt(0); 
            int index = word.indexOf(ch);

            if (Character.isAlphabetic(ch) || Character.isDigit(ch)){
                return reverseAlphaString(word.substring(1)) + word.charAt(0);
            }
            else {
                return reverseAlphaString(word.substring(index+1));
            }
        }
    }

    public static String parseUserInput(String input){

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if (Character.isAlphabetic(ch) || Character.isDigit(ch)){
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static String getUserInput(String message){
        System.out.print(message);
        return keyboard.nextLine();
    }
}
