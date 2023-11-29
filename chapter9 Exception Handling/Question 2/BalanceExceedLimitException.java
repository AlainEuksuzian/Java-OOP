
public class BalanceExceedLimitException extends Exception {

    BalanceExceedLimitException(String message){
        super(message);
    }
    BalanceExceedLimitException(){
        super("balance cannot exceed 5000");
    }
} 