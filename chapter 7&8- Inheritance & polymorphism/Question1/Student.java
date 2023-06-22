
public class Student extends Person {

    private int studentId;
    private String course;
    private String teacherName;

    Student(String fname, String lname, int id, String course, String teachName){
        super(fname, lname);
        this.studentId = id;
        this.course = course;
        this.teacherName = teachName;
    }


    public String getCourse(){
        return this.course;
    }

    @Override
    public String toString() {
        return "the student first name is: " + super.getFirstName() +
                "\nthe student last name is: " + super.getLastName() +
                "\nthe student id is: " + this.studentId +
                "\nthe teacher name is: " + this.teacherName;
    }

}
