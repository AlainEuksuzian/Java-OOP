
/*
 * PROGRAMMING PROBLEM:
 * 
    * The formula for calculating the exponentiation of a number x with exponent m is:
    ExpResult = x^m
    Write a recursive method named expEvaluate with the following header: 
    public long expEvaluate(int x, int m)
    The method should accept the value of x and m with the following conditions:
    a. Value of x should be in the range 0 < x <=10
    b. Value of m should be in the range 0 <= m <=10
    The method should return the exponent. Also, write the main method to 
    implement the program
 */
public class QuestionFour {
    public static void main(String[] args) {
        QuestionFour obj = new QuestionFour();

        try {
            System.out.println(obj.expEvaluate(2, 34)); // works, throws error
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(obj.expEvaluate(2, 4)); // works prints 16
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * uses recursion to calculate exponent value of parameter only if condition of limit (0-10) met
     * @param x
     * @param m
     * @return
     * @throws Exception if value for base and exponent not within range [0,10]
     */
    public long expEvaluate(int x, int m) throws Exception{

        if ((x > 0 && x <=10) && (m >= 0 && m <= 10)){
            
            if (m == 0){
                return 1;
            }
            else {
                return expEvaluate(x, m - 1) * x;
            }
        }
        else {
            throw new Exception("base should be between 0 and 10 inclusive & exponent should be between 0 and 10 inclusive");
        }
    }
}
