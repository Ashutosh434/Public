package A2;
import java.util.*;
public class CandyMain {

    public static void main(String[] args) {
        System.out.println("Enter 'o' if you are the owner and 'c' if you are a customer");
        int candy = 10000, cookie = 10000, iceCream = 10000;
        Scanner sc = new Scanner(System.in);
        String user = sc.next();

        // Creating objects of the subclasses

        Candy c1 = new Candy();
        Cookie c2 = new Cookie();
        IceCream c3 = new IceCream();

        // if user is customer

        if(user.equals("c")){
            System.out.println("What type of dessert do you want enter 'c' for candy, 'o' for cookie 'i' for ice cream ");
            String str2 = sc.next();
            // if user wants cookies
            if(str2.equals("c")){
                System.out.println("Amount of candies you want");
                int CandyCustomerWants = sc.nextInt();
                if(CandyCustomerWants < candy) {
                    System.out.println("Cost of the candies in Dollars : ");
                    double candyCost = c1.cost(CandyCustomerWants);
                    System.out.println(candyCost);
                    candy -= CandyCustomerWants;
                }
                else {
                    System.out.println("We don't have enough candies ");
                }
            }
            else if (str2.equals("o")){
                System.out.println("Amount of cookies you want : ");
                int CookiesCustomerWants = sc.nextInt();
                if (CookiesCustomerWants < cookie){
                    System.out.println("Cost of the cookies in Euros : ");
                    double cookieCost = c2.cost(CookiesCustomerWants);
                    System.out.println(cookieCost);
                    cookie -= CookiesCustomerWants;
                }
                else {
                    System.out.println("We don't have enough cookies ");
                }

            }
            else if(str2.equals("i")){
                System.out.println("Amount of ice cream's you want : ");
                int IceCreamCustomerWants = sc.nextInt();
                if (IceCreamCustomerWants < iceCream){
                    System.out.println("Cost of the cookies in rupees : ");
                    double iceCreamCost = c3.cost(IceCreamCustomerWants);
                    System.out.println(iceCreamCost);
                    iceCream -= IceCreamCustomerWants;
                }
                else {
                    System.out.println("We don't have enough ice creams ");
                }
            }
        }
        else{
            System.out.println("Enter the amount of Candy's, Cookie's, IceCream's you want to add in the shop: o");
            int c = sc.nextInt();
            int co = sc.nextInt();
            int ice = sc.nextInt();
            candy = candy + c;
            cookie = cookie + co;
            iceCream = iceCream + ice;

        }
    }


}
class DessertItem {
static double tax =  0.08;
}
class Candy extends DessertItem {
    static double  cost(int quantity){
        // 1 dollar is 60 rupees and a ice cream cost 2 rupees therefore cost of one ice cream is 0.03
        return  (quantity*0.03+(quantity*0.03*tax));
    }
}
class Cookie extends DessertItem {
    static double cost(int quantity){
        //1 euro is 70 rupees and a cookie cream cost 10 rupees therefore cost of one cookie is 0.14
        return (quantity*0.14+(quantity*0.14*tax));
    }
}
class IceCream extends DessertItem {
    static double cost(int quantity){
        return  (quantity*40+(quantity*40*tax));
    }
}
