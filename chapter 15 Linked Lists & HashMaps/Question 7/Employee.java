public class Employee {
    private String firstName;
    private String lastName;
    private String hireDate;

    Employee(String fname, String lName, String hireDate){
        this.firstName = fname;
        this.lastName = lName;
        this.hireDate = hireDate;
    }
    Employee(){}

    public void setFirstName(String fname){
        this.firstName = fname;
    }

    public void setLastName(String lname){
        this.lastName = lname;
    }

    public void setDate(String dateInput){
        this.hireDate = dateInput;
    }

    public String getFirstName(){
        return this.firstName ;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getDate(){
        return this.hireDate;
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName() + " " + getDate();
    }

    @Override
    public boolean equals(Object obj) {
        Employee object;

        if (obj instanceof Employee){
            object = (Employee) obj;
            return (this.getFirstName().equalsIgnoreCase(object.getFirstName()) && this.getLastName().equalsIgnoreCase(object.getLastName()) && 
            this.getDate().equalsIgnoreCase(object.getDate()));
        }
        return false;
    }


}
