
/*
    PROGRAMMING PROBLEM: 

Create a class named Employee that can be used to calculate the salaries of different 
employees. The Employee class should keep a track of the employee ID, name, department, salary, and designation with appropriate accessor and mutator methods. 
Also create an equals() method that overrides Object’s equals() method, 
where employees can check if their designation is identical.

Next, create two additional classes named Manager and Clerk that are derived from Employee. Create an 
overridden method named addBonus that returns the salary of the employee after 
adding up the bonus. There is a default bonus of $200/month. Managers have a 
bonus of $300/month and clerks have a bonus of $100/month. Finally create a display method to print the details of the employee. You may assume the initial salary 
of an employee and other necessary values. Test your classes from a main method.

 */

public class Main {
    public static void main(String[] args) {

        Manager managerOne = new Manager(12345, "boss One", "sales", 10000, null);
        Manager managerTwo = new Manager(1111, "boss two", "sales", 11111, null);
        Clerk clerkOne = new Clerk(111, "clerk One", "accounting", 50000, "designer");

        System.out.println(managerOne.getDepartment().equals(managerTwo.getDepartment())); // works, prints true

        System.out.println(managerOne.addBonus()); // works prints salary + 500
        System.out.println(clerkOne.addBonus());  // works prints 50300

        
        
    }
}
