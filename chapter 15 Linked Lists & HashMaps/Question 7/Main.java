

public class Main{
    public static void main(String[] args) {

        HashTable hash = new HashTable();
        LinkedList items = new LinkedList();

        Employee empOne = new Employee("alain", "euk", "june1");
        Employee empTwo = new Employee("jack", "john", "june1");

    

        hash.put(empOne);
        hash.put(empTwo);

        hash.outputTable();
      
        
    }
}