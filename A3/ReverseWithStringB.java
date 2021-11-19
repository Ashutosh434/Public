package A3;

public class ReverseWithStringB {
    public static void main(String[] args) {
        StringBuffer sbf  = new StringBuffer("This method returns the reverse of object on which it was called ");
        System.out.println("String buffer : " + sbf);

        //Reversed string
        sbf.reverse();
        System.out.println("String buffer after reversing : " +sbf);
    }
}
