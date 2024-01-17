

/*PROGRAMMING PROBLEM: 

Write a generic class, Marks, with a type parameter M where M is a numeric object 
type (e.g., Integer, Double, or any class that extends java.lang.Number). Add 
a method named orderAverage that takes an ArrayList of type M and returns 
a double type data which is the average of the values in the ArrayList. Use the 
doubleValue() method in the Number class to retrieve the value of each number 
as a double. Test your method with suitable data. Your program should generate 
a compile-time error if your average method is invoked on an ArrayList and a 
nonnumeric element is encountered (e.g., Strings).
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    private static Scanner keyboard = new Scanner(System.in);
    private static ArrayList<Double> grades = new ArrayList<>(5);
    private static Marks<Double> obj = new Marks<>();
   
    public static void main(String[] args) {

        System.out.println("add values ");
        addValues();

       
        System.out.println(obj.orderAverage(grades));

        
        
    }

    /**
     * asks user to input grades that gets added to the grades arrayList
     */
    public static void addValues() {

        while(true){
            try {
                double gradeInput = getUserInput("enter the grade to add: ");
                grades.add(gradeInput);
                System.out.println("continue adding grades? (Y//N): ");
                String option = keyboard.next();
                if (option.equalsIgnoreCase("n")){
                    break;
                }
            }
            catch (Exception e){
                System.out.println("cannot add strings only numeric values");
            }
        }
    }

    /**
     * subrouting to get user input in the form of double
     * @param message
     * @return
     */
    public static double getUserInput(String message){
        System.out.print(message);
        return keyboard.nextDouble();
    }

   
}