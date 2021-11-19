package A4;
import java.util.*;
public class ExHandling1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter two numbers ");
        int a  = sc.nextInt();
        int b = sc.nextInt();
        if (b == 0){
            try {
                System.out.println(a/b);   // throw exception
            }
            catch (ArithmeticException e){
                // Exception handler
                System.out.println("Divide by zero operation is not possible ");
            }
        }

    }
}
