public class WordLinkedList {
    private Node head;

    private class Node{
        private String item;
        private Node link;

        Node(){
            this.item = null;
            this.link = null;
        }
        Node(String item, Node link){
            this.item = item;
            this.link = link;
        }
    }
    //end of Node class

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

        public String next() throws Exception{
            if (position == null){
                throw new Exception("either end of node, or node empty");
            }
            else {
                String toReturn = position.item;
                previous = position;
                position = position.link;
                return toReturn;
            }
        }

        public boolean hasNext(){
            return position != null;
        }

        public String peek(){
            return position.item;
        }

        public void addHere(String item){
            if (previous != null && position == null){
                Node toAdd = new Node(item, null);
                previous.link = toAdd;
            }
            else if (previous == null || position == null){
                Node toAdd = new Node(item, head);
                position.link = toAdd;
            }
            else {
                Node toAdd = new Node(item, position);
                previous.link = toAdd;
                position = toAdd;
            }
        }

        public void delete() throws Exception{
            if (previous == null){
                head = head.link;
                position = head;
            }
            else if (position == null){
                throw new Exception("no node to delete");
            }
            else {
                previous.link = position.link;
                position = position.link;
            }
        }
    }
    // end of itterator class

    public Itterator itterate(){
        return new Itterator();
    }

    public void addToStart(String item){
        head = new Node(item, head);
    }

    public void deleteHead(){
        head = head.link;
    }

    public String findItem(String toSearch){
        Node position = head;

        while(position != null){
            if (position.item.equalsIgnoreCase(toSearch)){
                return position.item;
            }
            position = position.link;
        }
        return null;
    }

    public boolean contains(String toSearch){
        return findItem(toSearch) != null;
    }

    public int getSize(){
        Node position = head;
        int size = 0;

        while(position != null){
            size++;
            position = position.link;
        }
        return size;
    }

    public void outputList(){

        Node position = head;

        while(position != null){
            System.out.println(position.item);
            position = position.link;
        }
    }

}
