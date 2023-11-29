
public class Fractions {

    private int numerator;
    private int denominator;

    Fractions(){}

    Fractions(int numeratorInput, int denom){

        this.numerator = numeratorInput;

        try {
            setDenominator(denom);
        }
        catch (DenominatorIsZeroException e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * sets parameter to numerator instance
     * @param numeratorInput
     */
    public void setNumerator(int numeratorInput){
        this.numerator = numeratorInput;
    }

    /**
     * @return numerator parameter
     */
    public int getNumerator(){
        return this.numerator;
    }

    /**
     * sets denominator instance to parameter only if denominator is NOT zero
     * @param denominatorInput
     * @throws DenominatorIsZeroException if parameter = 0
     */
    public void setDenominator(int denominatorInput) throws DenominatorIsZeroException{
        if (denominatorInput == 0){
            throw new DenominatorIsZeroException();
        }
        else {
            this.denominator = denominatorInput;
        }
    }

    /**
     * @return denominator parameter
     */
    public int getDenominator(){
        return this.denominator;
    }

    /**
     * @return numerator and denominator as a string
     */
    @Override
    public String toString() {
        return getNumerator() + "/" + getDenominator();
    }

    /**
     * overrides equals method to compare 2 fraction objects to equality
     * @return true if both objects are equal, false otherwise;
     */
    @Override
    public boolean equals(Object obj) {
        Fractions object;
        if (obj instanceof Fractions){
            object = (Fractions) obj;
            return (this.getNumerator() / this.getDenominator() == (object.getNumerator() / object.getDenominator()));
        }
        return false;
    }

}
