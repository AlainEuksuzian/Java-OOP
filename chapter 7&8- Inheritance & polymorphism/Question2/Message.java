public class Message {

    private String text;

    Message(){}

    /**
     * constructor to assign parameter to instance variable and catch error from setText() method
     * @param txt
     */
    Message(String txt){
        try {
            setText(txt);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * assigns instance variable to parameter if condition met 
     * @param txtInput
     * @throws Exception if parameter is empty or space bar
     */
    public void setText(String txtInput) throws Exception {
        if (txtInput.isEmpty() || txtInput.equals(" ")){
            throw new Exception("text content cannot be empty");
        }
        else {
            this.text = txtInput;
        }
    }

    /**
     * @return text instance variable
     */
    public String getText(){
        return this.text;
    }
}
