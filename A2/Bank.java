package A2;
import java.util.*;
public class Bank {
    int money_in_fixed = 60000;
    int money_in_current_account = 100000;
}
class SavingsAccount extends Bank{

    int saving_money(int fixed_deposit){
        System.out.println(fixed_deposit + money_in_fixed);
        return fixed_deposit+money_in_fixed;
    }
}
class CurrentAccount extends Bank{
    int current_money(int cash_credit){
        System.out.println(cash_credit + money_in_current_account );
        return cash_credit + money_in_current_account;
    }
}
