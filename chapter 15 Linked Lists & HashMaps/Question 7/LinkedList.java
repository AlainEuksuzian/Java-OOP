public class LinkedList {
    private Node head;

    private class Node{
        private Employee item;
        private Node link;

        Node(Employee item, Node link){
            this.item = item;
            this.link = link;
        }
        Node(){
            this.item = null;
            this.link = null;
        }

    } // end of node class

    public void addToStart(Employee obj){
        head = new Node(obj, head);
    }

    public void deleteHeadNode(){
        head = head.link;
    }

    public int getListSize(){
        int size = 0;
        Node position = head;

        while(position != null){
            size++;
            position = position.link;
        }
        return size;
    }

    public boolean findItem(Employee obj){
        Node position = head;

        while(position != null){
            if (position.item.equals(obj)){
                return true;
            }
        }
        return false;
    }

    public boolean contains(Employee obj){
        return findItem(obj) != false;
    }
    

    public void outputItems(){
        Node position = head;

        while(position != null){
            System.out.println(position.item);
            position = position.link;
        }
    }


}
