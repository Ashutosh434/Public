package A2;

import java.util.Scanner;

public class BankMain1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter money you want to add in fixed deposit : ");
        int fixed_deposit = sc.nextInt();

        System.out.print("Enter the money you want to add in saving : ");
        int cash_credit = sc.nextInt();

        SavingsAccount sa = new SavingsAccount();

        int fix = sa.saving_money(fixed_deposit);
        CurrentAccount ca = new CurrentAccount();
        int credit = ca.current_money(cash_credit);
        System.out.println("Total money in bank : " +(fix+credit));
    }
}
