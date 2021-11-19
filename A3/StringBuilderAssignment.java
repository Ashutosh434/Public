package A3;

public class StringBuilderAssignment {
    public static void main(String[] args) {
        //1
        StringBuilder s1 = new StringBuilder("String Buffer");
        StringBuilder s2 = new StringBuilder(" is a peer class of String");
        StringBuilder s3 = new StringBuilder(" that provides much of");
        StringBuilder s4 = new StringBuilder(" the functionality of strings");
        StringBuilder s = s1.append(s2).append(s3).append(s4);
        System.out.println(s);

        //2

        StringBuilder ss = new StringBuilder("it is used to _ at the specified index position");
             ss = ss.replace(14,15 ,"insert text");
        System.out.println(ss);

        ss.reverse();
        System.out.print("Reversed string : " +ss);
    }
}
