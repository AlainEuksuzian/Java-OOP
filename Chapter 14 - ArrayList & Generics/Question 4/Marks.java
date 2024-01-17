import java.lang.Number;
import java.util.ArrayList;

public class Marks<M extends Number> {
    
    /**
     * takes an arrayList of grades and gets the double value and calculates the average
     * @param grades
     * @return average grade of arrayList
     */
    public double orderAverage(ArrayList<M> grades){
        double average = 0;
        for (M elements : grades){
            average += elements.doubleValue();
        }
        average /= grades.size();
        return average;
    }
}
