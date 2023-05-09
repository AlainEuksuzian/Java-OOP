package chapterFourClassesMethods.Question9;


/*Define a class named Money whose objects represent amounts of U.S. 
money. The class should have two instance variables of type int for the dollars and 
cents in the amount of money. Include a constructor with two parameters of type 
int for the dollars and cents, one with one constructor of type int for an amount of 
dollars with zero cents and a no-argument constructor. Include the methods add and 
minus for addition and subtraction of amounts of money. These methods should be 
static methods, should each have two parameters of type Money, and return a value 
of type Money. Include a reasonable set of accessor and mutator methods as well as 
the methods equals and toString. Write a test program for your class.

 Part Two: Add a second version of the methods for addition and subtraction. 
These methods should have the same names as the static version but should use a 
calling object and a single argument. For example, this version of the add method 
(for addition) has a calling object and one argument. So m1.add(m2) returns the 
result of adding the Money objects m1 and m2. Note that your class should have all 
these methods; for example, there should be two methods named add. */

public class Money {

    private int dollars;
    private int cents;

    
    Money(){}

    Money(int dollar, int cents){
        try {
            setDollar(dollar);
            setCents(cents);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    Money(int dollar){
        try {
            setDollar(dollar);
            this.cents = 0;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }


    /**
     * sets the parameter to dollars instance variable
     * @param dollarInput
     * @throws Exception if dollar input is a negative number
     */
    public void setDollar(int dollarInput) throws Exception{
        if (dollarInput < 0){
            throw new Exception("cannot be negative for dollars");
        }
        else {
            this.dollars = dollarInput;
        }
    }

    /**
     * sets parameter to cents instance variable
     * @param centInput
     * @throws Exception if parameter is a negative input for cents
     */
    public void setCents(int centInput) throws Exception{
        if (centInput < 0 || centInput > 99){
            throw new Exception("cent has to be within 0-99 range");
        }
        else {
            this.cents = centInput;
        }
    }

    /**
     * @return dollar instance
     */
    public int getDollars(){
        return this.dollars;
    }

    /**
     * @return cents instance
     */
    public int getCents(){
        return this.cents;
    }

    /**
     * takes 2 objects and adds the dollars and cents
     * @param moneyOne of type Money
     * @param moneyTwo of type Money
     * @return new object of type money that adds dollar and cents
     */
    public static Money add(Money moneyOne, Money moneyTwo){
        return new Money(moneyOne.dollars + moneyTwo.dollars, moneyOne.cents + moneyTwo.cents);
    }

        /**
     * takes 2 objects and subtracts the dollars and cents
     * @param moneyOne of type Money
     * @param moneyTwo of type Money
     * @return new object of type money that subtracts dollar and cents
     */
    public static Money minus(Money moneyOne, Money moneyTwo){
        return new Money(moneyOne.dollars - moneyTwo.dollars, moneyOne.cents - moneyTwo.cents);
    }

    /**
     * @return returns the total balance as a String form
     */
    @Override
    public String toString() {
        return "the amount of money in your account is: " + getDollars() + "," + getCents();
    }

    /**
     * compares 2 objects of type money to see if both accounts have the same balance
     * condition: parameter has to be an instance of Money class
     * @return boolean (true if balance is the same, false otherwise)
     */
    @Override
    public boolean equals(Object obj) {

        Money object;

        if (obj instanceof Money){
            object = (Money) obj;
            return (this.getDollars() == object.getDollars() && this.getCents() == object.getCents());
        }
        return false; // if obj NOT instance of Money
    }

    /**
     * takes 2 objects and adds together after rectifying cents value (/100)
     * @param object to add 2 balances together
     * @return double value of final balance
     */
    public double add(Money object){
        return (this.dollars + object.dollars) + ((this.cents/100 + object.cents/100));
    }

    /**
     * takes 2 objects and subtracts them after rectifying cents value (/100)
     * @param object to subtract 2 balances together
     * @return double value of final balance
     */
    public double minus(Money object){
        return (this.dollars + object.dollars) + (((double)this.cents + (double) object.cents)/100);
    }
}
