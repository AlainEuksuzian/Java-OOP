

/*
PROGRAMMING PROBLEM:

 * Write a program that uses an ArrayList of parameter type Dictionary to store a 
database of words. The Dictionary class should store the term and its synonyms. 
Add appropriate accessor and mutator methods. 

 Your database program should present a menu that allows the user to:
add a term, 
delete a term, 
display all terms, 
search for a specific term, 
or search for a specific term and give the user the option to delete it.
The search should find any term 
where any instance variable contains a target search string. For example, if “Legacy” 
is the search target, then the term should be displayed or deleted. Use the "foreach" loop to iterate through the ArrayList. The program should also check if 
the user inputs only text and should prompt the user for “Invalid Input” if the 
input is other than text.
 */

 import java.util.Scanner;
 import java.util.ArrayList;


public class Main{

    private static Scanner keyboard = new Scanner(System.in);
    private static ArrayList<Dictionary> terms = new ArrayList<>(5);

    public static void main(String[] args) {

        System.out.println("start by adding terms in the arrayList: ");
        addTerms();

        String menu = getUserInput("chose options by inputting the number:\n1)delete\n2)display\n3)search\n4)search&delete");
        userMenu(menu);
       
        
       
        
    }

    /**
     * creates a user menu option that calls all other methods based on user option
     * @param menu
     */
    public static void userMenu(String menu){
        if (menu.equals("1")){
            String word = getUserInput("enter word to delete: ");
            String syn = getUserInput("enter synonym to delete: ");
            try {
                deleteTerm(word, syn);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        else if (menu.equals("2")){
            displayTerms();
        }
        else if (menu.equals("3")){
            String word = getUserInput("enter word to delete: ");
            String syn = getUserInput("enter synonym to delete: ");
            searchTerm(word, syn);
        }
        else if (menu.equals("4")){
            String word = getUserInput("enter word OR synonym to search combo and delete: ");
            searchAndDelete(word);
        }
    }

    /**
     * loops and asks user to enter word and synonym, uses isNumeric subrouting to avoid inputting numbers. offers the user the option with y/n to stop adding
     */
    public static void addTerms(){
        while(true){
            String word = getUserInput("enter the word to add: ");
            String synonym = getUserInput("enter synonym to add: ");

            while(isNumeric(word) || isNumeric(synonym)){
                System.out.println("cannot input numbers for word or synonym, try again: ");
                word = getUserInput("enter the word to add: ");
                synonym = getUserInput("enter synonym to add: ");
            }
            Dictionary object = new Dictionary(word, synonym);
            terms.add(object);
            String option = getUserInput("continue adding? (Y/N): ");
            if (option.equalsIgnoreCase("N")){
                break;
            }

        }
    }


    /**
     * prints all objects of the arrayList with the toString method from dictionary clas
     */
    public static void displayTerms(){
        for (Dictionary elements : terms){
            System.out.println(elements);
        }
    }

    /**
     * takes both parameters of type STRING, creates an object and searched the arrayList. if not in arrayList, throws exception that gets caught in main method 
     * @param word
     * @param synonym
     * @throws Exception
     */
    public static void deleteTerm(String word, String synonym) throws Exception{

        Dictionary object = new Dictionary(word, synonym);
        if (terms.contains(object)){
            terms.remove(object);
        }
        else {
            throw new Exception("word and synonym combo entered not in terms arrayList");
        }
    }

    /**
     * bool method that returns true if object of word & syn are inside the arrayList. returns false otherwise
     * @param word
     * @param syn
     * @return true/false
     */
    public static boolean searchTerm(String word, String syn){
        Dictionary object = new Dictionary(word, syn);
        if (terms.contains(object)){
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * loops through all elements and if word or synonym equal to parameter, deletes the entire object
     * @param userInput
     * @return
     */
    public static boolean searchAndDelete(String userInput){

        for (Dictionary elements : terms){
            if (elements.getWord().equals(userInput) || elements.getSynonym().equals(userInput)){
                terms.remove(elements);
                return true;
            }
        }
        System.out.println("term not in list");
        return false;
    }

    //------------------------------NOTE: methods below are subroutines to avoid code repetition ----------------------

    /**
     * subroutine to get user info and avoid repetition
     * @param message
     * @return
     */
    public static String getUserInput(String message){
        System.out.print(message);
        return keyboard.nextLine();
    }

    /**
     * subrouting to make sure the usere only inputs word prior to adding to terms arrayList
     * @param input
     * @return
     */
    public static boolean isNumeric(String input){
        try {
            Double.parseDouble(input);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
}