/*A record contains data as well as reference to the next record. We should be 
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
 7. Exit */

 import java.util.Scanner;

 public class Main{
    private static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        WordLinkedList items = new WordLinkedList();
        WordLinkedList.Itterator i = items.itterate();

        while (true){
            System.out.println(" 1. Insert word in the beginning\n 2. Insert word at a given position"
            + "3. Delete word from the beginning\n 4. Delete word from a given position\n 5. Display complete list\n 6. Search a specific word\n 7. Exit");
            String option = getUserInput("enter numeric option: ");

            switch (option){
                case "1" : 
                    String toAdd = getUserInput("enter word to add: ");
                    items.addToStart(toAdd);
                    break;

                case "2":
                    i.reset();
                    String add = getUserInput("enter word to add: ");
                    i.addHere(add);
                    break;

                case "3":
                    i.reset();
                    items.deleteHead();
                    break;
                
                case "4":
                i.reset();
                    int delete = Integer.parseInt(getUserInput("enter node to delete: "));
                    int counter = 1;
                    while(counter < items.getSize()){
                        try {
                            i.next();
                        }
                        catch (Exception e){
                            System.out.println(e.getMessage());
                        }
                        
                    }

                    


            }



        }
    }

    public static String getUserInput(String message){
        System.out.print(message);
        return keyboard.nextLine();
    }
 }