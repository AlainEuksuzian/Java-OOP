

/* PROGRAMMING PROBLEM: 
Redo Programming Project 6.8 in Chapter 6, but this time do it for a vector of 
strings to be sorted into lexicographic order. */

import java.util.Vector;
import java.util.Scanner;

public class Main{
    private static Vector<String> myWords = new Vector<>(10); // initial memory assignement for 10 strings
    private static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("add string items to vector: ");
        addToVector(); // works

        System.out.println("sorted Vector: ");
        bubbleSortAlgorithm(); // works
        outputVector();  //work
        
    }

    /**
     * bubble sort algorithm to sort lexicographically using compareTo()
     */
    public static void bubbleSortAlgorithm(){
        for (int i = 0; i < myWords.size(); i++){
            for (int j = 0; j < myWords.size() - 1 - i; j++){
                if (myWords.get(j).compareTo(myWords.get(j + 1)) > 0){
                    String temp = myWords.get(j);
                    myWords.set(j, myWords.get(j + 1));
                    myWords.set(j + 1, temp);
                }
            }
        }
    }

    /**
     * continously adds string input to vector, when user inputs "q", loop ends
     */
    public static void addToVector(){
        while(true){
            String toAdd = getUserInput("enter word to add, Q to quit: ");
            if (toAdd.equalsIgnoreCase("q")){
                break;
            }
            myWords.add(toAdd);
        }
    }

    /**
     * lambda function to print vector
     */
    public static void outputVector(){
        myWords.forEach((name) -> System.out.println(name));
    }

    /**
     * subroutine to get user Input
     * @param message
     * @return String userInput
     */
    public static String getUserInput(String message){
        System.out.print(message);
        return keyboard.nextLine();
    }
}