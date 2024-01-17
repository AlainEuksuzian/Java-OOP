
public class Stack {

    private Node head;

    private class Node{
        private int item;
        private Node link;

        Node(int item, Node link){
            this.item = item;
            this.link = link;
        }
        Node(){
            this.link = null;
        }
    }
    // end of Node class

    /**
     * adds Node to head (LIFO STACK)
     * @param toAdd
     */
    public void push(int toAdd){
        head = new Node(toAdd, head);
    }

    /**
     * removes and returns head node (LIFO STACK)
     * @return
     */
    public int pop(){
        int toReturn = head.item;
        head = head.link;
        return toReturn;
    }

    /**
     * prints the stack linked list
     */
    public void outputStack(){
        Node position = head;

        while(position != null){
            System.out.println(position.item);
            position = position.link;
        }
    }

    public int getStackSize(){
        int size = 0;
        Node position = head;

        while(position != null){
            size++;
            position = position.link;
        }
        return size;
    }

    /**
     * checks if stack contains parameter input 
     * @param toSearch
     * @return true if a node contains parameter
     */
    public boolean contains(int toSearch){
        Node position = head;

        while(position != null){
            if (position.item == toSearch){
                return true;
            }
            position = position.link;
        }
        return false;
    }
}
