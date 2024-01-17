
/*PROGRAMMING PROBLEM:
 * In reference to the previous two problems, again modify the program to make use 
of the LinkedList class to implement a double-ended queue. In a double-ended 
queue, insertion and deletion can be carried out at both the ends. Add methods 
to add and remove elements in this double-ended queue. 
    1. Insert word in the beginning
    2. Delete word from the end
    3. Display complete list
    4. Search a specific word
    5. Exit
 */

 import java.util.Scanner;

public class Main{
    private static Scanner keyboard = new Scanner(System.in);
    private static Queue myQueue = new Queue();

    public static void main(String[] args) {

        System.out.println("enter option:\n1. Insert word in the beginning\n2. Delete word from the end"+
        "\n3. Display complete list\n4. Search a specific word\n5. Exit");

       

        while(true){
            String option = getUserInput("enter the choice in numeric value: ");
            switch(option){
                case "1": 
                    int input = Integer.parseInt(getUserInput("enter value to enter: "));
                    myQueue.addToBack(input);
                    break;

                case "2":
                    myQueue.removeFront();
                    break;
                
                case "3":
                    if (myQueue.getSize() == 0){
                        System.out.println("empty queue");
                    }
                    else {
                        myQueue.displayQueue();
                    }
                    break;
                
                case "4":
                    int toSearch = Integer.parseInt(getUserInput("enter integer value to check: "));
                    if (myQueue.containsItem(toSearch)){
                        System.out.println("item in queue");
                    }
                    else {
                        System.out.println("item not in queue");
                    }
                    break;
                
                case "5":
                    System.out.println("ent of program");
                    System.exit(0);

            }

        }

        
    }

    public static String getUserInput(String message){
        System.out.print(message);
        return keyboard.nextLine();
    }

}