

/*PROGRAMMING PROBLEM: 
 *A record contains data as well as reference to the next record. We should be 
able to insert or remove data within the data records. Create a class named as 
WordLinkedList that uses the LinkedList class discussed in this chapter to contain 
lists of words. Create a menu-driven program that allows a user to choose from the 
following list of operations:
 1. Insert word in the beginning
 2. Insert word at a given position
 3. Delete word from the beginning
 4. Delete word from a given position
 5. Display complete list
 6. Search a specific word
 7. Exit 
 */

 import java.util.Scanner;

 public class Main{
    private static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {

        WordLinkedList linkedList = new WordLinkedList();
        WordLinkedList.Itterator i = linkedList.itterate();

        while (true){
            System.out.println("1. Insert word in the beginning\n2. Insert word at a given position\n3. "+
            "Delete word from the beginning\4. Delete word from a given position\n5. Display complete list\n6. Search a specific word\n7. Exit ");

            String option = getUserInput("enter the choice with numeric Input: ");
    
            if (option.equals("1")){
                String input = getUserInput("enter the word to add: ");
                linkedList.addToStart(input);
            }
            else if (option.equals("2")){
                String location = getUserInput("enter location to add: ");
                int parser = Integer.parseInt(location);
                if (parser < linkedList.getSize()){
                    int counter = 1;
                while (counter < parser){
                    counter++;
                    try {
                        i.next();
                    }
                    catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }
                String input = getUserInput("enter String to add: ");
                i.addHere(input);
                }
            }
            else if (option.equals("3")){
                linkedList.deleteHead();
            }
    
            else if (option.equals("4")){
                String location = getUserInput("enter numeric location of node to delete:");
                int parser = Integer.parseInt(location);
                if (parser < linkedList.getSize()){
                    int counter = 1;
                    while (counter < parser){
                        counter++;
                        try {
                            i.next();
                        }
                        catch (Exception e){
                            System.out.println(e.getMessage());
                        }
                    }
                    try {
                        i.delete();
                    } 
                    catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }
                
            }
            else if (option.equals("5")){
                linkedList.outputList();
            }
            else if (option.equals("6")){
                String search = getUserInput("enter word to search: ");
                if (linkedList.contains(search) == true){
                    System.out.println("word in linked list");
                }
                else {
                    System.out.println("word not in linked list");
                }
    
            }
            else if (option.equals("7")){
                break;
            }
        }
       

    }

    public static String getUserInput(String message){
        System.out.print(message);
        return keyboard.nextLine();
    }
 }