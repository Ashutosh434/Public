package A4;

public class InsufficientBalanceException extends Throwable {
    String str3;
    InsufficientBalanceException(String str4){
        str3 = str4;
    }
    public String toString(){
        return ("InsufficientBalanceExceptionOccurred: "+str3);
    }
}
