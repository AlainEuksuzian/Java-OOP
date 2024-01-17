public class HashMap {
    private LinkedList[] hashArray; 
    private final int size = 20;

    HashMap(){

        hashArray = new LinkedList[20];
        for (int i = 0; i < size; i++){
            hashArray[i] = new LinkedList();
        }
    }

    public int computeHash(String s){
        int hash = 0;
        for (int i = 0; i < s.length(); i++){
            hash += 31 * hash + s.charAt(i);
        }
        return hash % size;
    }

    public boolean containsString(String toSearch){

        int hash = computeHash(toSearch);
        LinkedList value = hashArray[hash];

        if (value.contains(toSearch)){
            return true;
        }
        return false;
    }

    public void put(String toPut){
        int hash = computeHash(toPut);
        LinkedList value = hashArray[hash];

        if (!value.contains(toPut)){
            hashArray[hash].addToStart(toPut);
        }

    }


    
}