import java.lang.Cloneable;

public class Date  implements Cloneable{
    private int day;
    private String month;
    private int year;

    


    Date(){}

    Date(int day, String month, int year){
        this.day = day;
        this.month = month;
        try {
            setYear(year);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void setYear(int inputYear) throws Exception{
        if (inputYear > 2023){
            throw new Exception("year cannot be in the future");
        }
        else {
            this.year = inputYear;
        }
    }

    public int getYear(){
        return this.year;
    }

    public void setMonth(String monthInput){
       this.month = monthInput;
    }

    public String getMonth(){
        return this.month;
    }

    public void setDay(int dayInput){
        this.day = dayInput;
    }

    public int getDay(){
        return this.day;
    }

    @Override
    public String toString() {
        return " " + this.day + " " + this.month + " " + this.year;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
