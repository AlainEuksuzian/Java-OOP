
/*
Extend the previous problem to create a list that will act as a stack. A stack is a data 
structure that follows the last-in first-out order for the addition and deletion of elements. 
This list will contain the following items of integer type values. Modify the 
method implemented in the previous problem for addition of an item in the stack 
to create a push method. Also, modify the remove method for deleting items from 
the stack to create a pop method. Do remember that the elements are inserted or 
deleted from only one end of the stack. In summary, include following: 

 1. Insert word in the beginning
 2. Delete word from the beginning
 3. Display complete list
 4. Search a specific word
 5. Exit

*/

import java.util.Scanner;

public class Main{
    private static Scanner keyboard = new Scanner(System.in);
    private static Stack wordStack = new Stack();

    public static void main(String[] args) {

       // continuously loops until user choses the exit option
        while(true){

            System.out.println("enter option:\n1.Insert word in the beginning\n2. Delete word from the beginning"+
            "\n3. Display complete list\n4. Search a specific word\n5. Exit");

            // get user choice input
            String option = getUserInput("enter the option in numeric form: ");

            // add integer input as head node if user choses option 1
            if (option.equals("1")){
                int input = Integer.parseInt(getUserInput("enter integer value to add to stack:"));
                wordStack.push(input);
            } 
            // returns and removes head Node from stack if user choses option 2
            else if (option.equals("2")){
                System.out.println(wordStack.pop() + " has been removed");
            }
            // outputs stack linked list only if not empty if user choses option 3
            else if (option.equals("3")){
                
                if (wordStack.getStackSize() == 0){
                    System.out.println("no items added, chose option 1 to start adding");
                }
                else {
                    wordStack.outputStack();
                }
            }
            // cycles through stack linked list to see if user input is part of the list if user choses option 4
            else if (option.equals("4")){
                int toSearch = Integer.parseInt(getUserInput("enter the number to search: "));
                if (wordStack.contains(toSearch)){
                    System.out.println("the value is inside the stack");
                }
                else {
                    System.out.println("value not found in stack");
                }
            }
            // stops the while loop and ends the program if user choses option 5
            else if (option.equals("5")){
                break;
            }
        }
        keyboard.close();
    }

    /**
     * subrouting to get user input
     * @param message
     * @return
     */
    public static String getUserInput(String message){
        System.out.print(message);
        return keyboard.nextLine();
    }
}