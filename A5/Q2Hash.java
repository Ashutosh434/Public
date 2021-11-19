package A5;

import java.util.HashMap;
import java.util.Scanner;

public class Q2Hash {
    public static void main(String[] args) {
        HashMap<Integer,Double> map=new HashMap<Integer,Double>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 10; i++){
            Integer a = sc.nextInt();
            Double b = sc.nextDouble();

            map.put(a,b);
            System.out.println(map.put(a,b));
        }
    }
}
