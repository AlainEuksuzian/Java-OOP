
/*
 * PROGRAMMING PROBLEM:
 * Create a Student class that has instance variables for the student’s last name and 
ID number, along with appropriate constructors, accessors, and mutators. Make the 
Student class implement the Comparable interface. Define the compareTo method 
to order Student objects based on the student ID number. In the main method, 
create an array of at least five Student objects, sort them using Arrays.sort, and 
output the students. They should be listed by ascending student number. Next, 
modify the compareTo method so it orders Student objects based on the lexicographic ordering of their last name. Without modification to the main method, the 
program should now output the students ordered by name.
 */
import java.util.Arrays;

 public class Main{
    public static void main(String[] args) {

        Student studentOne = new Student("alain", 12345);
        Student studentTwo = new Student("john", 99999);
        Student studentThree = new Student("anna", 11111);
        Student studentFour = new Student("emily", 55555);
        Student studentFive = new Student("jack", 77777);

        Student[] students = {studentOne, studentTwo, studentThree, studentFour, studentFive};

        Arrays.sort(students);

        for (Student x: students){
            System.out.println(x);
        }

        /*
         * works, prints: 
         *  the students name is: anna the student id is: 11111
            the students name is: alain the student id is: 12345
            the students name is: emily the student id is: 55555
            the students name is: jack the student id is: 77777 
            the students name is: john the student id is: 99999
         */


        
    }
 }