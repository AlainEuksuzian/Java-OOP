public class Email extends Message {

    private String sender, receiver, subject;

    Email(){}

    /**
     * Constructor to assign inherited instance and new instances
     * @param txt
     * @param sender
     * @param receiver
     * @param subject
     */
    Email(String txt, String sender, String receiver, String subject){
        super(txt);

        try {
            setSender(sender);
            setReceiver(receiver);
            setSubject(subject);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }

    /**
     * assigns parameter to sender instance if condition of not being empty is met
     * @param senderInput
     * @throws Exception if user inputs space bar or empty sender info
     */
    public void setSender(String senderInput) throws Exception{
        if (sender.isEmpty() || senderInput.equals(" ")){
            throw new Exception("sender cannot be left empty");
        }
        else {
            this.sender = senderInput;
        }
    }

    /**
     * 
     * @return sender instance
     */
    public String getSender(){
        return this.sender;
    }

    /**
     * sets receiver instance to parameter of method
     * @param receiverInput
     * @throws Exception if parameter empty
     */
    public void setReceiver(String receiverInput) throws Exception{

        if (receiverInput.isEmpty() || receiverInput.equals(" ")){
            throw new Exception("receiver cannot be left empty");
        }
        else {
            this.receiver = receiverInput;
        }
    }

    /**
     * assigns parameter to subject instance
     * @param subjectInput
     * @throws Exception
     */
    public void setSubject(String subjectInput) throws Exception{

        if (subjectInput.isEmpty() || subjectInput.equals(" ")){
            throw new Exception("subject cannot be left empty");
        }
        else {
            this.subject = subjectInput;
        }
    }

    /**
     * @return receiver instance
     */
    public String getReceiver(){
        return this.receiver;
    }

    /**
     * 
     * @return subject instance
     */
    public String getSubject(){
        return this.subject;
    }

    /**
     * returns all instances and explanation as a String output
     * @return String of all the instances both local and inherited
     */
    @Override
    public String toString() {
        return "the sender is " + getSender() + "\nthe receiver is: " + getReceiver() +
               "\nthe subject is: " + getSubject() + "\nthe text is: " + super.getText();
    }
    
}
