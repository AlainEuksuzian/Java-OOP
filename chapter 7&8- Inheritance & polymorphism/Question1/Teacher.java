public class Teacher extends Person {

    private String subject;
    private double salary;

    Teacher(String fname, String lname, String subject, double salary){
        super(fname, lname);
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "the teacher first name is: " + super.getFirstName() +
        "\nthe teacher last name is: " + super.getLastName() +
        "\nthe teacher subject is: " + this.subject +
        "\nthe teacher salary  is: " + this.salary;
    }


    
    
}
