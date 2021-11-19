package A6;

import java.util.HashSet;
import java.util.Iterator;

public class Q2HashSet {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet();
        hs.add("Product1");
        hs.add("Product2");
        hs.add("Product3");
        hs.add("Product4");
        hs.add("Product5");
        hs.add("Product6");
        hs.add("Product7");
        hs.add("Product8");
        hs.add("Product9");
        hs.add("Product10");
        //Duplicate Value
        hs.add("Product10");

        Iterator<String> i=hs.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

    }
}
