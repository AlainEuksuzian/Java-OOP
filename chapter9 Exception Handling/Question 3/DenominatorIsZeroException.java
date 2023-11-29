
public class DenominatorIsZeroException extends Exception {

    DenominatorIsZeroException(String message){
        super(message);
    }

    DenominatorIsZeroException(){
        super("denominator cannot be zero");
    }

}