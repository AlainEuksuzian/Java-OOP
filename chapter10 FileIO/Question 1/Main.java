

/*
 * PROGRAMMING PROBLEM:
 * 
 * The text files boynames.txt and girlnames.txt, which are included in the 
source code for this book text, contain a list of the 1,000 most popular boy and 
girl names in the United States for the year 2003 as compiled by the Social Security 
Administration.
 These are blank-delimited files, where the most popular name is listed first, the 
second most popular name is listed second, and so on, to the 1,000th most popular 
name, which is listed last. Each line consists of the first name followed by a blank 
space and then the number of registered births using that name in the year. For 
example, the girlnames.txt file begins with
Emily 25494
Emma 22532
Madison 19986
 This indicates that Emily was the most popular name with 25,494 registered 
namings, Emma was the second most popular with 22,532, and Madison was the 
third most popular with 19,986.
 Write a program that reads both the girl and boy files into memory using arrays. 
Then, allow the user to input a name. The program should search through both 
arrays. If there is a match, then it should output the popularity ranking and the 
number of namings. The program should also indicate if there is no match.
 For example, if the user enters the name “Justice,” then the program should output
Justice is ranked 456 in popularity among girls with 655 namings.
Justice is ranked 401 in popularity among boys with 653 namings.
 If the user enters the name “Walter,” then the program should output
Walter is not ranked among the top 1000 girl names.
Walter is ranked 356 in popularity among boys with 775 namings.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {

        Scanner inputStreamBoys = null;
        Scanner inputStreamGirls = null;

        try {
            inputStreamBoys = new Scanner(new FileInputStream("boys.txt"));
            inputStreamGirls = new Scanner(new FileInputStream("girls.txt"));
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }

        String[] boysName = new String[10];
        int[] boysValues = new int[10];
        String[] girlsName = new String[10];
        int[] girlsValue = new int[10];

        int counter = 0;
        int counterName = 0;
        int counterValue = 0;

        while(inputStreamBoys.hasNext() && inputStreamGirls.hasNext()){
            try {
               if (counter % 2 == 0){
                    boysName[counterName] = inputStreamBoys.next();
                    girlsName[counterName] = inputStreamGirls.next();
                    counterName++;
               }
               else if (counter % 2 == 1) {
                    int boyValue = Integer.parseInt(inputStreamBoys.next());
                    int girlValue = Integer.parseInt(inputStreamGirls.next());                 
                    boysValues[counterValue] = boyValue;
                    girlsValue[counterValue] = girlValue;
                    counterValue++;
                   
                }
                counter++;
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

       

        Scanner query = new Scanner(System.in);
        System.out.print("enter the name your want to query: ");
        String nameInput = query.next();


       String outputBoys = searchName(nameInput, boysName, boysValues, "boys");
       String outputGirls = searchName(nameInput, girlsName, girlsValue, "girls");
   

       System.out.println(outputBoys + outputGirls);


       inputStreamBoys.close();
       query.close();

       
    }

    /**
     * subroutine to go through 2 arrays of type int and String and locate index for popularity and element values.
     * @param nameInput  = the name the user wants to query
     * @param names array of type string for either boysName or girlsName depending during method call
     * @param values array of type int for either boysValue or girlsValue  during method call (stores number of specific name assignment (int) )
     * @param gender  (boys or girl) for the return text
     * @return String text of index and element
     */
    private static String searchName(String nameInput, String[] names, int[] values, String gender) {
        for (int i = 0; i < names.length; i++) {
            if (nameInput.equalsIgnoreCase(names[i])) {
                return nameInput + " is ranked " + (i + 1) + " in popularity among " + gender + " with " + values[i] + " naming\n";
            }
        }
        return "\n" + nameInput + " is not in " + gender + " database";
    }
}