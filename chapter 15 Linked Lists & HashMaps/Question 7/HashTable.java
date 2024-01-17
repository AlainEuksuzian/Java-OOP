public class HashTable {

    private LinkedList[] hashTable;
    private final int size = 20;

    HashTable(){
        hashTable = new LinkedList[20];
        for (int i = 0; i < hashTable.length; i++){
            hashTable[i] = new LinkedList();
        }
    }

    public int computeHashValue(Employee object){
        String toString = object.toString();
        int hash = 0;

        for (int i = 0; i < toString.length(); i++){
            hash += 31 * hash + toString.charAt(i);
        }
        return Math.abs(hash) % size;
    }

    public boolean contains(Employee obj){
        int hash = computeHashValue(obj);
        LinkedList val = hashTable[hash]; 

        if (val.contains(obj)){
            return true;
        }
        return false;
    }

    public boolean put(Employee obj){
        int hash = computeHashValue(obj);
        
        LinkedList val = hashTable[hash]; 
       
        if (!val.contains(obj)){
            hashTable[hash].addToStart(obj);
            return true;
        }
        System.out.println("cannot add collision");
        return false;

    }

    public void outputTable(){
        for (int i = 0; i < hashTable.length; i++){
            hashTable[i].outputItems();
        }
    }
}

