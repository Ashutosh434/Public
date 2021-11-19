package A8;
import java.util.*;
import java.util.stream.IntStream;

public class Q6 {
    public static void main(String[] args) {
        List<String> list2 = Arrays.asList("justin", "nancy", "cooc", "amy", "david");
        IntStream.range(0, list2.size()).forEach(x ->
                list2.set(x, list2.get(x).toUpperCase()));
        System.out.println(list2);
    }
}
