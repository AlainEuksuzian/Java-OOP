/*
 * PROGRAMMING PROBLEM:
 * 
 * Define a class to maintain bank accounts of customers. The program should place 
    the code into a try-catch block with multiple catches to check for the validity of 
    various attributes based on the following criteria.

        a. Customer ID must start with a letter and should be followed by three digits.
        b. Account number must be of five digits.
        c. Initial balance must be above $1000.

        Print suitable error matches within the catch block. If any of the criteria mentioned 
        above is not fulfilled, the program should loop back and let the user enter new data.


        Modify the class to include methods for amount deposited and 
        amount withdrawn. Create your own exception class which will check inside 
        the method for the amount deposited so that after the deposit, the maximum 
        balance in the account must not be more than $5000. Also, check inside the 
        method for amount withdrawn so that the available balance after the withdrawal 
        does not go below $1000. Invoke the defined methods from your main method 
        and catch the exceptions.
 * 
 */

public class Main{
    public static void main(String[] args) {
        
        BankRecord myBank = new BankRecord("a111", 12345, 1000);

        // try making a deposit only if final balance < 5000$
        try {
            myBank.makeDeposit(2000);        
        }
        catch (BalanceExceedLimitException e ){
            System.out.println(e.getMessage());
        }

        //try making withdrawal only if final balance > 1000$
        try {
            myBank.makeWithdrawal(500);
        }
        catch (BalanceBelowLimitException e){
            System.out.println(e.getMessage());
        }

        System.out.println(myBank.getBalance()); // works, prints 2500$
    }
}