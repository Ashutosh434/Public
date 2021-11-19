package A8;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        input output_function = (int x) ->{
            if (x >= 10000)
            System.out.println("Order Status: Accepted");
            else {
                System.out.println("Order Not Accepted because your order value is less than 10000");
            }
            return 0;
        };
        System.out.println("Enter your order price : ");
        int x = sc.nextInt();

        System.out.println("Output" + output_function.in(x));
//

    }
    interface MyLambda {
        void foo();
    }
    interface input {
        int  in(int x);
    }
}
