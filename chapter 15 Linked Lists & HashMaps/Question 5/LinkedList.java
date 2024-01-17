

public class LinkedList<E extends Comparable<E>>  {
    private Node<E> head;

    private class Node<E>{
        private E item;
        private Node<E> link;

        Node(E item, Node<E> link){
            this.item = item;
            this.link = link;
        }

        Node(){
            this.item = null;
            this.link = null;
        }
    }  // end of Node class
    
    public class Itterator{
        private Node<E> previous;
        private Node<E> position;

        Itterator(Node<E> previous, Node<E> position){
            this.previous = previous;
            this.position = position;
        }

        Itterator(){
            this.previous = null;
            this.position = null;
        }

        public void reset(){
            this.position = head;
        }

        /**
         * returns the next item in list, throws exception if no other next
         * @return
         * @throws Exception
         */
        public E next() throws Exception {
            if (!hasNext()){
                throw new Exception("either empty, or no next");
            }
            else {
                E toReturn = position.item;
                previous = position;
                position = position.link;
                return toReturn;
            }
        }

        /**
         * returns true if there is another item/link in list
         * @return
         */
        public boolean hasNext(){
            return position != null;
        }

       
        /**
         * implements compareTo method to add nodes to list in a ordered/sorted way
         * @param item
         */
        public void addSorted(E item){
            Node<E> toAdd = new Node<E>(item, null);

            if (head == null || head.item.compareTo(item) >= 0){
                toAdd.link = head;
                head = toAdd;
            }
            else {
                Node<E> pointer = head;
                while(pointer.link != null && pointer.link.item.compareTo(item) < 0){
                    pointer = pointer.link;
                }
                toAdd.link = pointer.link;
                pointer.link = toAdd;
            }

        }
       
        }  
        /**
         * itterator for itterator class
         * @return
         */
        public Itterator itterate(){
            return new Itterator();
        }

        /**
         * prints all items in the linked List
         */
        public void outputList(){
            Node<E> position = head;
            while(position != null){
                System.out.println(position.item);
                position = position.link;
            }
        }
    }

   
    

