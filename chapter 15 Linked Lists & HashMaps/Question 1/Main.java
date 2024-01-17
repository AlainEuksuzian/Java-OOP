
/*PROGRAMMING PROBLEM:
 * Create a generic linked list that holds an item class in its node. use nodes inner class, and
 *  itterator inner class. include the following methods:
 * iterator class: 
-next
hasnext
peek
addhere
delete
-----
linked list class: 
addstart
deletehead
getsize
finditem
contains
outputlist
isempty
clearlist
equal
 */

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Item itemOne = new Item("alain", 30);
        Item ItemTwo = new Item("jack", 29);
        Item itemThree = new Item("jessica", 30);
        Item itemFour = new Item("joseph", 30);


        LinkedList<Item> list = new LinkedList<>();
        LinkedList<Item> listTwo = new LinkedList<>();
       

        LinkedList<Item>.Itterator first = list.itterate();
        LinkedList<Item>.Itterator second = listTwo.itterate();
        
        first.restart();
        second.restart();

      
        first.addHere(ItemTwo);
        first.addHere(itemOne);


        second.addHere(ItemTwo);
        second.addHere(itemOne);
       
    }
}

