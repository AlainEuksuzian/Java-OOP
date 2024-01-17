public class Queue {

    private Node front;  // remove from front
    private Node back;   // add to back

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
    // end of node class


    public boolean removeFront(){
        if (front != null){
            front = front.link;
            return true;
        }
        return false;
    }

    public void addToBack(int toAdd){
        Node item = new Node(toAdd, null);

        if (back == null){
            front = item;
           back = front;
        }
        else {
            back.link = item;
            back = back.link;
        }
    }

    public void displayQueue(){
        Node position = front;

        while(position != null){
            System.out.println(position.item);
            position = position.link;
        }
    }

    public boolean containsItem(int toSerch){
        Node position = front;

        while(position != null){
            if (position.item == toSerch){
                return true;
            }
            position = position.link;
        }
        return false;
    }

    public int getSize(){
        int size = 0;
        Node position = front;
        
        while(position != null){
            size++;
            position = position.link;
        }
        return size;
    }

}
