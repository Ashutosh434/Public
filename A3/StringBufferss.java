package A3;

public class StringBufferss {
    public static void main(String[] args) {
//        String str = "String Buffer";
//        StringBuffer tmp = new StringBuffer();
//        tmp.append(str);
//        tmp.append(" is a peer class of string");
//        str = tmp.toString();
//        System.out.println(str);

        String str1 = "is used to _ at a specific index position";


        str1= str1.replaceAll("_", "insert text");
        StringBuffer tmp2 = new StringBuffer();
        tmp2.append(str1);
        System.out.println(tmp2);
    }



    }


