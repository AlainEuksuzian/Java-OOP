
/*
 * PROGRAMMING PROBLEM:
    * Define an interface named Shape with a single method named area that calculates 
    the area of the geometric shape:
    public double area();
    Next, define a class named Circle that implements Shape. The Circle class should 
    have an instance variable for the radius, a constructor that sets the radius, accessor/ 
    mutator methods for the radius, and an implementation of the area method. Also 
    define a class named Rectangle that implements Shape. The Rectangle class 
    should have instance variables for the height and width, a constructor that sets the 
    height and width, accessor and mutator methods for the height and width, and an 
    implementation of the area method
 */
    import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner query= new Scanner(System.in);

        Rectangle rectOne = new Rectangle(5, 10); // works, prints 50
        Circle circleOne = new Circle(10); // works 

        System.out.println(rectOne.area());
        System.out.println(circleOne.area());

        // stays true as long as height and width not entered correctly (> 0) for rectangle
        boolean looper = true;

        // try manually for methods = works;

        while(looper){
            System.out.println("enter height: ");
            double height = query.nextDouble();
            System.out.println("enter width: ");
            double width = query.nextDouble();
            try {
                rectOne.setHeight(height);
                rectOne.setWidth(width);
                System.out.println(rectOne.area());
                looper = false;
            }
            catch (Exception e){
                System.out.println(e.getMessage() + " try again: ");
            }
        }

        
        
    }
}