package chapterFourClassesMethods.Question8;

/*Define a class called Fraction. This class is used to represent a ratio of two integers. Include mutator methods that allow the user to set the numerator and the 
denominator. Also include a method that displays the fraction on the screen as a 
ratio (e.g., 5>9). This method does not need to reduce the fraction to lowest terms.
 Include an additional method, equals, that takes as input another Fraction and 
returns true if the two fractions are identical and false if they are not. This 
method should treat the fractions reduced to lowest terms; that is, if one fraction 
is 20>60 and the other is 1>3, then the method should return true.
 Embed your class in a test program that allows the user to create a fraction. Then 
the program should loop repeatedly until the user decides to quit. Inside the body 
of the loop, the program should allow the user to enter a target fraction into an 
anonymous object and learn whether the fractions are identical. */

public class Fractions {

    private int numerator;
    private int denominator;

    Fractions(){}

    Fractions(int num, int denom){
        this.numerator = num;
        try {
            setDenominator(denom);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * sets parameter to numerator instance
     * @param numInput
     */
    public void setNumerator(int numInput){
        this.numerator = numInput;
    }

    /**
     * @return numerator instance
     */
    public int getNumerator(){
        return this.numerator;
    }

    /**
     * sets parameter to denominator instance
     * @param denomInput 
     * @throws Exception for 0 denomiator
     */
    public void setDenominator(int denomInput) throws Exception{
        if (denomInput == 0){
            throw new Exception("denominator cannot be zero");
        }
        else {
            this.denominator = denomInput;
        }
    }

    /**
     * @return denominator instsance
     */
    public int getDenominator(){
        return this.denominator;
    }

    @Override
    public String toString() {
        return this.numerator + " / " + this.denominator;
    }


    @Override
    public boolean equals(Object obj) {
        Fractions object;
        if (obj instanceof Fractions){
            object = (Fractions) obj;
            return ((this.numerator/this.denominator) == (object.numerator/object.denominator));
        }
        return false;
    }
}
