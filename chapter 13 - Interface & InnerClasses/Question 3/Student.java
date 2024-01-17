public class Student implements Comparable<Student> {

    private String lastName;
    private int idNumber;

    Student(){}

    Student(String lname, int id){
        this.lastName = lname;
        this.idNumber = id;
    }

    /**
     * sets lastName instance to parameter
     * @param lnameInput
     */
    public void setLastName(String lnameInput){
        this.lastName = lnameInput;
    }

    /**
     * 
     * @return lastName parameter
     */
    public String getLastName(){
        return this.lastName;
    }

    /**
     * sets idNumber instance to parameter
     * @param idInput
     */
    public void setId(int idInput){
        this.idNumber = idInput;
    }

    /**
     * @return idNumber instance
     */
    public int getId(){
        return this.idNumber;
    }

    /**
     * polymorphs compareTo to compare if idNumber of obj1 comes before obj2
     * @return 0 if equal, 1 if bigger, < 1 if smaller
     */
    @Override
    public int compareTo(Student obj) {
       return Double.compare(getId(), obj.getId());
    }

    /**
     * overrides the tostring method to print instance as text
     * @return text of instance
     */
    @Override
    public String toString() {
        return "the students name is: " + getLastName() + " the student id is: " + getId();
    }


}
