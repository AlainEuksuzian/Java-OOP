public class BankRecord {

    private String customerId;
    private int accountNumber;
    private double balance;

    BankRecord(){}

    BankRecord(String id, int accNumber, double balance){
        try {
            setCustomerId(id);
            setAccountNumber(accNumber);
            setBalance(balance);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * assign parameter to instance only if conditions met. ALTERNATIVELY REGEX could be used: !idInput.matches("[a-zA-Z]\\d{3}"
     * @param idInput
     * @throws Exception if parameter is not 4 digits and if not in format 1 letter 3 numbers
     */
    public void setCustomerId(String idInput) throws Exception{

        if (idInput.length() != 4){
            throw new Exception("input must be 4 characters (1 letter, 3 numbers)");
        }
        else {
            if (!Character.isLetter(idInput.charAt(0))){
                throw new Exception("first character must be a letter followed by 3 numbers");
            }
            if (!Character.isDigit(idInput.charAt(1)) || !Character.isDigit(idInput.charAt(2))
                || !Character.isDigit(idInput.charAt(3))){
                throw new Exception("after first letter, there must be 3 digits");
            }
        }
        this.customerId = idInput;
    }

    /**
     * @return customerId instance variable
     */
    public String getCustomerId(){
        return this.customerId;
    }

    /**
     * assigns parameter to accountNumber instance variable only if parameter is 5 digits
     * @param accInput
     * @throws Exception if parameter is not 5 digits
     */
    public void setAccountNumber(int accInput) throws Exception{

        int inputCopy = accInput;
        int counter = 0;

        while (inputCopy > 0){
            inputCopy /= 10;
            counter++;
        }
        if (counter != 5){
            throw new Exception("account number must be 5 digits");
        }
        else {
            this.accountNumber = accInput;
        }

    }

    /**
     * @return accountNumber instance
     */ 
    public int getAccountNumber(){
        return this.accountNumber;
    }

    /**
     * sets parameter to balance instance only if 1000$ or more
     * @param balanceInput
     * @throws Exception if parameter below 1000$
     */
    public void setBalance(double balanceInput) throws Exception{

        if (balanceInput < 1000){
            throw new Exception("initial balance must be 1000$ or over");
        }
        else {
            this.balance = balanceInput;
        }
    }

    /**
     * @return balace instance variable
     */
    public double getBalance(){
        return this.balance;
    }

    /**
     * adds deposit amount parameter to balance instance only if total balance below 5000
     * @param depositInput
     * @throws BalanceExceedLimitException
     */
    public void makeDeposit(double depositInput) throws BalanceExceedLimitException {

        if (this.balance + depositInput > 5000){
            throw new BalanceExceedLimitException();
        }
        else {
            this.balance += depositInput;
        }
    }

    /**
     * subtracts withdrawal amount from balance only if final balance >= 1000$
     * @param withdrawalAmount
     * @throws BalanceBelowLimitException if final balance falls below 1000
     */
    public void makeWithdrawal(double withdrawalAmount) throws BalanceBelowLimitException{
        
        if (this.balance - withdrawalAmount < 1000){
            throw new BalanceBelowLimitException("balance cannot fall below 1000$");
        }
        else {
            this.balance -= withdrawalAmount;
        }
    }

    
}
