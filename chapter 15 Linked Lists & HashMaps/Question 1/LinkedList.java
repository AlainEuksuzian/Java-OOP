import java.security.spec.ECGenParameterSpec;

public class LinkedList<E>{
    private Node<E> head;

    // inner class Node to avoid setter/getter boilerPlate code
    private class Node<E>{
        private E item;
        private Node<E> link;

        Node(){
            this.item = null;
            this.link = null;
        }

        Node(E item,Node<E> link){
            this.item = item;
            this.link = link;
        }

    }
    //end of node class

    // second innerClass Itterator 
    public class Itterator{
        private Node<E> position;
        private Node<E> previous;

        Itterator(Node<E> position, Node<E> previous){
            this.position = position;
            this.previous = previous;
        }
        Itterator(){
            this.position = head;
            this.previous =null;
        }

        /**
         * resets the position of the itterator
         */
        public void restart(){
            this.position = head;
            this.previous =null;
        }

        /**
         * gets the next Item of the linkedList
         * @return generic type E of the next node item
         */
        public E next(){

            if (!hasNext()){
                System.out.println("no more next");
                return null;
            }
            else {
                E toReturn = position.item;
                previous = position;
                position = position.link;
                return toReturn;
            }
        }

        /**
         * returns true if end of list or no linked list
         * @return
         */
        public boolean hasNext(){
            return position != null;
        }

        /**
         * returns the current item of the linked list
         * @return generic type
         */
        public E peek(){
            return position.item;
        }

        /**
         * adds a new Node to the link list factoring in 3 possibilities: add to start or add to end or add between 2 nodes
         * @param item generic type object to be added
         */
        public void addHere(E item){
            if (previous == null || position != null){
                head = new Node<E>(item, head);
            }
            else if (previous != null && position == null){
                Node<E> toAdd = new Node<E>(item, null);
                previous.link = toAdd;
                position = toAdd;
            }
            else {
                Node<E> toAdd = new Node<E>(item, position);
                previous.link = toAdd;
                previous = toAdd;
            }
        }

        /**
         * deletes nodes factoring in 3 possibilities: add to start or add to end or add between 2 nodes
         */
        public void delete(){
            if (position == null){
                System.out.println("nothing to delete");
            }
            else if (previous == null) {
                head = head.link;
            }
            else {
                previous.link = position.link;
                position = position.link;
            }
        } 
    }
        // *********** end of itterator class ****************

    /**
     * itterator class 
     * @return
     */
    public Itterator itterate(){
        return new Itterator();
    }



    /**
     * adds a new node at the head
     * @param item
     */
    public void addToStart(E item){
        head = new Node<E>(item, head);
    }

    /**
     * deletes head node, leaves for garbage collector
     */
    public void deleteHead(){
        head = head.link;
    }

    /**
     * calculates the size of the list
     * @return int value indicating the size of the list
     */
    public int getSize(){
        int sizeCounter = 0;
        Node<E> position = head;

        while(position != null){
            sizeCounter++;
            position = position.link;
        }
        return sizeCounter;
    }

    /**
     * loops through the list to see if parameter input is inside the list
     * @param toSearch
     * @return
     */
    public boolean findItem(E toSearch){
        Node<E> position = head;
        int counter = 1;

        while(position != null){
            if (position.item.equals(toSearch)){
                System.out.println("item found: " + position.item + " at node: " + counter);
                return true;
            }
            counter++;
        }
        System.out.println("item not in list");
        return false;
    }

    /**
     * boolean to find item 
     * @param toFind
     * @return
     */
    public boolean contains(E toFind){
        return findItem(toFind) != false;
    }

    /**
     * prints every item of the nodes in the list
     */
    public void outputList(){
        Node<E> position = head;

        while(position != null){
            System.out.println(position.item);
            position = position.link;
        }
    }

    /**
     * returns true if not empty
     * @return
     */
    public boolean isEmpty(){
        return getSize() != 0;
    }

    /**
     * nulls the head for garbage collector to get all the remaining list
     */
    public void clearList(){
        head = null;
    }

    /**
     * returns true if 2 linkedLists have the same Node items in the same order
     */
    @Override
    public boolean equals(Object obj) {
        LinkedList<E> object = (LinkedList<E>) obj;
        Node<E> position = head;
        Node<E> otherPosition = object.head;

        if (!(obj instanceof LinkedList)){
            return false;
        }
        else if (this.getSize() != object.getSize()){
            return false;
        }
        else {
            while(position != null){
                if (!position.item.equals(otherPosition.item)){
                    return false;
                }
                position = position.link;
                otherPosition = otherPosition.link;
            }
        }
        return true;
    }
}