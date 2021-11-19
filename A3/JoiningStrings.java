package A3;

public class JoiningStrings {
    public static void main(String[] args) {
        String str1 = "Hello ";
        String str2 = "How are you";
        String s = String.format("%s%s",str1,str2);
        System.out.println(s);
    }
}
