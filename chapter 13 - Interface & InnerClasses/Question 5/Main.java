

/*
    PROGRAMMING PROBLEM: 

 * Redo the class Person in Display 5.19 so that it implements the Cloneable
interface. This may require that you also redo the class Date so it implements the 
Cloneable interface. Also, do a suitable test program.
 */

public class Main {
    public static void main(String[] args) {

        Person personOne = new Person("alain", "euk", new Date(1, "march", 1993));
        Person personTwo = null;

        try{
             personTwo =(Person) personOne.clone();
        }
        catch (CloneNotSupportedException e){
            System.out.println(e.getMessage());
        }

        System.out.println(personOne);
        System.out.println(personTwo);
    }


}