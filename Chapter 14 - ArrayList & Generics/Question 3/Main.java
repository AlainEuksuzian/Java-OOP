
/*PROGRAMMING PROBLEM:

 * Many Global Positioning Satellite (GPS) units can record waypoints. The waypoint 
marks the coordinates of a location on a map along with a timestamp. Consider a 
GPS unit that stores waypoints in terms of an (X,Y) coordinate on a map together 
with a timestamp t that records the number of seconds that have elapsed since the 
unit was turned on. Write a program that allows the user to enter as many waypoints as desired, storing each waypoint in an ArrayList, where each waypoint is 
represented by a class that you design. Each waypoint represents a successive sample 
point during a hike along some route. The coordinates should be input as doubles, 
and the timestamp as an integer. Have your program compute the total distance 
traveled and the average speed in miles per hour. Use the map scaling factor of 
1 = 0.1 miles. For example, if the only two waypoints are (X=1,Y=1,T=0) and 
(X=2,Y=1,T=3600), then the hiker traveled a distance of 0.1 miles in 3,600 seconds, or 0.1 miles per hour.
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    private static Scanner keyboard = new Scanner(System.in);
    private static ArrayList<Gps> gpsValues = new ArrayList<>(5);

    public static void main(String[] args) {

        System.out.println("start by adding waypoints: ");
        addWaypoints();

        System.out.println("your total added waypoints are: ");
        displayValues();

        System.out.println("the total time traveled is: " + calculateTotalTime());
        System.out.println("the total distance you traveled is: " + calcualateTotalDistance());

        
    }   

    /**
     * continuously allows the user to enter X value, Y value and timestamp
     */
    public static void addWaypoints(){

        while(true){
            double xInput = getUserInputDouble("enter the x waypoint: ");
            double yInput = getUserInputDouble("enter the y waypoint: ");
            int timeInput = getUserInputint("enter timestamp: ");

            Gps object = new Gps(xInput, yInput, timeInput);
            gpsValues.add(object);
            System.out.println("keep adding? (Y/N): ");
            String option = keyboard.next();    
            if (option.equalsIgnoreCase("n")){
                break;
            }
        }
    }

    /**
     * displays all elements of the arrayList object using the tostring method from Gps class
     */
    public static void displayValues(){
        for (Gps elements: gpsValues){
            System.out.println(elements);
        }
    }

    /**
     * calculates time from arrayList from firsts object to last object in arrayList
     * @return
     */
    public static int calculateTotalTime(){
        return gpsValues.get(0).computeTime(gpsValues.get(gpsValues.size()-1));
    }

    /**
     * calculates total distance for all objects in the Gpsvalue arrayList
     * @return double total distance traveled
     */
    public static double calcualateTotalDistance(){
        double totalDistance = 0;
        if (gpsValues.size() > 1){
            for (int i =1; i < gpsValues.size(); i++){
                totalDistance += gpsValues.get(i-1).getDistance(gpsValues.get(i));
            }
            return totalDistance;
        }
        else {
            System.out.println("not enough waypoints to calculate distance");
            return 0;
        }
    }


    //--------------------------following methods are subroutines to avoid code repetition -------------------------------

    /**
     * subroutine to get user Input in form of double
     * @param message
     * @return
     */
    public static double getUserInputDouble(String message){
        System.out.print(message);
        return keyboard.nextDouble();
    }

    /**
     * subroutine to get user Input in form of int
     * @param message
     * @return
     */
    public static int getUserInputint(String message){
        System.out.print(message);
        return keyboard.nextInt();
    }
}
