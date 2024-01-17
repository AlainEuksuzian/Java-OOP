/*
PROGRAMMING PROBLEM: 
 * Listed next is the skeleton for a class named City. Each city has a name and temperature:
class City
{
private String cityName;
private double temperature; 
}
 Flesh out the class with appropriate accessors, constructors, and mutators. The temperatures are assigned
  by you and can be set from outside the City class—your 
code does not have to ensure that they are unique. Next, modify the class so that 
it implements the Comparable interface. The class also overrides the compareTo
method. This method imposes an order between instances of the City class 
depending upon their temperature. Test your class by creating an array of sample 
temperatures and sort them in an ascending order using a sorting method that takes 
as input an array of type Comparable
 */

 public class Main{
    public static void main(String[] args) {

        // 3 object initialisation
        City cityOne = new City("montreal", 50);
        City cityTwo = new City("toronto", 20);
        City cityThree = new City("vancouver", 10);

        City[] citites = {cityOne, cityTwo, cityThree};

        // sort cities based on temperature in ascending order
        sorting(citites);

        /*
         * works, prints:
         *  the temperature in: vancouver is: 10.0
            the temperature in: toronto is: 20.0
            the temperature in: montreal is: 50.0
         */
        for (City x: citites){
            System.out.println(x);
        }

        
    }

    /**
     * sorts array in ascending order
     * @param arr
     */
    public static void sorting(Comparable[] arr){
        for (int  i =0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j].compareTo(arr[i]) < 0){
                    Comparable temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
 }