package A4;

public class IllegalBankTransactionException extends Exception {
    String str1;

    IllegalBankTransactionException(String str2){
        str1 = str2;
    }
    public String toString(){
        return ("IllegalBankTransactionException Occurred: "+str1);
    }
}
