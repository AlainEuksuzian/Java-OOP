
public class UnknownOperatorException extends Exception{

    UnknownOperatorException(String message){
        super(message);
    }

    UnknownOperatorException(){
        super("only +, -, * and / can be accepted, please try again");
    }
}