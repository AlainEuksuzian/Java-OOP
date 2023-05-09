package chapterFourClassesMethods.Question4;

public class StudentRecord {

    private double quizOne, quizTwo, quizThree;
    private double midterm;
    private double finalExam;
    private double finalGrade;

    private final double quizWeight = 25;
    private final double midtermWeight = 35;
    private final double finalExamWeight = 40;


    StudentRecord(){}

    StudentRecord(double quizOne, double quizTwo, double quizThree, double midterm, double examFinal){
        setQuizOne(quizOne);
        setQuizTwo(quizTwo);
        setQuizThree(quizThree);
        setMidtermGrade(midterm);
        setFinalExamGrade(examFinal);
    }

    /**
     * Takes an input from user and assigns the input to quizOne instance if condition (< 10 || > 0) is met
     * @param = double input for grade of quiz 1
     */
    public void setQuizOne(double quizOneInput){
        if (quizOneInput > 10 || quizOneInput < 0){
            System.out.println("error: quiz 1 graded on 10");
            System.exit(0);
        }
        this.quizOne = quizOneInput;
    }

     /**
     * Takes an input from user and assigns the input to quizTwo instance if condition (< 10 || > 0) is met
     * @param = double input for grade of quiz 2
     */
    public void setQuizTwo(double quizTwoInput){
        if (quizTwoInput > 10 || quizTwoInput < 0){
            System.out.println("error: quiz 2 graded on 10");
            System.exit(0);
        }
        this.quizTwo = quizTwoInput;
    }

     /**
     * Takes an input from user and assigns the input to quizThree instance if condition (< 10 || > 0) is met
     * @param = double input for grade of quiz 3
     */
    public void setQuizThree(double quizThreeInput){
        if (quizThreeInput > 10 || quizThreeInput < 0){
            System.out.println("error: quiz 3 graded on 10");
            System.exit(0);
        }
        this.quizThree = quizThreeInput;
    }

    /**
    * @return quizOne
    */
    public double getQuizOne(){
        return this.quizOne;
    }

     /**
    * @return quizTwo 
    */
    public double getQuizTwo(){
        return this.quizTwo;
    }

    /**
    * @return the value of quizThree
    */
    public double getQuizThree(){
        return this.quizThree;
    }


    /**
     * sets the parameter to midterm instance if condition ( > 0 || < 100) is met
     * @param midtermInput
     */

    public void setMidtermGrade(double midtermInput){

        if (midtermInput > 100 || midtermInput < 0){
            System.out.println("error: midterm graded on 100");
            System.exit(0);
        }
        this.midterm = midtermInput;
    }

    /**
     * @return midterm instance
     */
    public double getMidterm(){
        return this.midterm;
    }

    public void setFinalExamGrade(double examInput){
        if (examInput > 100 || examInput < 0){
            System.out.println("error: final exam graded on 100");
            System.exit(0);
        }

        this.finalExam = examInput;
    }

    public double getFinalExamGrade(){
        return this.finalExam;
    }

    /**
     * 
     * @return the final grade weighted based on individual task weight
     */
    public double computeFinalGrade(){

        double quizWeighted = (getQuizOne() + getQuizTwo() + getQuizThree())/3 * (quizWeight / 10);
        double midtermWeighted = getMidterm() * (midtermWeight / 100);
        double finalExamweighted = getFinalExamGrade() * (finalExamWeight / 100);

        this.finalGrade = quizWeighted + midtermWeighted + finalExamweighted;

        return this.finalGrade;
    }

    /**
     * @return a String of all the grades and explanation
     */
    
    @Override
    public String toString() {
        return "quiz one grade: " + getQuizOne() + "\nquiz two grade: " + getQuizTwo() +"\nquiz Three grade: " + getQuizThree() 
        + "\nmidterm grade: " + getMidterm() + "\nfinal Exam grade: " + getFinalExamGrade() + "\nyour final grade is: " + getFinalExamGrade()
        + "\nyour final letter grade is: " + converToLetter();
    }

    /**
     * sets parameter of type object to StudentRecord and compares if 2 objects have the same final grade
     * @param Object 
     * @return boolean (true if same final grade)
     */
    @Override
    public boolean equals(Object obj) {

        StudentRecord other;

        if (obj instanceof StudentRecord){
            other = (StudentRecord) obj;
            return (this.computeFinalGrade() == other.computeFinalGrade());
        }
        return false;
    }

    public char converToLetter(){
        double grade = computeFinalGrade();
        char outputLetter = ' ';

        if (grade >= 90){
            outputLetter = 'A';
        }
        else if (grade >= 80 && grade < 90){
            outputLetter = 'B';
        }
        else if (grade >= 70 && grade < 80){
            outputLetter = 'C';
        }
        else if (grade >= 60 && grade < 70){
            outputLetter = 'D';
        }
        else {
            outputLetter = 'F';
        }
        return outputLetter;
    }

}
