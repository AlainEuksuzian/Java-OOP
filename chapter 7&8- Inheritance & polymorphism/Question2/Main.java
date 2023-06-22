
/*      PROGRAMMING PROBLEM:
 *
 * Define a class named Message that contains an instance variable of type String 
named text that stores any textual content for the Message. Create a method named 
toString that returns the text field and also include a method to set this value.

 Next, define a class for SMS that is derived from Message and includes instance 
variables for the recipientContactNo. Implement appropriate accessor and mutator methods. The body of the SMS message should be stored in the inherited 
variable text. Redefine the toString method to concatenate all text fields.

 Similarly, define a class for Email that is derived from Message and includes an 
instance variable for the sender, receiver, and subject. The textual contents of the 
file should be stored in the inherited variable text. Redefine the toString method 
to concatenate all text fields.

 Create sample objects of type Email and SMS in your main method. Test your 
objects.

Finally, include a method to encode the final message “This is Java” using an 
encoding scheme, according to which, each character should be replaced by the 
character that comes after it. For example, if the message contains character B or b, 
it should be replaced by C or c accordingly, while Z or z should be replaced with 
an A or a. If the final message is “This is Java”, then the encoded message should 
be “UijtjtKbwb”
 */


public class Main{
    public static void main(String[] args) {

        Message messageOne = new Message("tester hello how are you");
        Email emailOne = new Email("hi email tester", "alain", "jack", "intro");
        Sms smsOne = new Sms("This is Java", 1111111111);

       System.out.println(smsOne);  //works, prints tostring
       System.out.println(emailOne);  // works, prints tostring

        System.out.println(encoder(smsOne.getText())); //works, "this is java" becomes: "“UijtjtKbwb”"
    }


    /**
     * takes a String input and changes each letter to the letter following it alphabetically.
     * @param text
     * @return encodedOutput which is the parameter encoded
     */
    public static String encoder(String text){

        String encodedOutput = "";

        for (int i = 0; i < text.length(); i++){
            char character = text.charAt(i);
            if (character == ' '){
                continue;
            }
            else {
                character++;
                encodedOutput += character;
            }
        }
        return encodedOutput;
    }
}