import java.lang.Cloneable;

public class Person  implements Cloneable{
    private String firstName;
    private String lastName;
    private Date date;


    Person(){}

    Person(String fname, String lname, Date date){
        this.firstName = fname;
        this.lastName = lname;
        this.date = date;
    }

    public void setFname(String fnameInput){
        this.firstName = fnameInput;
    }

    public String getFname(){
        return this.firstName;
    }

    public void setLname(String lnameInput){
        this.lastName = lnameInput;
    }
    public String getLname(){
        return this.lastName;
    }

    public Date setDate(int day, String month, int year){
        return this.date = new Date(day, month, year);
    }

    public Date getDate(){
        return this.date;
    }

    @Override
    public String toString() {
        return "the first name is: " + getFname() + " the last name is: " + getLname() + " the date of birth is: " + getDate();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
