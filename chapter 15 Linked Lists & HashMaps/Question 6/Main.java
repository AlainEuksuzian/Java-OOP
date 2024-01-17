
/*PROGRAMMING PROBLEM:
 * Displays 15.34 and 15.35 provide the beginnings of a spell-checker. Refine the program to make it more useful. 
 * The modified program should read in a text file, parse 
each word, see if it is in the hash table, and, if not, add it to the hash table. Discard any punctuation in the original 
text file. Use the words.txt file as the basis for the hash table dictionary. This file 
can be found on the book’s website
 */

 import java.io.FileInputStream;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        HashMap hash = new HashMap();
        Scanner inputStream = null;

        try {
            inputStream = new Scanner(new FileInputStream("words.txt"));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        String output = "";

        while(inputStream.hasNext()){
            output += inputStream.next() + " ";
        }
       String finalOutput = output.replaceAll("\\p{Punct}", "");

       StringTokenizer parser = new StringTokenizer(finalOutput);

       while(parser.hasMoreTokens()){
        String next = parser.nextToken();
        if (!hash.containsString(next)){
            myList.addToStart(next);
        }
       }

       myList.outputList();

       String tester = "helo";

       if (!hash.containsString(tester)){
        System.out.println("you wrote the word wrong");
       }
        
    }
}