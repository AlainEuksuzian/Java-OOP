
public class LinkedList {
    
    private Node head;

    private class Node{
        private String item;
        private Node link;

        Node(String item, Node link){
            this.item = item;
            this.link = link;
        }
        
    } // end of Node class

    public void addToStart(String toAdd){
        head = new Node(toAdd, head);
    }

    public void deleteHead(){
        head = head.link;
    }

    public int getSize(){
        int size = 0;
        Node position = head;

        while(position != null){
            size++;
            position = position.link;
        }
        return size;
    }

    public String findItem(String toSearch){
        Node position = head;

        while(position != null){
            if (position.item.equalsIgnoreCase(toSearch)){
                System.out.println("item found: ");
                return position.item;
            }
        }
        return null;
    }

    public boolean contains(String toSearch){
        return findItem(toSearch) != null;
    }

    public void outputList(){
        Node position = head;
        while(position != null){
            System.out.println(position.item);
            position = position.link;
        }
    }

    public boolean isEmpty(){
        return getSize() == 0;
    }

    public void clearList(){
        head = null;
    }


}
