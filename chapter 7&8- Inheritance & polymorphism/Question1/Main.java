
/*
 * Define a class named Person that contains two instance variables of type String 
that stores the first name and last name of a person and appropriate accessor and 
mutator methods. Also create a method named displayDetails that outputs the 
details of a person. Next, define a class named Student that is derived from Person, 
the constructor for which should receive first name and last name from the class 
Student and also assigns values to student id, course, and teacher name. This class 
should redefine the displayDetails method to person details as well as details of 
a student. Include appropriate constructor(s). Define a class named Teacher that
is derived from Person. This class should contain instance variables for the subject 
name and salary. Include appropriate constructor(s). Finally, redefine the 
displayDetails method to include all teacher information in the printout. 
Create a main method that creates at least two student objects and two teacher 
objects with different values and calls displayDetails for each.
 */

public class Main {
   public static void main(String[] args) {

      Person personOne = new Person("john", "doe");
      Student stuOne = new Student("alain", "euk", 12345, "business", "businessTeacher");
      Teacher teachOne = new Teacher("teacherFirst", "teacherLast", "business", 12345);


      System.out.println(personOne); //works
      System.out.println(stuOne); // works
      System.out.println(teachOne); //works


   } 
}
