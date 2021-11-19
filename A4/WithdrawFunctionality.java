package A4;
import javax.naming.InsufficientResourcesException;
import java.util.*;
import java.util.Scanner;
class DebitException
{
    public static void main(String args[])
    {
        Random rd = new Random();
        long ID  = rd.nextLong();
        double balance = 0, damount, wamount;

        Scanner sc = new Scanner(System.in);
        System.out.println("Deposit an amount");
        damount = sc.nextInt();
        balance += damount;

        Scanner wd = new Scanner(System.in);
        System.out.println("Withdraw an amount");
        wamount=wd.nextInt();
        balance -= wamount;


        if (damount < wamount )
        {
            try{
                System.out.println("you don't have thant much in your account yet");
                throw new InsufficientBalanceException(" Error message");
            } catch (InsufficientBalanceException er) {
                er.printStackTrace();
            }

        }
        else if(wamount < 0 ){
            try{
                System.out.println("Enter a positive value to withdraw money");
                throw new IllegalBankTransactionException(" Try again");
            } catch (IllegalBankTransactionException e) {
                e.printStackTrace();
            }
        }
        else
            System.out.println("Remaining balance for user id : "+ ID + " is "  + balance);
    }
}