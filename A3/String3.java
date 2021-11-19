package A3;

import java.util.Locale;

public class String3 {
    public static void main(String args[])
{
    String str1 = " java string pool refers to the collection of Strings which are stored in heap memory";
    //a.
    // converting string s to lowercase letter
    String s1 = str1.toLowerCase();
    System.out.println(s1);

    //b
    String s2 = str1.toUpperCase();
    System.out.println(s2);

    //c
    String s3 = str1.replace("a", "$");
    System.out.println(s3);

    //d
    if (str1.contains("collection")){
        System.out.println("Our string contains 'collection'");
    }
    else {
        System.out.println("Our string does not contain 'collection'");
    }

    //e
    String str2 = "java string pool refers to the collection of strings which are stored in the heap memory";

    if(str1.equals(str2) ){
        System.out.println("Both strings str1 and str2 are equal");
    }
    else{
        System.out.println("Both strings str1 and str2 are different");
    }

    //f
    if(str1 == str2){
        System.out.println("Both strings str1 and str2 are equal");
    }
    else{
        System.out.println("Both strings str1 and str2 are different");
    }
}
}
