public class Sms extends Message {

    private int recipientContactNo;

    //empty constructor
    Sms(){}

    /**
     * assigns both inherited instance and local instsace to parameters
     * @param txt
     * @param number
     */
    Sms(String txt, int number) {
        super(txt);
        try{
            setRecipientNumber(number);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
       
    }
    
    /**
     * assigns paramter to instance only if parameter equals 10 digits
     * @param number
     * @throws Exception if the number is below 10 digits (3 digit for area code, 7 digit for number)
     */
    public void setRecipientNumber(int number) throws Exception{

        int counter = 0;
        int copyNumber = number;

        while(copyNumber > 0){
            copyNumber /= 10;
            counter++;
        }

        if (counter != 10){
            throw new Exception("contact number must be 10 digits");
        }
        else {
            this.recipientContactNo = number;
        }
    }

    /**
     * 
     * @return recipientcontactNo instance variable
     */
    public int getRecipientNumber(){
        return this.recipientContactNo;
    }

    /**
     * overrides toString method to print all instance in a text for
     * @return a text containing sms information
     */
    @Override
    public String toString() {
        return "the recipient number is: " + getRecipientNumber() +
               "\nthe text is: " + super.getText();
    }
}
