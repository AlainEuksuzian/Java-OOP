

/* PROGRAMMING PROBLEM:
The file words.txt included on the website contains a list of 87,314 English words. 
Write a program that uses this word list to implement a simple spell-checker. First, 
read all of the words into a HashSet<String> object. Then, allow the user to enter 
the name of a text file that contains written English. The program should output 
all of the words that are not in the set as potentially misspelled words */

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashSet;

public class Main{
    private static HashSet<String> allWords = new HashSet<>(87314);
    public static void main(String[] args) {
        Scanner inputStream = null;
        Scanner inputStreamToCheck = null;

        try {
            inputStream = new Scanner(new FileInputStream("words.txt"));
            inputStreamToCheck = new Scanner(new FileInputStream("sentence.txt"));
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
        
        while(inputStream.hasNext()){
            allWords.add(inputStream.next());
        }

        inputStream.close();

        String mistakes = "";

        while(inputStreamToCheck.hasNext()){
            String word = inputStreamToCheck.next();
            if (!allWords.contains(word)){
                mistakes += word + " ";
            }
        }
        System.out.println(mistakes);

      
        inputStreamToCheck.close();
        
    }
}