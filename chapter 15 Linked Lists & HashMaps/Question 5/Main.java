
/*PROGRAMMING PROBLEM:
 * Write an addSorted method for the generic linked list from Display 15.8 such 
that the method adds a new node in the correct location so that the list remains 
in sorted order. Note that this will require that the type parameter T extend the 
Comparable interface. Write a suitable test program
 */

 import java.util.Scanner;

public class Main{
    private static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>();

        LinkedList<String>.Itterator i = myList.itterate();

       while(true){
        String toAdd = getUserInput("enter String to add, or Q to stop: ");
        if (toAdd.equalsIgnoreCase("Q")){
            break;
        }
        else {
            i.reset();
            i.addSorted(toAdd);
        }
       }
        myList.outputList(); // outputs list, works prints in ordered form
       keyboard.close();
    }

    /**
     * subrouting to get user Input
     * @param message
     * @return
     */
    public static String getUserInput(String message){
        System.out.print(message);
        return keyboard.nextLine();
    }

}