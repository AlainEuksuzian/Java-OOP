public class WordLinkedList {
    
    private class Node{
        private String item;
        private Node link;

        Node(String item, Node link){
            this.item = item;
            this.link = link;
        }
        Node(){
            this.item = null;
            this.link = null;
        }
    } // end of node class

    public class Itterator{
        private Node previous;
        private Node position;

        Itterator(Node previous, Node position){
            this.previous = previous;
            this.position = position;
        }

        Itterator(){
            this.previous = null;
            this.position = null;
        }

        public void reset(){
            this.position = head;
            this.previous = null;
        }

        public String next() throws Exception{
            if (position == null){
                throw new Exception("either list is empty, or no next element");
            }
            else {
                String toReturn = position.item;
                position = position.link;
                return toReturn;
            }
           
        }

        public boolean hasNext(){
            return position != null;
        }

        public void addHere(String toAdd){
            if (previous != null && position == null){
                Node nodeAdd = new Node(toAdd, null);
                previous.link = nodeAdd;
                //position = nodeAdd;
            }
            else if (previous == null || position == null){
                head = new Node(toAdd, head);
            }
            else {
                Node nodeAdd = new Node(toAdd, position);
                previous.link = nodeAdd;
                previous = nodeAdd;
            }
        }

        public void deleteNode() throws Exception{
            if (position == null){
                throw new Exception("no nodes to delete");
            }
            else if (previous == null){
                head = head.link;
            }
            else {
                previous.link = position.link;
                position = position.link;
            }
        }

        public String peek(){
            return position.item;
        }

    } // end of itterator class

    private Node head;

    public Itterator itterate(){
        return new Itterator();
    }

    public void addToStart(String toAdd){
        head = new Node(toAdd, head);
    }

    public String findItem(String toSearch){
        Node position = head;
        int location = 1;

        while(position != null){
            if (position.item.equalsIgnoreCase(toSearch)){
                return "found at node: " + location;
            }
            location++;
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


}
