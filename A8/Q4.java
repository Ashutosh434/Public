package A8;

import java.util.ArrayList;

public class Q4 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("aa");
        arr.add("bbc");
        arr.add("cc");
        arr.add("dd");

        arr.removeIf(n -> (n.length()%2 != 0));
        for (String i : arr){
            System.out.println(i);
        }
    }
}
