
/*
 * PROGRAMMING PROBLEM:
    * Redo the class Person in Display 5.19 so that the class Date is a private inner class 
    of the class Person. Also, do a suitable test program. (You need not start from the 
    version produced in Programming Project 13.6. You can ignore Programming 
    Project 13.6 when you do this project.)
 */


public class Main{
    public static void main(String[] args) {
        
        Person person = new Person();


        Person.Date birth = person.new Date(1, "January", 2000);
        Person.Date death = person.new Date(1, "January", 2050);

        Person personOne = new Person("alain Euk", birth, null);

        System.out.println(person);

    }
}