
/*  PROGRAMMING PROBLEM: 
The text files boynames.txt and girlnames.txt, which are included in the source 
code for this book, contain lists of the 1,000 most popular boy and girl names in the 
United States for the year 2005, as compiled by the Social Security Administration.
 These are blank-delimited files where the most popular name is listed first, the 
second most popular name is listed second, and so on to the 1,000th most popular 
name, which is listed last. Each line consists of the first name followed by a blank 
Programming Projects 975
Solution to 
Programming 
Project 16.3
VideoNote
976 CHAPTER 16 Collections, Maps, and Iterators
space followed by the number of registered births in the year using that name. For 
example, the girlnames.txt file begins with
 Emily 25494
 Emma 22532
 This indicates that Emily is the most popular name with 25,494 registered namings, Emma is the second most popular with 22,532, and so on.
 Write a program that determines how many names are on both the boys’ and 
the girls’ list. Use the following algorithm:
• Read each girl name as a String, ignoring the number of namings, and add it 
to a HashSet object.
• Read each boy name as a String, ignoring the number of namings, and add 
it to the same HashSet object. If the name is already in the HashSet, then the 
add method returns false. If you count the number of false returns, then this 
gives you the number of common namings.
• Add each common name to an ArrayList and output all of the common names 
from this list before the program exits. */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;

public class Main {
    private static HashSet<String> uniqueNames = new HashSet<>(10);
    private static ArrayList<String> duplicateWords = new ArrayList<>(10);
    public static void main(String[] args) {
        Scanner inputStreamBoys = null;
        Scanner inputStreamGirls = null;

        //parse both files, if any of them fail, the entire program ends as the rest of the code will be useless
        try {
            inputStreamBoys = new Scanner(new FileInputStream("boys.txt"));
            inputStreamGirls = new Scanner(new FileInputStream("girls.txt"));
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            System.exit(0);
        }

        
        // loop through the boys file and adds all the unique names to a hashset
        while(inputStreamBoys.hasNext()){
            String item = inputStreamBoys.next();
            try {
                Integer.parseInt(item); // text file contains number which should be ignored
            }
            catch (Exception e){
                uniqueNames.add(item);
            }
        }

        int duplicateCounter = 0; // keep counter track of duplicate names between the 2 txt files

        // loops through girls txt file and if the girl name is already in the set, duplicatecounter +1 and the name gets added to the duplicate arrayList
        while(inputStreamGirls.hasNext()){
            String item = inputStreamGirls.next();
            try {
                Integer.parseInt(item);
            }
            catch (Exception e){
                if (uniqueNames.contains(item)){
                    duplicateCounter++;
                    duplicateWords.add(item);
                }
            }
        }

        inputStreamBoys.close();
        inputStreamGirls.close();

        System.out.println(duplicateCounter); // works
        
    }
}