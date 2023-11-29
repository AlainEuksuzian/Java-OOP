public class BalanceBelowLimitException extends Exception{

    BalanceBelowLimitException(String message){
        super(message);
    }
    BalanceBelowLimitException(){
        super("balance cannot fall below 1000$");
    }
    
}
